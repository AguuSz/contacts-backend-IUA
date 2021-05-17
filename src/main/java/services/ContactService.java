package main.java.services;

import main.java.interfaces.IContactService;
import main.java.models.Contact;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import main.java.models.Email;
import main.java.utils.MyUtils;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

class ContactService implements IContactService {
    private String filename;

    public ContactService(String filename) {
        this.filename = filename;
    }

    // -------------------------------------------- Seccion create --------------------------------------------

    // Guarda los contactos dados en un JSON
    public void saveContacts(Contact[] contacts) {

        for (Contact contact : contacts) {
            if (!areValidFields(contact)) {
                // Si no valida alguno, que tire error
                System.out.println("Algunos datos no pasaron la validacion. Reviselos e intente de nuevo");
                return;
            }
        }

        try (FileWriter writer = new FileWriter(filename)) {
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            gson.toJson(contacts, writer);
            System.out.println("Se han guardado correctamente!");
        } catch (IOException e) {
            System.out.println("Se ha producido un error, y no se han guardado los datos..");
        }

    }

    // Agrega un array de contactos
    public void addContacts(Contact[] contacts) {
        try {
            Contact[] existingContacts = getContacts();
            int newIndex = contacts.length + existingContacts.length;
            Contact[] newContactList = new Contact[newIndex];
            int actualIndex = 0;

            // Genero un bucle for para recorrer ambos arrays, y que la combinacion de ambos comformen a newContactList

            for (int i = 0; i < newIndex; i++) {
                for (int j = 0; j < existingContacts.length; j++) {
                    newContactList[j] = existingContacts[j];
                    actualIndex = j + 1;
                }

                int index = 0;
                for (int j = actualIndex; j < newIndex; j++) {
                    newContactList[j] = contacts[index];
                    index++;
                }
            }

            // Se guarda la combinacion de ambas listas en el txt
            saveContacts(newContactList);
        } catch (NullPointerException e) {
            saveContacts(contacts);
        }
    }

    // Agrega un solo contacto
    public void addContact(Contact contact) {
        Contact[] contacts = new Contact[]{contact};
        addContacts(contacts);
    }

    // -------------------------------------------- Seccion Read --------------------------------------------

    // Devuelve la lista de Contactos guardados en una JSON String
    public Contact[] getContacts() {
        return new Gson().fromJson(getJsonContentFromFile(filename), Contact[].class);
    }

    // Busca en la DB un ID y devuelve el contacto, y sino null
    public Contact findById(String id) {
        Contact[] contacts = getContacts();

        try {
            for (Contact contact : contacts) {
                if (contact.getId().equals(id)) {
                    return contact;
                }
            }

            return null;
        } catch (NullPointerException e) {
            MyUtils.printNoUsersInDB();
            return null;
        }
    }

    // Busca en la DB un nombre y devuelve la lista de contactos que contengan dichos caracteres.
    public Contact[] findContactsByName(String name) {
        Contact[] contacts = getContacts();
        List<Contact> contactsWithThatNameList = new ArrayList<Contact>();

        try {
            for (Contact contact : contacts) {
                if (contact.getName().toLowerCase().contains(name.toLowerCase())) {
                    // Significa que este contacto tiene parte del nombre ingresado
                    contactsWithThatNameList.add(contact);
                }
            }

            return convertContactListToArray(contactsWithThatNameList);
        } catch (NullPointerException e) {
            MyUtils.printNoUsersInDB();
            return null;
        }
    }

    // Busca en la DB un correo y devuelve la lista de contactos que contengan dichos caracteres.
    public Contact[] findContactsByEmail(String email) {
        Contact[] contacts = getContacts();
        List<Contact> contactsWithThatEmail = new ArrayList<Contact>();

        try {
            for (Contact contact : contacts) {
                for (int j = 0; j < contact.getEmails().size(); j++) {
                    if (contact.getEmails().get(j).getMail().toLowerCase().contains(email.toLowerCase())) {
                        contactsWithThatEmail.add(contact);
                    }
                }
            }

            return convertContactListToArray(contactsWithThatEmail);
        } catch (NullPointerException e) {
            MyUtils.printNoUsersInDB();
            return null;
        }
    }

    // Busca en la DB un tag y devuelve la lista de contactos que contengan dichos tags.
    public Contact[] findContactsByTag(String tag) {
        Contact[] contacts = getContacts();
        List<Contact> contactsWithThatTagList = new ArrayList<Contact>();

        try {
            for (Contact contact : contacts) {
                for (int j = 0; j < contact.getTags().size(); j++) {
                    if (contact.getTags().get(j).getName().toLowerCase().contains(tag.toLowerCase().trim())) {
                        contactsWithThatTagList.add(contact);
                    }
                }
            }

            return convertContactListToArray(contactsWithThatTagList);
        } catch (NullPointerException e) {
            MyUtils.printNoUsersInDB();
            return null;
        }
    }

    // -------------------------------------------- Seccion update --------------------------------------------

    // Actualiza un contacto en base a un id dado.
    public void updateContact(String id, Contact updatedContact) {
        if (updatedContact == null) return;
        Contact[] contacts = getContacts();
        boolean updated = false;

        try {
            for (int i = 0; i < contacts.length; i++) {
                if (contacts[i].getId().equals(id)) {
                    contacts[i] = updatedContact;
                    updated = true;
                }
            }

            if (updated) {
                saveContacts(contacts);
            } else {
                System.out.println("No se ha encontrado el contacto con ese ID. Intentelo de nuevo");
            }

        } catch (NullPointerException e) {
            System.out.println("No hay ningun contacto en la base. Generelos primero");
        }
    }

    // -------------------------------------------- Seccion delete --------------------------------------------

    // Elimina un contacto en base a un ID dado.
    public void deleteContact(String id) {
        Contact[] contacts = getContacts();
        List<Contact> newContactList = new ArrayList<Contact>();
        boolean found = false;

        try {
            for (Contact contact : contacts) {
                // Vamos a crear un nuevo array con todos los contactos exceptuando el del id pasado por parametro.
                if (!contact.getId().equals(id)) {
                    newContactList.add(contact);
                } else {
                    System.out.println("Se ha encontrado el contacto. Eliminando....");
                    found = true;
                }
            }
            if (found) {
                // Guardamos en la DB los contactos nuevos
                saveContacts(convertContactListToArray(newContactList));
            } else {
                System.out.println("No se ha encontrado el contacto con dicho ID. Intente de nuevo.");
            }
        } catch (NullPointerException e) {
            System.out.println("El archivo se encuentra vacio. Intente generar primero algunos contactos!");
        }
    }

    // -------------------------------------------- Seccion utilidades --------------------------------------------

    // Convierte una lista dinamica pasada por parametro, en un Array
    private Contact[] convertContactListToArray(List<Contact> contactsLists) {
        Contact[] contactsArray = new Contact[contactsLists.size()];
        for (int i = 0; i < contactsLists.size(); i++) {
            contactsArray[i] = contactsLists.get(i);
        }

        return contactsArray;
    }

    // Imprime la lista de contactos guardada en el archivo
    public void printAllContacts() {
        Contact[] contactsToPrint = getContacts();

        try {
            // Si la longitud del array es 0, entonces que me tire que no hay nada asi lo trabajo en el catch
            if (contactsToPrint.length == 0) throw new NullPointerException();
            for (int i = 0; i < contactsToPrint.length; i++) {
                System.out.println("=========================================");
                System.out.println("Contacto N: " + (i + 1));
                System.out.println(contactsToPrint[i].getBriefContact());
                System.out.println("=========================================");
            }
        } catch (NullPointerException e) {
            MyUtils.printNoUsersInDB();
        }
    }

    public void printAListOfContacts(Contact[] contacts) {
        try {
            // Si la longitud del array es 0, entonces que me tire que no hay nada asi lo trabajo en el catch
            if (contacts.length == 0) throw new NullPointerException();
            for (int i = 0; i < contacts.length; i++) {
                System.out.println("=========================================");
                System.out.println("Contacto N: " + (i + 1));
                System.out.println(contacts[i].getBriefContact());
                System.out.println("=========================================");
            }
        } catch (NullPointerException e) {
            System.out.println("No se han encontrado usuarios");
        }
    }

    // Imprime los contactos dados por parametro con mayor detalle
    public void printAllContactsDetailed() {
        Contact[] contactsToPrint = getContacts();

        try {
            // Si la longitud del array es 0, entonces que me tire que no hay nada asi lo trabajo en el catch
            if (contactsToPrint.length == 0) throw new NullPointerException();
            for (int i = 0; i < contactsToPrint.length; i++) {
                System.out.println("=========================================");
                System.out.println("Contacto N: " + (i + 1));
                System.out.println(contactsToPrint[i]);
                System.out.println("=========================================");
            }
        } catch (NullPointerException e) {
            MyUtils.printNoUsersInDB();
        }
    }

    // Imprime un solo contacto de manera mas detallada
    public void printSingleContact(String id) {
        if (isUserInDB(id)) {
            System.out.println("=========================================");
            System.out.println("ID: " + id);
            System.out.println(findById(id));
            System.out.println("=========================================");
        }
    }

    // -------------------------------------------- Seccion funciones privadas --------------------------------------------

    // Revisa si usuario esta en la DB. Devuelve true si esta, false si no.
    private boolean isUserInDB(String id) {
        Contact[] contacts = getContacts();
        try {
            for (Contact contact : contacts) {
                if (contact.getId().equals(id)) {
                    return true;
                }
            }
            System.out.println("Usuario no encontrado...");
            return false;
        } catch (NullPointerException e) {
            MyUtils.printNoUsersInDB();
            return false;
        }
    }

    // Devuelve el contenido del archivo json en una string para luego ser leida por el Gson
    private String getJsonContentFromFile(String filename) {
        try {
            FileReader reader = new FileReader(filename);
            int character;
            StringBuilder jsonFile = new StringBuilder();

            // While encuentre algun caracter
            while ((character = reader.read()) != -1) {
                jsonFile.append((char) character);
            }

            reader.close();

            return jsonFile.toString();

        } catch (IOException e) {
            System.out.println("El archivo no existe. Generelo primero.");
            return null;
        }
    }

    // Realiza una validacion de campos basica
    public boolean areValidFields(Contact contact) {
        try {
            if (contact.getName().trim().length()            == 0) return false;
            if (contact.getSurname().trim().length()         == 0) return false;
            if (contact.getNickname().trim().length()             == 0) return false;
            if (contact.getCity().trim().length()            == 0) return false;
            if (contact.getProvince().trim().length()         == 0) return false;

            for (Email email : contact.getEmails()) {
                if (email.getMail().trim().length() == 0) return false;
                if (!email.getMail().contains("@") || !email.getMail().contains(".")) return false;
            }

            // En caso de que verifique los campos...
            return true;
        } catch (Exception e) {
            System.out.println("Alguno de los parametros no ha pasado la validacion. Intente de nuevo!");
            return false;
        }
    }

    // Valida si un url dada cumple los requisitos
    public boolean isAValidUrl(String url) {
        try {
            new URI(url).parseServerAuthority();
            return true;
        } catch (URISyntaxException e) {
            // No es una url valida
            return false;
        }
    }
}

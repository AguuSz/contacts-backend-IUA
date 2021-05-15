package main.java.interfaces;

import main.java.models.Contact;
import main.java.models.Email;

public interface IContactService {
    // -------------------------------------------- Seccion create --------------------------------------------

    // Guarda los contactos dados en un JSON
    public void saveContacts(Contact[] contacts);

    // Agrega un array de contactos al archivo JSON
    public void addContacts(Contact[] contacts);

    // Agrega un solo contacto al archivo JSON
    public void addContact(Contact contact);

    // -------------------------------------------- Seccion Read --------------------------------------------

    // Devuelve la lista de Contactos guardados en un archivo JSON
    public Contact[] getContacts();

    // Busca en la DB un ID y devuelve el contacto, y sino null
    public Contact findById(String id);

    // Busca en la DB un nombre y devuelve la lista de contactos que contengan dichos caracteres.
    public Contact[] findContactsByName(String name);

    // Busca en la DB un correo y devuelve la lista de contactos que contengan dichos caracteres.
    public Contact[] findContactsByEmail(String email);

    // Busca en la DB un tag y devuelve la lista de contactos que contengan dichos tags.
    public Contact[] findContactsByTag(String tag);

    // -------------------------------------------- Seccion update --------------------------------------------

    // Actualiza un contacto en base a un id dado.
    public void updateContact(String id, Contact updatedContact);

    // -------------------------------------------- Seccion delete --------------------------------------------

    // Elimina un contacto en base a un ID dado.
    public void deleteContact(String id);

    // -------------------------------------------- Seccion utilidades --------------------------------------------

    // Imprime la lista de contactos guardada en el archivo
    public void printAllContacts();

    // Imprime los contactos dados por parametro con mayor detalle
    public void printAllContactsDetailed();

    // Imprime un solo contacto de manera mas detallada
    public void printSingleContact(String id);

    // Realiza una validacion de campos basica
    public boolean areValidFields(Contact contact);

    // Valida si un url dada cumple los requisitos
    public boolean isAValidUrl(String url);

}
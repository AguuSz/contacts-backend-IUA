package main.java;

import main.java.models.*;
import main.java.services.ContactService;
import main.java.utils.MyUtils;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // Contacto service -> Clase responsable de las interacciones con la DB
        ContactService contactService = new ContactService();
        RandomContacts randomContactsService = new RandomContacts();
        Scanner scanner = new Scanner(System.in);
        int option;
        boolean exit = false;

        while (!exit) {
            System.out.println("******************** Bienvenido! Que desea hacer? ********************");
            System.out.println("\t 1) Generar contactos.");
            System.out.println("\t 2) Agregar un nuevo contacto.");
            System.out.println("\t 3) Listar todos los contactos registrados.");
            System.out.println("\t 4) Ver detalles de un contacto.");
            System.out.println("\t 5) Buscar contactos por nombre.");
            System.out.println("\t 6) Buscar contactos por correo.");
            System.out.println("\t 7) Buscar contactos por tag.");
            System.out.println("\t 8) Actualizar un contacto.");
            System.out.println("\t 9) Eliminar un contacto.");
            System.out.println("\t 0) Salir");
            System.out.println("*********************************************************************");
            System.out.println();
            System.out.print("Opcion: ");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.print("Cuantos contactos desea generar: ");
                    int amount = scanner.nextInt();
                    Contact[] contacts = randomContactsService.generateContacts(amount);
                    contactService.saveContacts(contacts);
                    break;
                case 2:
                    Contact newContact = randomContactsService.generateContact();
                    contactService.addContact(newContact);
                    break;
                case 3:
                    contactService.printAllContacts();
                    break;
                case 4:
                    System.out.print("Ingrese el ID de la persona a detallar: ");
                    String idToDetail = scanner.next();
                    contactService.printSingleContact(idToDetail);
                    break;
                case 5:
                    System.out.print("Ingrese el nombre que desea buscar: ");
                    String nameToSearch = scanner.next().trim();
                    Contact[] contactsFoundByName = contactService.findContactsByName(nameToSearch);
                    contactService.printAListOfContacts(contactsFoundByName);
                    break;
                case 6:
                    System.out.print("Ingrese el correo que desea buscar: ");
                    String emailToSearch = scanner.next().trim();
                    Contact[] contactsFoundByEmail = contactService.findContactsByEmail(emailToSearch);
                    contactService.printAListOfContacts(contactsFoundByEmail);
                    break;
                case 7:
                    System.out.print("Ingrese el tag que desea buscar: ");
                    String tagToSearch = scanner.next().trim();
                    Contact[] contactsFoundByTag = contactService.findContactsByTag(tagToSearch);
                    contactService.printAListOfContacts(contactsFoundByTag);
                    break;
                case 8:
                    System.out.print("Ingrese el ID de la persona a actualizar: ");
                    String idToSearch = scanner.next();
                    contactService.updateContact(idToSearch, updateContact(contactService.findById(idToSearch)));
                    break;
                case 9:
                    System.out.print("Ingrese el ID del contacto a eliminar: ");
                    String idToDelete = scanner.next();
                    contactService.deleteContact(idToDelete);
                    break;
                case 0:
                    exit = true;
                    break;
                default:
                    System.out.println("Opcion no contemplada...");
                    break;
            }

        }
        scanner.close();

    }

    public static Contact updateContact(Contact originalContact) {
        System.out.print("Nombre (requerido): ");
        String tempField = MyUtils.processInput();
        if (tempField != null) {
            if (!tempField.equals(originalContact.getName())) originalContact.setName(tempField);
        }

        System.out.print("Apellido (requerido): ");
        tempField = MyUtils.processInput();
        if (tempField != null) {
            if (!tempField.equals(originalContact.getSurname())) originalContact.setSurname(tempField);
        }

        System.out.print("Apodo (requerido): ");
        tempField = MyUtils.processInput();
        if (tempField != null) {
            if (!tempField.equals(originalContact.getNickname())) originalContact.setNickname(tempField);
        }

        System.out.print("Pais (requerido): ");
        tempField = MyUtils.processInput();
        if (tempField != null) {
            Country country = new Country(tempField);
            originalContact.setCountry(country);
        }

        System.out.print("Provincia (requerido): ");
        tempField = MyUtils.processInput();
        if (tempField != null) {
            if (!tempField.equals(originalContact.getProvince())) originalContact.setProvince(MyUtils.processInput());
        }

        System.out.print("Ciudad (requerido): ");
        tempField = MyUtils.processInput();
        if (tempField != null) {
            if (!tempField.equals(originalContact.getCity())) originalContact.setCity(MyUtils.processInput());
        }

        System.out.print("Codigo postal: ");
        tempField = MyUtils.processInput();
        if (tempField != null) {
            if (!tempField.equals(originalContact.getZipCode())) originalContact.setZipCode(MyUtils.processInput());
        }

        System.out.print("Prefijo: ");
        tempField = MyUtils.processInput();
        if (tempField != null) {
            if (!tempField.equals(originalContact.getPreffix())) originalContact.setPreffix(tempField);
        }

        System.out.print("Sufijo: ");
        tempField = MyUtils.processInput();
        if (tempField != null) {
            if (!tempField.equals(originalContact.getSuffix())) originalContact.setSuffix(tempField);
        }

        System.out.print("Empresa: ");
        tempField = MyUtils.processInput();
        if (tempField != null) {
            if (!tempField.equals(originalContact.getCompany())) originalContact.setCompany(tempField);
        }

        System.out.print("Puesto de trabajo: ");
        tempField = MyUtils.processInput();
        if (tempField != null) {
            if (!tempField.equals(originalContact.getJobPosition())) originalContact.setJobPosition(tempField);
        }

        System.out.print("Departamento: ");
        tempField = MyUtils.processInput();
        if (tempField != null) {
            if (!tempField.equals(originalContact.getDepartment())) originalContact.setDepartment(tempField);
        }

        System.out.print("Fecha de nacimiento: ");
        tempField = MyUtils.processInput();
        if (tempField != null) {
            if (!tempField.equals(originalContact.getBirthDate())) originalContact.setBirthDate(tempField);
        }

        if (ContactService.validateFields(originalContact)) return originalContact;
        System.out.println("Algunos datos no han pasado la validacion.. Intente de nuevo.");
        return null;
    }
}
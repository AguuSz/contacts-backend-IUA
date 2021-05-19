package main.java.services;

import main.java.interfaces.IContactService;

public class ContactFactory {
    public static IContactService buildContactService(String filename){
        return new ContactService(filename);
    }

}


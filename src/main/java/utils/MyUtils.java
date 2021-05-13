package main.java.utils;

import java.util.Scanner;

public class MyUtils {

    public static void printNoUsersInDB() {
        System.out.println("No hay ningun usuario en la base de datos. Intente generar algunos primero!");
    }

    public static String processInput() {
        Scanner tempScanner = new Scanner(System.in);
        String input = tempScanner.nextLine();
        if (!input.trim().equals("")) {
            return input;
        } else {
            return null;
        }
    }

}

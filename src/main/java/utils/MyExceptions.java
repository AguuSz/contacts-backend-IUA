package main.java.utils;

public class MyExceptions {

    public static void nullArgument(String argument) {
        throw new IllegalArgumentException("El argumento: " + argument + " no puede ser null.");
    }

    public static void nullArgument() {
        throw new IllegalArgumentException("Este campo no puede ser null.");
    }
}

package main.java.models;

import main.java.utils.MyExceptions;

public class Phone {
    private Country country;
    private String tag;
    private String phoneNumber;
    private String fullNumber;

    public Phone(Country country, String phoneNumber) {
        try {
            if (country == null) MyExceptions.nullArgument("country");
            this.country = country;
            this.phoneNumber = phoneNumber;
            this.tag = "Sin definir";
            this.fullNumber = "+" + country.getPreffix() + phoneNumber;
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public Phone(Country country, String phoneNumber, String tag) {
        try {
            if (country == null) MyExceptions.nullArgument("country");
            this.country = country;
            this.phoneNumber = phoneNumber;
            this.tag = tag;
            this.fullNumber = "+" + country.getPreffix() + phoneNumber;
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        if (country == null) MyExceptions.nullArgument();
        this.country = country;
    }

    public String getTag() {
        return this.tag;
    }

    public void setTag(String tag) {
        if (tag == null) MyExceptions.nullArgument("tag");
        this.tag = tag;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setPhoneNumber(String phone) {
        if (country == null) MyExceptions.nullArgument();
        this.phoneNumber = phone;
    }

    @Override
    public String toString() {
        return "\n\t{" + "\n" +
                "\t\t" + "country: " + this.country + "\n" +
                "\t\t" + "tag: " + this.tag + "\n" +
                "\t\t" + "phoneNumber: " + this.phoneNumber + "\n" +
                "\t\t" + "fullNumber: " + this.fullNumber + "\n" +
                "\t}";
    }
}

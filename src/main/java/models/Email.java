package main.java.models;

public class Email {
    private String email;
    private String tag = "Sin definir";

    public Email() {
        this.email = null;
    }

    public Email(String email, String tag) {
        this.email = email;
        this.tag = tag;
    }

    public Email(String email) {
        this.email = email;
    }

    public String getMail() {
        return email;
    }

    public void setMail(String email) {
        this.email = email;
    }

    public String getTag() {
        return this.tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    @Override
    public String toString() {
        return "\n\tcorreo: " +  this.email + "\n" +
                "\t tag: " + this.tag;
    }
}

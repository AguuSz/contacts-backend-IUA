package main.java.models;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

public class Contact {
    private String id;
    private String prefix;
    private String name;
    private String surname;
    private String sufix;
    private String nickname;
    private String saveAs;
    private String business;
    private String job;
    private String department;
    private Country country;
    private String homeAdress2;
    private String postalCode;
    private String city;
    private String province;
    private String dateOfBirth;

    // Atributos lista
    private List<Tag> tags = new ArrayList<Tag>();
    private List<Email> correos = new ArrayList<Email>();
    private List<Phone> phones = new ArrayList<Phone>();


    public Contact() {
        this.id                                     = UUID.randomUUID().toString();
        this.prefix = null;
        this.name = null;
        this.surname = null;
        this.sufix = null;
        this.nickname = null;
        this.saveAs = null;
        this.business = null;
        this.job = null;
        this.department = null;
        this.country = null;
        this.postalCode = null;
        this.homeAdress2 = null;
        this.city = null;
        this.province = null;
        this.dateOfBirth = null;
    }

    // -------------------------------------------- Getters y setters --------------------------------------------

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSufix() {
        return sufix;
    }

    public void setSufix(String sufix) {
        this.sufix = sufix;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getSaveAs() {
        return saveAs;
    }

    public void setSaveAs(String saveAs) {
        this.saveAs = saveAs;
    }

    public String getBusiness() {
        return business;
    }

    public void setBusiness(String business) {
        this.business = business;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public String getHomeAdress2() {
        return homeAdress2;
    }

    public void setHomeAdress2(String homeAdress2) {
        this.homeAdress2 = homeAdress2;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    // -------------------------------------------- Comienzo atributos lista --------------------------------------------
    public List<Email> getCorreos() {
        return correos;
    }

    public Email getCorreoByAddress(String address) {
        for(Email email : this.correos) {
            if (email.getMail().equals(address)) {
                // Este correo hay que devolver
                return email;
            }
        }
        return null;
    }

    public void setCorreos(List<Email> correos) {
        this.correos = correos;
    }

    public void addCorreo(Email email) {
        this.correos.add(email);
    }

    public List<Phone> getPhones() {
        return phones;
    }

    public Phone getPhoneByNumber(String phoneNumber) {
        for (Phone phone : phones) {
            if (phone.getPhoneNumber().equals(phoneNumber)) {
                // Es el telefono adecuado
                return phone;
            }
        }

        return null;
    }

    public void setPhones(List<Phone> phones) {
        this.phones = phones;
    }

    public void addPhone(Phone phone) {
        this.phones.add(phone);
    }

    public List<Tag> getTags() {
        return tags;
    }

    public Tag getTagByName(String tag) {
        for(Tag tagTemp : this.tags) {
            if (tagTemp.getName().equals(tag)) {
                // Este correo hay que devolver
                return tagTemp;
            }
        }
        return null;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    public void addTag(Tag tag) {
        this.tags.add(tag);
    }

    // -------------------------------------------- Utilidades contacto --------------------------------------------
    public String getBriefContact() {
        return  "\tid: " + id + "\n" +
                "\tnombre: " + name + "\n" +
                "\tapellidos: " + surname + "\n" +
                "\tpais: " + country.briefToString() + "\n" +
                "\ttelefonos registrados: " + phones.size() + "\n" +
                "\tcorreos registrados: " + correos.size() + "\n" +
                "\ttags registrados: " + tags + "\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contact contact = (Contact) o;
        return Objects.equals(id, contact.id) && Objects.equals(prefix, contact.prefix) && Objects.equals(name, contact.name) && Objects.equals(surname, contact.surname) && Objects.equals(sufix, contact.sufix) && Objects.equals(nickname, contact.nickname) && Objects.equals(saveAs, contact.saveAs) && Objects.equals(business, contact.business) && Objects.equals(job, contact.job) && Objects.equals(department, contact.department) && Objects.equals(country, contact.country) && Objects.equals(homeAdress2, contact.homeAdress2) && Objects.equals(postalCode, contact.postalCode) && Objects.equals(city, contact.city) && Objects.equals(province, contact.province) && Objects.equals(dateOfBirth, contact.dateOfBirth) && Objects.equals(tags, contact.tags) && Objects.equals(correos, contact.correos) && Objects.equals(phones, contact.phones);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, prefix, name, surname, sufix, nickname, saveAs, business, job, department, country, homeAdress2, postalCode, city, province, dateOfBirth, tags, correos, phones);
    }

    @Override
    public String toString() {
        return  "\tid: " + id + "\n" +
                "\tprefijo: " + prefix + "\n" +
                "\tnombre: " + name + "\n" +
                "\tapellidos: " + surname + "\n" +
                "\tsufijo: " + sufix + "\n" +
                "\tapodo: " + nickname + "\n" +
                "\tarchivarComo: " + saveAs + "\n" +
                "\tempresa: " + business + "\n" +
                "\tpuestoDeTrabajo: " + job + "\n" +
                "\tdepartamento: " + department + "\n" +
                "\tpais: " + country + "\n" +
                "\tciudad: " + city + "\n" +
                "\tprovincia: " + province + "\n" +
                "\tlineaDeDireccion2: " + homeAdress2 + "\n" +
                "\tcodigoPostal: " + postalCode + "\n" +
                "\ttelefonos: " + phones + "\n" +
                "\tcorreos: " + correos + "\n";

    }
}

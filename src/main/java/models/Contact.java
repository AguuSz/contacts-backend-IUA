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
    private String suffix;
    private String nickname;
    private String saveAs;
    private String company;
    private String jobPosition;
    private String department;
    private Country country;
    private String secondAdress;
    private String zipCode;
    private String city;
    private String province;
    private String birthDate;

    // Atributos lista
    private List<Tag> tags = new ArrayList<Tag>();
    private List<Email> emails = new ArrayList<Email>();
    private List<Phone> phones = new ArrayList<Phone>();


    public Contact() {
        this.id                                     = UUID.randomUUID().toString();
        this.prefix = null;
        this.name                                   = null;
        this.surname                                = null;
        this.suffix                                 = null;
        this.nickname                               = null;
        this.saveAs                                 = null;
        this.company                                = null;
        this.jobPosition                            = null;
        this.department                             = null;
        this.country                                = null;
        this.zipCode                                = null;
        this.secondAdress                           = null;
        this.city                                   = null;
        this.province                               = null;
        this.birthDate                              = null;
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

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
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

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getJobPosition() {
        return jobPosition;
    }

    public void setJobPosition(String jobPosition) {
        this.jobPosition = jobPosition;
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

    public String getSecondAdress() {
        return secondAdress;
    }

    public void setSecondAdress(String secondAdress) {
        this.secondAdress = secondAdress;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
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

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    // -------------------------------------------- Comienzo atributos lista --------------------------------------------
    public List<Email> getEmails() {
        return emails;
    }

    public Email getCorreoByAddress(String address) {
        for(Email email : this.emails) {
            if (email.getMail().equals(address)) {
                // Este correo hay que devolver
                return email;
            }
        }
        return null;
    }

    public void setEmails(List<Email> emails) {
        this.emails = emails;
    }

    public void addCorreo(Email email) {
        this.emails.add(email);
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
                "\tname: " + name + "\n" +
                "\tsurname: " + surname + "\n" +
                "\tcountry: " + country.briefToString() + "\n" +
                "\ttelefonos registrados: " + phones.size() + "\n" +
                "\temails registrados: " + emails.size() + "\n" +
                "\ttags registrados: " + tags + "\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contact contact = (Contact) o;
        return Objects.equals(id, contact.id) && Objects.equals(prefix, contact.prefix) && Objects.equals(name, contact.name) && Objects.equals(surname, contact.surname) && Objects.equals(suffix, contact.suffix) && Objects.equals(nickname, contact.nickname) && Objects.equals(saveAs, contact.saveAs) && Objects.equals(company, contact.company) && Objects.equals(jobPosition, contact.jobPosition) && Objects.equals(department, contact.department) && Objects.equals(country, contact.country) && Objects.equals(secondAdress, contact.secondAdress) && Objects.equals(zipCode, contact.zipCode) && Objects.equals(city, contact.city) && Objects.equals(province, contact.province) && Objects.equals(birthDate, contact.birthDate) && Objects.equals(tags, contact.tags) && Objects.equals(emails, contact.emails) && Objects.equals(phones, contact.phones);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, prefix, name, surname, suffix, nickname, saveAs, company, jobPosition, department, country, secondAdress, zipCode, city, province, birthDate, tags, emails, phones);
    }

    @Override
    public String toString() {
        return  "\tid: " + id + "\n" +
                "\tpreffix: " + prefix + "\n" +
                "\tname: " + name + "\n" +
                "\tsurname: " + surname + "\n" +
                "\tsuffix: " + suffix + "\n" +
                "\tnickname: " + nickname + "\n" +
                "\tsaveAs: " + saveAs + "\n" +
                "\tcompany: " + company + "\n" +
                "\tjobPosition: " + jobPosition + "\n" +
                "\tdepartment: " + department + "\n" +
                "\tcountry: " + country + "\n" +
                "\tcity: " + city + "\n" +
                "\tprovince: " + province + "\n" +
                "\tsecondAdress: " + secondAdress + "\n" +
                "\tzipCode: " + zipCode + "\n" +
                "\ttelefonos: " + phones + "\n" +
                "\temails: " + emails + "\n";

    }
}

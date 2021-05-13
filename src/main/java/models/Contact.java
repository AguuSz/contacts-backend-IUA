package main.java.models;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

public class Contact {
    private String id;
    private String prefijo;
    private String nombre;
    private String apellidos;
    private String sufijo;
    private String apodo;
    private String archivarComo;
    private String empresa;
    private String puestoDeTrabajo;
    private String departamento;
    private Country pais;
    private String lineaDeDireccion2;
    private String codigoPostal;
    private String ciudad;
    private String provincia;
    private String fechaDeNacimiento;

    // Atributos lista
    private List<Tag> tags = new ArrayList<Tag>();
    private List<Email> correos = new ArrayList<Email>();
    private List<Phone> phones = new ArrayList<Phone>();


    public Contact() {
        this.id                                     = UUID.randomUUID().toString();
        this.prefijo                                = null;
        this.nombre                                 = null;
        this.apellidos                              = null;
        this.sufijo                                 = null;
        this.apodo                                  = null;
        this.archivarComo                           = null;
        this.empresa                                = null;
        this.puestoDeTrabajo                        = null;
        this.departamento                           = null;
        this.pais                                   = null;
        this.codigoPostal                           = null;
        this.lineaDeDireccion2                      = null;
        this.ciudad                                 = null;
        this.provincia                              = null;
        this.fechaDeNacimiento                      = null;
    }

    // -------------------------------------------- Getters y setters --------------------------------------------

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPrefijo() {
        return prefijo;
    }

    public void setPrefijo(String prefijo) {
        this.prefijo = prefijo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getSufijo() {
        return sufijo;
    }

    public void setSufijo(String sufijo) {
        this.sufijo = sufijo;
    }

    public String getApodo() {
        return apodo;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    public String getArchivarComo() {
        return archivarComo;
    }

    public void setArchivarComo(String archivarComo) {
        this.archivarComo = archivarComo;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getPuestoDeTrabajo() {
        return puestoDeTrabajo;
    }

    public void setPuestoDeTrabajo(String puestoDeTrabajo) {
        this.puestoDeTrabajo = puestoDeTrabajo;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public Country getPais() {
        return pais;
    }

    public void setPais(Country pais) {
        this.pais = pais;
    }

    public String getLineaDeDireccion2() {
        return lineaDeDireccion2;
    }

    public void setLineaDeDireccion2(String lineaDeDireccion2) {
        this.lineaDeDireccion2 = lineaDeDireccion2;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(String fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
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
                "\tnombre: " + nombre + "\n" +
                "\tapellidos: " + apellidos + "\n" +
                "\tpais: " + pais.briefToString() + "\n" +
                "\ttelefonos registrados: " + phones.size() + "\n" +
                "\tcorreos registrados: " + correos.size() + "\n" +
                "\ttags registrados: " + tags + "\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contact contact = (Contact) o;
        return Objects.equals(id, contact.id) && Objects.equals(prefijo, contact.prefijo) && Objects.equals(nombre, contact.nombre) && Objects.equals(apellidos, contact.apellidos) && Objects.equals(sufijo, contact.sufijo) && Objects.equals(apodo, contact.apodo) && Objects.equals(archivarComo, contact.archivarComo) && Objects.equals(empresa, contact.empresa) && Objects.equals(puestoDeTrabajo, contact.puestoDeTrabajo) && Objects.equals(departamento, contact.departamento) && Objects.equals(pais, contact.pais) && Objects.equals(lineaDeDireccion2, contact.lineaDeDireccion2) && Objects.equals(codigoPostal, contact.codigoPostal) && Objects.equals(ciudad, contact.ciudad) && Objects.equals(provincia, contact.provincia) && Objects.equals(fechaDeNacimiento, contact.fechaDeNacimiento) && Objects.equals(tags, contact.tags) && Objects.equals(correos, contact.correos) && Objects.equals(phones, contact.phones);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, prefijo, nombre, apellidos, sufijo, apodo, archivarComo, empresa, puestoDeTrabajo, departamento, pais, lineaDeDireccion2, codigoPostal, ciudad, provincia, fechaDeNacimiento, tags, correos, phones);
    }

    @Override
    public String toString() {
        return  "\tid: " + id + "\n" +
                "\tprefijo: " + prefijo + "\n" +
                "\tnombre: " + nombre + "\n" +
                "\tapellidos: " + apellidos + "\n" +
                "\tsufijo: " + sufijo + "\n" +
                "\tapodo: " + apodo + "\n" +
                "\tarchivarComo: " + archivarComo + "\n" +
                "\tempresa: " + empresa + "\n" +
                "\tpuestoDeTrabajo: " + puestoDeTrabajo + "\n" +
                "\tdepartamento: " + departamento + "\n" +
                "\tpais: " + pais + "\n" +
                "\tciudad: " + ciudad + "\n" +
                "\tprovincia: " + provincia + "\n" +
                "\tlineaDeDireccion2: " + lineaDeDireccion2 + "\n" +
                "\tcodigoPostal: " + codigoPostal + "\n" +
                "\ttelefonos: " + phones + "\n" +
                "\tcorreos: " + correos + "\n";

    }
}

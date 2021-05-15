package main.java.models;

import java.util.Random;

public class RandomContacts extends Contact {
    private final String[] prefijos = {"Sr.", "Sra.", "Srita.", "Dr.", "Ing."};
    private final String[] nombres = {"Antonio",
            "Edgar",
            "Karim",
            "Hilario",
            "Lucio",
            "Blas",
            "Alberto",
            "Hipolito",
            "Vicente",
            "Octavio",
            "Salvador",
            "Fabio",
            "Jose",
            "Jesus",
            "Manuel",
            "Juan",
            "Roberto",
            "Agustin",
            "Nicolas",
            "Ignacio",
            "Francisco",
            "Martin",
            "Roman",
            "Enzo",
            "Marcelo",
            "Neldo",
            "Bart",
            "Homero",
            "Lionel",
            "Leonel",
            "Andres",
            "Victor",
            "Carlos",
            "Gerardo",
            "Rogelio",
            "Fernando",
            "Hernan",
            "German",
            "Lautaro",
            "Fasuto",
            "Marcos",
            "Leandro",
            "Sergio",
            "Stefano",
            "Lucas",
            "Federico",
            "Thiago",
            "Santigago",
            "Fabricio",
            "Emanuel",
            "Ricardo",
            "Felipe",
            "Normando",
            "Aurelio",
            "Franco",
            "Valentin",
            "Valentino",
            "Mario",
            "Kevin",
            "Brian",
            "Cristian",
            "Raul",
            "Hugo",
            "Jonatan",
            "Nicanor",
            "Rodrigo",
            "Axel",
            "Alex",
            "Augusto",
            "Nahuel",
            "Tomas"};
    private final String[] apellidos = {"Garcia",
            "Gomez",
            "Hernandez",
            "Gonzalez",
            "Gimenez",
            "Ronaldo",
            "Valdez",
            "Perez",
            "Sosa",
            "Rodriguez",
            "Lopez",
            "Diaz",
            "Martinez",
            "Sanchez",
            "Romero",
            "Alvarez",
            "Torres",
            "Ruiz",
            "Ramirez",
            "Flores",
            "Benitez",
            "Dominguez",
            "Herrera",
            "Guitierrez",
            "Pereyra",
            "Molina",
            "Castro",
            "Silva",
            "Rojas",
            "Ortiz",
            "Luna",
            "Juarez",
            "Suarez",
            "Cabrera",
            "Rios",
            "Morales",
            "Godoy",
            "Moreno",
            "Ferreyra",
            "Carrizo",
            "Peralta",
            "Castillo",
            "Ledesma",
            "Quiroga",
            "Vega",
            "Vera",
            "Muñoz",
            "Ojeda",
            "Ponce",
            "Villalba"};
    private final String[] sufijos = {"I", "II", "III", "IV", "V", "VI", };
    private final String[] apodos = {"Papelito",
            "Chocolatin",
            "Rifle",
            "Loco",
            "Lechuga",
            "Cabezon",
            "Burrito",
            "Pelusa",
            "Cebolla",
            "Jefe",
            "Nano",
            "Lalo",
            "Chino",
            "Ruso",
            "Fiera",
            "Gordo",
            "Tigre",
            "Pulga",
            "Kily",
            "Rey",
            "Pelado",
            "Pela",
            "Colorado",
            "Colo",
            "Piojo",
            "Topo",
            "Toto",
            "Tato",
            "Negro",
            "Rifle",
            "Beto",
            "Coco",
            "Coqui",
            "Pepe",
            "Pancho",
            "Nacho",
            "Yayo",
            "Dogo",
            "Goyo",
            "Flaco",
            "Tincho",
            "Pitu",
            "Peque",
            "Zurdo",
            "Pajaro",
            "Facha",
            "Bocha",
            "Tecla",
            "Muñeco",
            "Tucu",
            "Cordoba",
            "Gaucho",
            "Rata",
            "Pana"};
    private final String[] empresas = {"Arcor",
            "Mercado Libre",
            "Toyota",
            "Google",
            "Unilever",
            "Quilmes",
            "Natura",
            "Galicia",
            "Mercedes",
            "Santander",
            "Coca-Cola",
            "Ford",
            "YPF",
            "BBVA",
            "Bago",
            "Despegar",
            };
    private final String[] puestosDeTrabajo = {"CEO",
            "Gerente financiero",
            "CSO",
            "Administrativo",
            "Marketing",
            "RRHH",
            "IT",
            "COO",
    };
    private final String[] departamentos = {"Finanzas", "Direccion", "Recursos humanos", "Produccion", "Testing", "Marketing", "Ventas"};
    private final String[] correos = {"jegif89358@yncyjs.com",
            "einddiploma@connr.com",
            "disperigne@biyac.com",
            "vince_edwards@gmail.com",
            "tynisha_haigh@gmail.com",
            "aurelia_drake@yahoo.com",
            "sandee_curran@outlook.com",
            "leeann_ball@gmail.com",
            "giuseppe_parkes@gmail.com",
            "twana_costello@outlook.com",
            "lida_philip@yandex.com",
            "simone_whittaker@mail.com",
            "melvin_ali@aol.com",
            "carman_walton@yahoo.com",
            "in_terry@yandex.com",
            "linwood_higgins@outlook.com",
            "corey_powell@mail.com",
            "eulalia_freeman@protonmail.com",
            "elodia_mcneill@zohomail.com",
            "orval_bryan@aol.com",
            "shaneka_hodgson@zohomail.com",
            "delois_stott@gmail.com",
            "sudie_christie@protonmail.com",
            "lashaunda_kendall@protonmail.com",
            "shila_hume@yahoo.com",
            "rocio_porter@zohomail.com",
            "patsy_stokes@yahoo.com",
            "mora_emery@zohomail.com",
            "jettie_bray@aol.com",
            "dudley_upton@gmail.com",
            "lavern_whitfield@yandex.com",
            "consuela_howe@yandex.com"};
    private final String[] paises = {"Chile", "Argentina", "Colombia", "Venezuela", "Mexico", "Estados Unidos", };
    private final String[] telefonos = {"010-2455 x517", "1-631-231-4796 x313", "000-615-3502 x715", "603.595.1426", "603.595.1426", "685-5526",};
    private final String[] codigosPostales = {"50157-3601", "88688", "91643", "63122", "49769", "93959-5091"};
    private final String[] ciudades = {"Lanus", "Bariloche", "Villa la angostura", "La plata", "Rosario"};
    private final String[] provincias = {"Buenos Aires", "Cordoba", "San Luis", "Rio Negro", "Tucuman", "Mendoza", "Neuquen"};
    private final String[] fechasDeNacimiento = {"25/03/1990", "02/07/1995", "19/02/1991", "11/07/1980", "22/09/1975", "12/12/2000", };
    private final String[] tags = {"Trabajo", "Hogar", "Facultad", "Club de futbol", "Club de pesca", "Amigos", "Familia"};

    public Contact[] generateContacts(int amount) {
        Contact[] generatedContacts = new Contact[amount];

        for (int i = 0; i < amount; i++) {
            Contact contact = new Contact();
            Random random = new Random();

            contact.setPreffix(this.prefijos[random.nextInt(this.prefijos.length)]);
            contact.setName(this.nombres[random.nextInt(this.nombres.length)]);
            contact.setSurname(this.apellidos[random.nextInt(this.apellidos.length)]);
            contact.setSuffix(this.sufijos[random.nextInt(this.sufijos.length)]);
            contact.setNickname(this.apodos[random.nextInt(this.apodos.length)]);
            contact.setCompany(this.empresas[random.nextInt(this.empresas.length)]);
            contact.setJobPosition(this.puestosDeTrabajo[random.nextInt(this.puestosDeTrabajo.length)]);
            contact.setDepartment(this.departamentos[random.nextInt(this.departamentos.length)]);
            Country country = new Country(this.paises[random.nextInt(this.paises.length)]);
            contact.setCountry(country);
            contact.setCity(this.ciudades[random.nextInt(this.ciudades.length)]);
            contact.setZipCode(this.codigosPostales[random.nextInt(this.codigosPostales.length)]);
            contact.setProvince(this.provincias[random.nextInt(this.provincias.length)]);
            contact.setBirthDate(this.fechasDeNacimiento[random.nextInt(this.fechasDeNacimiento.length)]);

            for (int j = 0; j < random.nextInt(3); j++) {
                contact.addPhone(new Phone(country, telefonos[random.nextInt(this.telefonos.length)], tags[random.nextInt(this.tags.length)]));
            }

            for (int j = 0; j < random.nextInt(3); j++) {
                contact.addCorreo(new Email(correos[random.nextInt(correos.length)], tags[random.nextInt(tags.length)]));
            }

            for (int j = 0; j < random.nextInt(5); j++) {
                contact.addTag(new Tag(tags[random.nextInt(tags.length)]));
            }
            if (contact.getTags().size() == 0) {
                contact.addTag(new Tag("Sin definir"));
            }

            generatedContacts[i] = contact;

        }

        return generatedContacts;
    }

    public Contact generateContact() {
        return generateContacts(1)[0];
    }

}

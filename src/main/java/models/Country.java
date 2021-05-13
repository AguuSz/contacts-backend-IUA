package main.java.models;

public class Country {
    private String preffix;
    private String iso3;
    private String name;

    public Country(String name) {
        setCountry(name);
    }

    public String getPreffix() {
        return preffix;
    }

    public void setPreffix(String preffix) {
        this.preffix = preffix;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIso3() {
        return iso3;
    }

    public void setIso3(String iso3) {
        this.iso3 = iso3;
    }

    public void setCountry (String name) {
        boolean found = false;

        String[] countryData = CountriesDB.findCountryByName(name);

        if (countryData != null) {
            this.name = countryData[0];
            this.preffix = countryData[1];
            this.iso3 = countryData[2];
        } else {
            System.out.println("No se ha encontrado el pais " + name + ", seteando Argentina por defecto..");
            countryData = CountriesDB.findCountryByName("Argentina");
            this.name = countryData[0];
            this.preffix = countryData[1];
            this.iso3 = countryData[2];
        }

    }

    @Override
    public String toString() {
        return "{" + "\n" +
                "\t\t" + "name: " + this.name + "\n" +
                "\t\t" + "preffix: " + this.preffix + "\n" +
                "\t\t" + "shortName: " + this.iso3 + "\n" +
                "\t}";
    }

    public String briefToString() {
        return this.name;
    }
}

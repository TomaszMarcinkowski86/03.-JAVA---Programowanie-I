package zajęcia_3003.e_oop;

import java.util.List;

public class Country {

    String name;
    List<City> cities;
    City capital;

    public Country(String name, List<City> cities, City capital) {
        this.name = name;
        this.cities = cities;
        this.capital = capital;
    }

    public String getName() {
        return name;
    }

    public List<City> getCities() {
        return cities;
    }

    public City getCapital() {
        return capital;
    }

    public static class OOP {
    }
}

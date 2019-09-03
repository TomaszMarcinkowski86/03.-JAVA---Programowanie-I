package zajęcia_3003.e_oop;

import java.util.List;

public class City {

    String name;
    List<Flat> flats;

    public City(String name, List<Flat> flats) {
        this.name = name;
        this.flats = flats;
    }

    public String getName() {
        return name;
    }

    public List<Flat> getFlats() {
        return flats;
    }
}

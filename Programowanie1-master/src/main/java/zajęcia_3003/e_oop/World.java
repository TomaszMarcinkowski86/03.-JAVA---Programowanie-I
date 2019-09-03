package zajęcia_3003.e_oop;

import java.util.List;

public class World {
    List<Country> countries;

    public World(List<Country> countries) {
        this.countries = countries;
    }

    public List<Country> getCountries() {
        return countries;
    }
}

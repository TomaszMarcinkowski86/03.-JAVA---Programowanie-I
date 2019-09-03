package zajęcia_3003.e_oop.util;

import zajęcia_3003.e_oop.City;
import zajęcia_3003.e_oop.Country;

import java.util.Collections;
import java.util.List;

import static zajęcia_3003.e_oop.util.Creator.getOrNull;

public class CountryGenerator {

    static Country getRandomCountry() {
        return getOrNull(new Country(
                getRandomName(),
                getRandomCityList(),
                getCapital()
        ));
    }

    private static City getCapital() {
        return null;
    }

    private static List<City> getRandomCityList() {
        return Collections.emptyList();
    }

    private static String getRandomName() {
        return null;
    }
}

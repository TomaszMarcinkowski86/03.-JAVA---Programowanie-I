package zajęcia_3003.e_oop.util;

import zajęcia_3003.e_oop.City;
import zajęcia_3003.e_oop.Flat;

import java.util.Collections;
import java.util.List;

import static zajęcia_3003.e_oop.util.Creator.getOrNull;

public class CityGenerator {

    City getrandomCity() {
        return getOrNull(
                new City(getCityName(),
                        getListOfFlats())
        );
    }

    // IMPLEMENT

    private List<Flat> getListOfFlats() {
        return Collections.emptyList();
    }

    private String getCityName() {
        return null;
    }
}

package zajęcia_3003.e_oop.util;

import zajęcia_3003.e_oop.Flat;
import zajęcia_3003.e_oop.Person;

import java.util.Collections;
import java.util.List;

import static zajęcia_3003.e_oop.util.Creator.getOrNull;

public class FlatGenerator {

    Flat getRandomFlat(){
        return getOrNull(
                new Flat(getRandomArea(),
                        getRandomPeopleList()
                )
        );
    }

    private double getRandomArea() {
        return 0;
    }

    private List<Person> getRandomPeopleList() {
        return Collections.emptyList();
    }
}

package zajęcia_3003.e_oop.util;

import zajęcia_3003.e_oop.Gender;
import zajęcia_3003.e_oop.Person;

import static zajęcia_3003.e_oop.util.Creator.getOrNull;

public class PersonGenerator {

    Person getRandomPerson() {
        return getOrNull(
                new Person(
                        getSalary(),
                        getAge(),
                        getFirstName(),
                        getLastName(),
                        Gender.getGender()
                ));
    }

    // IMPLEMENT
    private String getLastName() {
        return null;
    }

    private String getFirstName() {
        return null;
    }

    private int getAge() {
        return 0;
    }

    private int getSalary() {
        return 0;
    }

}

package zajęcia_3003.e_oop;

import java.util.List;

public class Flat {

    double area;
    List<Person> people;

    public Flat(double area, List<Person> people) {
        this.area = area;
        this.people = people;
    }

    public double getArea() {
        return area;
    }

    public List<Person> getPeople() {
        return people;
    }
}

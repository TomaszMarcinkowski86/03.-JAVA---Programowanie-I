package zadania_0903.lambdas.collections;

// klasa pomocnicza dla klasy ListaKol

public class Koło implements Comparable {
    private double promien;

    public Koło(double promien) {
        this.promien = promien;
    }

    public double getPromien() {
        return promien;
    }

    @Override
    public String toString() {
        return "Koło{" +
                "promien=" + promien +
                '}';
    }

    @Override
    public int compareTo(Object kolo) {
        if (!(kolo instanceof Koło)) {
            throw new IllegalArgumentException();
        }
        if (((Koło) (kolo)).getPromien() == this.getPromien()) {
            return 0;
        } else if (((Koło) (kolo)).getPromien() < this.getPromien()) {
            return 1;
        } else
            return -1;
    }

}

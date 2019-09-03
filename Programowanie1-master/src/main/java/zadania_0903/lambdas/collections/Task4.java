package zadania_0903.lambdas.collections;


/**
 * 4. Utwórz dowolną klasę, a potem zainicjalizowaną tablicę obiektów tej klasy.
 * Zawartością tablicy wypełnij listę.
 * Wyłuskaj z niej fragment listy metodą subList(), a następnie usuń tę podlistę z oryginalnej listy.
 */
public class Task4 {
    private int pole;

    public Task4(int pole) {
        this.pole = pole;
    }

    public int getPole() {
        return pole;
    }

    @Override
    public String toString() {
        return "Task4{" +
                "pole=" + pole +
                '}';
    }
}

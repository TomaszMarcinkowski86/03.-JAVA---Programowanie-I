package zadania_0303.tablice;

public class Fibonnaci {
    public static long[] stwórzTablicę(int długość) {
        if (długość < 1)
            throw new IllegalArgumentException();

        long[] tablica = new long[długość];
        tablica[0] = 1;
        tablica[1] = 1;

        for (int i = 2; i < długość; i++) {
            tablica[i] = tablica[i - 1] + tablica[i - 2];
        }
        return tablica;
    }
}

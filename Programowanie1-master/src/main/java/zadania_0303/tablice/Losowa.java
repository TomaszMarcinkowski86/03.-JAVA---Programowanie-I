package zadania_0303.tablice;

import java.util.Random;

public class Losowa {
    private static Random random = new Random();

    public static int[] stwórzTablicę(int długość, int poczatkePrzedziału, int koniecPrzedziału) {
        int[] tablica = new int[długość];

        for (int i = 0; i < długość; i++) {
            tablica[i] = random.nextInt(koniecPrzedziału - poczatkePrzedziału) + poczatkePrzedziału;
        }
        return tablica;
    }
}

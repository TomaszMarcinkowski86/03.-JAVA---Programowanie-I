package zadania_0303.tablice;

import java.util.Random;

public class CzyRosnasyMalejacy {
    private static Random random = new Random();

    public static void gdzieWikszy(int długość) {
        int[] tab = new int[długość];
        for (int i = 0; i < długość; i++) {
            tab[i] = random.nextInt();
        }

        if (czyNiemalejaca(tab))
            System.out.println("Niemalejaca");
        else if (czyNierosnaca(tab))
            System.out.println("Nierosnaca");
        else
            System.out.println("Ani taka, ani taka ");
    }

    private static boolean czyNierosnaca(int[] tablica) {
        for (int i = 0; i < tablica.length-1; i++) {
            if (tablica[i] < tablica[i + 1])
                return false;
        }
        return true;
    }

    private static boolean czyNiemalejaca(int[] tablica) {
        for (int i = 0; i < tablica.length-1; i++) {
            if (tablica[i] > tablica[i + 1])
                return false;
        }
        return true;
    }
}

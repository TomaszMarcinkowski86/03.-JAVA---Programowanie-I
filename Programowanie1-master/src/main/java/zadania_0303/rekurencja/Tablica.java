package zadania_0303.rekurencja;

import java.util.Arrays;

public class Tablica {
    static int[] tablica = {1, 2, 3, 4, 5, 6, 7};

    private static void wypiszRosnąco(int[] tablica) {
        System.out.println(tablica[0]);
        if (tablica.length > 1) {
            wypiszRosnąco(Arrays.copyOfRange(tablica, 1, tablica.length));
        }
    }

    private static void wypiszMalejąco(int[] tablica) {
        System.out.println(tablica[tablica.length - 1]);
        if (tablica.length > 1) {
            wypiszMalejąco(Arrays.copyOf(tablica, tablica.length - 1));
        }
    }

    public static void main(String[] args) {
        wypiszRosnąco(tablica);
        wypiszMalejąco(tablica);
    }
}

package zadania_0303.tablice;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Indeksy {

    private static Scanner scanner = new Scanner(System.in);

    public static int[] stwórz(int długość) {
        int[] tab = new int[długość];
        for (int i = 0; i < długość; i++) {
            tab[i] = wczytajWartość() / (i + 1);
        }
        return tab;
    }

    private static int wczytajWartość() {
        System.out.println("Podaj liczbę do wpisania do tablicy: ");
        try {
            return scanner.nextInt();
        } catch (InputMismatchException e) {
            return wczytajWartość();
        }
    }
}

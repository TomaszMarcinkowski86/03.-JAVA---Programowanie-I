package zadania_0303.tablice;

public class Dodawacz {
    public static int[] dodaj(int[] pierwsza, int[] druga) {
        int[] tablica = (pierwsza.length > druga.length ? pierwsza : druga).clone();

        int dlugoscKrótszej = pierwsza.length < druga.length ? pierwsza.length : druga.length;
        for (int i = 0; i < dlugoscKrótszej; i++) {
            tablica[i] = pierwsza[i] + druga[i];
        }
        return tablica;
    }
}

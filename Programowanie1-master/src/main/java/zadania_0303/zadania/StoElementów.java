package zadania_0303.zadania;

import java.util.HashMap;
import java.util.Random;

public class StoElementów {

    private static int[] wylosujTablicę() {
        int[] tablica = new int[100];
        Random random = new Random();
        for (int i = 0; i < tablica.length; i++) {

            // losujemy losową liczbę od 0 do 20 i umieszczamy w tablicy
            tablica[i] = random.nextInt(20);
//            tablica[i] = (int) Math.round(Math.random() * 20);
        }
        return tablica;
    }

    private static HashMap policzWystąpienia(int[] tablica) {
        //tworzymy pustą mapę
        HashMap<Integer, Integer> wystąpienia = new HashMap<>();

        // iterujemy po wszystkich elementach tablicy
        for (int liczba : tablica) {
//        for (int i = 0; i < tablica.length ; i++) {
//            int liczba = tablica[i];

            // jeżeli liczba już istnieje w HashMapie jako klucz
            // wyciągamy starą warość, dodajemy do niej 1
            // a wynikiem zastępujemy starą warość
            if (wystąpienia.containsKey(liczba)) {
                wystąpienia.put(liczba, wystąpienia.get(liczba) +1);

            // jeżeli klucz nie występuje w HashMapie umieszczamy go w niej
            // z wartością 1
            } else {
                wystąpienia.put(liczba, 1);
            }
        }
        return wystąpienia;
    }

    public static void main(String[] args) {
        System.out.println(policzWystąpienia(wylosujTablicę()));
    }


}

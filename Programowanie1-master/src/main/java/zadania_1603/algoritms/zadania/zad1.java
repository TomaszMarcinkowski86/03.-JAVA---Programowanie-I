package zadania_1603.algoritms.zadania;


// 1. Przeglądaj kolejne elementy zbioru.
// Jeśli przeglądany element posiada odpowiednie własności 
// (np. jest liczbą o poszukiwanej wartości),
// to zwróć jego pozycję w zbiorze.
// Jeżeli nie ma odpowiedniego elementu zwróć -1.

// zadanie 1 z sortowaniem bubblesort

import java.util.ArrayList;
import java.util.Random;

public class zad1 {

     private ArrayList<Integer> lista=new ArrayList<>();
// tworzę ArrayListe losowych liczb
    public void zbior(int a) {
        Random random = new Random();
        int liczba;
        for (int i = 1; i < 20; i++) {
            liczba = random.nextInt(i);
            lista.add(liczba);
        }
        System.out.println(lista);
        if (lista.contains(a)) {
            System.out.println((lista.indexOf(a)));
        } else
            System.out.println(-1);

// sortowanie listy z neta https://stackoverflow.com/questions/18968446/bubble-sort-arraylist
        ArrayList<Integer> sortedlists = lista;
        for (Integer i = lista.size() - 1; i > 1; i--) {
            for (Integer k = 0; k < i; k++) {
                int n = k + 1;
                if (sortedlists.get(k) > sortedlists.get(n)) {
                    Integer temp = sortedlists.get(k);
                    sortedlists.set(k, sortedlists.get(n));
                    sortedlists.set(n, temp);
                }
            }
        }
        System.out.println(lista);

    }


    public static void main(String[] args) {
        zad1 sprawdz = new zad1();
       sprawdz.zbior(5);


    }
}

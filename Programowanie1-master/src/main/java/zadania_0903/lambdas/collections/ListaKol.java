package zadania_0903.lambdas.collections;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

/**
 * 3. Utwórz klasę Koło z polem promień. Stwórz Listę obiektów Koło i dodawaj
 *    do niej elementy o losowym promieniu z zakresu 0-1 dopóki losowy promień nie będzie mnijeszy od 0.01.
 *     * Wypisz elementy na ekranie
 *     * znajdz najmniejszy i najwiekszy element w tablicy
 *     * posortuj otrzymana liste
 *     * oblicz srednia arytmetyczna promieni elementów w kolekcji i sprawdź czy element o takim promieniu
 *       znajduje się w tej tablicy
 */

public class ListaKol {
    private List<Koło> lista;

    public ListaKol() {
        wygeneruj();
    }

    // generujemy listę obiektów koło o losowym promieniu z zakresu od 0 do 1
    private void wygeneruj() {
        Random random = new Random();
        lista = new ArrayList<>();
        double promien;
        do {
            promien = random.nextDouble();
            lista.add(new Koło(promien));
        } while (promien > 0.01);
    }

    public List<Koło> getLista() {
        return lista;
    }


    // zwrcamy Koło z o najmniejszym promieniu
    public Koło getMin() {
        Koło temp = new Koło(1);
        for (Koło kolo : lista) {
            if (kolo.getPromien() < temp.getPromien()) {
                temp = kolo;
            }
        }
        return temp;
    }

    public Koło getMinStream() {
        return lista.stream()
                .min((kolo1, kolo2) -> kolo1.compareTo(kolo2))
                .get();
    }

    public Koło max() {
        return lista.stream()
                .max((koło, kolo) -> koło.compareTo(kolo))
                .get();
    }

    public void posortuj() {
        lista.sort(Comparator.naturalOrder());
    }

    public double srednia() {
        double avg = 0;
        for (int i = 0; i < lista.size(); i++) {
            avg += lista.get(i).getPromien();
        }
        return avg / lista.size();
    }

    public double sredniaStream() {
        return lista.stream()
                .map(kolo -> kolo.getPromien()) // mapujemy obiekty koło na wartości ich promienia
                .reduce((a, b) -> (a + b)) // dodajemy do siebie promienie
                .get() / lista.size(); // rozpakowujemy wynik i dzielimy przez listę kół
    }

    // sprawdzmay czy lista zawiera koło o promieniu równym średniemu promieniowi wszsystkich kół
    public boolean sredniaWLiscie() {
        return lista.contains(new Koło(sredniaStream()));
    }
}

package zadania_1003.collections;

import zadania_1003.collections.dequeues.MyStack;

import java.util.HashMap;
import java.util.Map;

/**
 * Wykorzystując stos napisz klasę która sprawdzi czy podany String,
 * np {{([][])}()} i [{()] ma poprawnie zamknięte nawiasy.
 */
public class Nawiasy {


    // mapa do pzechowywania par nawias zamykajcy:nawias otwierajcy
    Map<String, String> mapa = new HashMap<>();

    // w polu wypełniamy mapę odpowiednimi warościami
    {
        mapa.put("}", "{");
        mapa.put(")", "(");
        mapa.put("]", "[");
    }

    // metoda sprawdzajca String z podanymi nawiasami
    public boolean sprawdz(String wyraz) {
        String[] tablica = wyraz.split("");  // dzielimy String na pojedyńcze znaki
        MyStack<String> stos = new MyStack<>(); // tworzymy stos do przechowywania znaków z powyższego Array

        // iterujemy po całej tablicy
        for (int i = 0; i < tablica.length; i++) {
            // sprawdzmay czy nawias jest otwierajcy
            if (tablica[i].matches("[\\{\\(\\[]")) {
                // jeżeli tak zapisujemy go na stosie
                stos.push(tablica[i]);
            } else {
                // jeżeli nawias jest zamykajcy sprawdzmy czy zamyka ostatni nawiaś otwierajcy zapisany na stosie
                if (!stos.pop().equals(mapa.get(tablica[i]))) {
                    // jeżeli nie zwracamy false
                    return false;
                }
            }
        }
        // jeżeli przeiterowaliśmy się po całej tablicy i nie zwróciliśmy false
        // oznacza to, że nawiasy s zamykane prawidłowo i zwracamy true


        return true;
    }

    // sprawzmy poprawność kodu
    public static void main(String[] args) {
        Nawiasy nawiasy = new Nawiasy();
        System.out.println(nawiasy.sprawdz("{{([][])}()}"));
        System.out.println(nawiasy.sprawdz("[{()]"));
    }
}

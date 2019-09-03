package zadania_0303.zadania;

import java.util.Arrays;

public class Pesel {
    //tablica wag z zadania_0303.zadania
    static int[] wagi = {1, 3, 7, 9, 1, 3, 7, 9, 1, 3};

    public static boolean sprawdźPesel(String pesel) {

        //sprawdzamy poprawnośc otrzymanego numeru PESEL
        if (pesel.length() != 11
                || !pesel.matches("\\d+"))
            throw new IllegalArgumentException("To nie jest poprawny PESEL");

        // dzielimy pesel na pojedyńcze Stringi i zapisujemy w tablicy
        String[] podzielonyPesel = pesel.split("");

        // tymczasowa tablica dla przechowywania wyników mnożenia
        int[] tymczasowa = new int[10];
        for (int i = 0; i < 10; i++) {
            tymczasowa[i] = Integer.valueOf(podzielonyPesel[i]) * wagi[i];
        }

        // liczymy sumę iloczynów
        int sumaIloczynów = Arrays.stream(tymczasowa)
                .reduce((x, y) -> x + y)
                .getAsInt();

        // sprawdzamy czy reszta z dzielenia sumyIloczynów jest równa zero
        // jeżeli tak zwracamy zero, jeżeli nie odejmujemy
        // resztę z dzielenia od 10
        int temp = sumaIloczynów % 10 == 0 ? 0 : 10 - (sumaIloczynów % 10);

        // sprawdzamy czy wynik powyższego działania jest równy ostatniej
        // liczbie numeru PESEL
        return temp == Integer.valueOf(podzielonyPesel[10]);
    }


    public static boolean sprawdzPeselWersja2(String pesel) {
        int sumaIloczynów = 0;

        // w jednej pentli wykonujemy mnożenie i sumujemy wyniki mnożenia
        for (int i = 0; i < 10; i++) {
            sumaIloczynów += Integer.valueOf(pesel.substring(i, i + 1)) * wagi[i];
        }

        // w tej linijce sprawdzamy czy reszta z dzielenia sumyIloczynów jest równa zero
        // jeżeli tak zwracamy zero, jeżeli nie odejmujemv resztę z dzielenia od 10
        return (sumaIloczynów % 10 == 0 ? 0 : 10 - (sumaIloczynów % 10))
                //sprawdzamy czy wynik powyższego wyrażenia jest równy ostatniej cyfrze numeru PESEL
                == Integer.valueOf(pesel.substring(10,11));
    }
}

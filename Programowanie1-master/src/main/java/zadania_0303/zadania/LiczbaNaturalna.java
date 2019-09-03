package zadania_0303.zadania;

import java.util.Arrays;
import java.util.Random;

public class LiczbaNaturalna {

    public static void uzyskajWynik() {
        Random random = new Random();

        int liczba = random.nextInt(Integer.MAX_VALUE);
        System.out.println("Liczba to : " + liczba);

        System.out.println("Suma jej liczb to: " + policzSumę(liczba));
    }


    private static int policzSumęStrumieniem(int liczba) {

        //przekszatłcamy liczbę na String
        String stringZLiczby = Integer.valueOf(liczba).toString();

        //dzielimy
        return Arrays.stream(stringZLiczby.split("")) // dzielimy powyższego Stringa na pojedyncze znaki
                .map(s -> Integer.valueOf(s))               // każdą pojedynczą cyfre przekształcamy na Integera
                .reduce((x, y) -> x + y)                    // dodajemy wszystkie elementy strumienia do siebie
                .get();                                     // wyciągamy otrzymaną wartość z Optionala
    }

    private static int policzSumę(int liczba) {
        String stringZLiczby = Integer.valueOf(liczba).toString();

        String[] pojedynczeCyfry = stringZLiczby.split("");
        int suma = 0;

        for (String cyfra : pojedynczeCyfry) {
            suma += Integer.valueOf(cyfra);
        }
        return suma;
    }

    public static void main(String[] args) {
        uzyskajWynik();
    }
}

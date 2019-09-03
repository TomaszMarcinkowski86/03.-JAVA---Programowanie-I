package zadania_0303.zadania;

import java.util.Scanner;

public class Iloczyn {
    private static Scanner scanner = new Scanner(System.in);

    public static int pobierzIlośćLiczb() {
        System.out.println("Podaj ilość liczb");
        return scanner.nextInt();
    }

    // ====== wersja pobierzLiczby dla ArrayListy

//    public static ArrayList pobierzLiczby(int ilośćLiczb) {
//        String podaj = "Podaj liczbę nr: ";
//
//        ArrayList<Integer> lista = new ArrayList<>();
//        for (int i = 1; i <= ilośćLiczb; i++) {
//            System.out.println(podaj + i);
//            lista.add(scanner.nextInt());
//        }
//        return lista;
//    }

    public static int[] pobierzLiczby(int ilośćLiczb) {
        int[] lista = new int[ilośćLiczb];

        for (int i = 1; i <= ilośćLiczb; i++) {
            lista[i - 1] = pobierzLiczbę(i);
        }
        return lista;
    }

    private static int pobierzLiczbę(int numer) {
        String podaj = "Podaj liczbę nr: ";
        System.out.println(podaj + numer);
        int temp = scanner.nextInt();


        if (temp == 0)
            return pobierzLiczbę(numer);
        else
            return temp;

        //efektywnie to jest to samo co if powyżej!
//            return temp == 0 ? pobierzLiczbę(numer) : temp;
    }

    public static int obliczIloczyn(int... listaLiczb) {
        int iloczyn = 1;


        for (Integer liczba : listaLiczb) {
            iloczyn = iloczyn * liczba;
        }
        return iloczyn;

        // stream który robi to samo co for each powyżej:
        // * tworzy strumień Integerów,
        // * każdy element jest mnożony przez element kolejny,
        //   co pozostawia nam jeden element w strumieniu -> stąd nazwa reduce()
        // * wynikiem jest Optional ponieważ potencjalnie z reduce
        //   możemy otrzymać null, więc wywołujemy metodę get(),
        //   żeby rozpakować Optionala


        //        return listaLiczb.stream()
        //                .reduce((x, y) -> x * y)
        //                .get();
    }

    // ===== wersja obliczIloczyn dla ArrayListy

//    public static int obliczIloczyn(ArrayList<Integer> listaLiczb) {
//        int iloczyn = 1;
//
//
//        for (Integer liczba : listaLiczb) {
//            iloczyn = iloczyn * liczba;
//        }
//        return iloczyn;
//
//        //        return listaLiczb.stream()
//        //                .reduce((x, y) -> x * y)
//        //                .get();
//    }

    public static void main(String[] args) {
        int ilość = pobierzIlośćLiczb();
        int[] listaLiczb = pobierzLiczby(ilość);
        System.out.println(obliczIloczyn(listaLiczb));
    }
}

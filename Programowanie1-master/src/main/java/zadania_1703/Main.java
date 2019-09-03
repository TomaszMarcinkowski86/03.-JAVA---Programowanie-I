package zadania_1703;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        // write your code here
        Zad1 gra = new Zad1();

        boolean tura = true;
        boolean rozgrywka = true;


        while (rozgrywka) {
            if (tura) {
                System.out.println("======TURA GRACZA JEDEN======");
                System.out.println("Podaj wiersz: ");
                gra.setX(new Scanner(System.in).nextInt());
                System.out.println("Podaj rzad: ");
                gra.setY(new Scanner(System.in).nextInt());
                tura = gra.ruchGraczJeden();
                rozgrywka = gra.czyWygrana();


            } else {
                System.out.println("======TURA GRACZA DWA======");
                System.out.println("Podaj wiersz: ");
                gra.setX(new Scanner(System.in).nextInt());
                System.out.println("Podaj rzad: ");
                gra.setY(new Scanner(System.in).nextInt());
                tura = gra.ruchGraczDwa();
                rozgrywka = gra.czyWygrana();

            }

        }


    }//koniec maina
}//koniec klasy main

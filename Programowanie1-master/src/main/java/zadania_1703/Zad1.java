package zadania_1703;

/*

* nie korzystamy z pętli -> tylko streamy(!)
* staramy się minimalizować ilość if()
* zadania dzielimy na klasy o pojedyńczej odpowiedzialności
* ograniczamy widoczność tak bardzo jak się da
* tworzone klasy umieszczamy w odpowiednich pakietach

1) Napisz grę w kółko i krzyżyk.
  *  odpowiedzialność za zarządzanie wejściem wyjściem przenieś do oddzielnych klas
  *  pozwól pierwszemu graczowi wybrać czy chcę grać kółkiem czy krzyżykiem.
  *  przy każdym ruchu wyświetli pole gry i numer gracza (wystarczy na konsoli)
  *  po każdym ruchu sprawdzi czy to koniec partii
  *  po skończonej grze pozwoli graczom zagrać jeszcze raz
 */

import java.util.Scanner;
import java.util.logging.SocketHandler;


public class Zad1 {
    private String[][] plansza = {{"", "", ""}, {"", "", ""}, {"", "", ""}};
    private int x;
    private int y;


    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void wyswietlPlansze() {
        for (int i = 0; i < plansza.length; i++) {
            for (int j = 0; j < plansza.length; j++) {
                System.out.format(" |%2s", (plansza[i][j])); // .format %s -podstawia w to miejsce string %d - cyfra
            }//koniec fora dla j
            System.out.print(" | ");
            System.out.println();

        }//koniec fora dla i
        System.out.println();
    }//koniec metody wyswietlPlansze

    public boolean sprawdz() {
        if (plansza[this.x - 1][this.y - 1]=="X" || plansza[this.x - 1][this.y - 1]=="O") {
            System.out.println("To pole jest juz zajete, postaraj sie jeszcze raz!");
            return false;
        } else return true;
    }

    public boolean ruchGraczJeden() {
        if (sprawdz()) {
            plansza[this.x - 1][this.y - 1] = "X";
            wyswietlPlansze();
            return false;
        } else {
            wyswietlPlansze();
            return true;
        }
    }

    public boolean ruchGraczDwa() {
        if (sprawdz()) {
            plansza[this.x - 1][this.y - 1] = "O";
            wyswietlPlansze();
            return true;
        } else {
            wyswietlPlansze();
            return false;
        }
    }

    public boolean czyWygrana() {

        String warunek =  "";
        //czy wygrwa jakis wiersz
        for (int i = 0; i < plansza.length; i++) {
            for (int j = 0; j < plansza.length; j++) {
                warunek = warunek + plansza[i][j];
            }
            if (warunek.equals("XXX")) {
                System.out.println("wygral gracz 1");
                return false;
            } else if (warunek.equals("OOO")) {
                System.out.println(" wygral gracz 2");
                return false;
            }
        }

        //czy wygrywa jakis rzad

        warunek = "";
        for (int i = 0; i < plansza.length; i++) {
            for (int j = 0; j < plansza.length; j++) {
                warunek = warunek + plansza[j][i];
            }
            if (warunek.equals("XXX")) {
                System.out.println("wygral gracz 1");
                return false;
            } else if (warunek.equals("OOO")) {
                System.out.println(" wygral gracz 2");
                return false;
            }
        }
        return true;
    }


}//koniec klasy kolko




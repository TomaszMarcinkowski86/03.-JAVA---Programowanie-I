package zadania_0303.zadania;

public class Love {

    //symbol ustawiamy jako stała i wstawiamy do metod,
    // w ten sposób możemy zminić symbol z "*"
    // na inny jeżeli będziemy mieli taka potrzebę
    private static final String symbol = "*";

    private int spacja;
    private int wysokość;
    private int szerokośćLitery;
    private int szerokośćWyświetlacza;

    private String[][] wyświetlacz;

    public Love(int spacja, int wysokość, int szerokość) {
        this.spacja = spacja < 0 ? 0 : spacja;
        this.wysokość = wysokość < 4 ? 4 : wysokość;
        this.szerokośćLitery = szerokość < 3 ? 3 : szerokość;

        // szerokośc wyświetlacza to szerokośc wszystkich liter i spacji
        szerokośćWyświetlacza = 4 * szerokośćLitery + 3 * spacja;
        // tworzymy macierz o wymiarach napisu
        wyświetlacz = new String[wysokość][szerokośćWyświetlacza];
    }

    public String getString() {
        L();
        O();
        V();
        E();
        return convertToString();
    }

    private void L() {

        //ustawiamy pionowa kreskę
        for (int i = 0; i < wyświetlacz.length; i++) {
            wyświetlacz[i][0] = symbol;
        }

        // ustawiamy poziom kreskę
        for (int index = 0; index < szerokośćLitery; index++) {
            wyświetlacz[wysokość - 1][index] = symbol;
        }
    }

    private void O() {
        int pozycjaO = szerokośćLitery + spacja;

        // ustawiamy pionowe granice O
        for (int i = 1; i < wyświetlacz.length - 1; i++) {
            wyświetlacz[i][pozycjaO] = symbol;
            wyświetlacz[i][pozycjaO + szerokośćLitery - 1] = symbol;
        }
        // ustawiamy poziome granice O
        for (int index = 1; index < szerokośćLitery - 1; index++) {
            wyświetlacz[0][index + pozycjaO] = symbol;
            wyświetlacz[wysokość - 1][index + pozycjaO] = symbol;
        }
    }

    private void V() {
        int pozycjaV = szerokośćLitery * 2 + spacja * 2;

        // ustawiamy środek na dole V
        // jeżeli szerokośc litery jest parzysta dol V ma 2 znaki
        if (szerokośćLitery % 2 == 0) {
            wyświetlacz[wyświetlacz.length - 1][pozycjaV + szerokośćLitery / 2 - 1] = symbol;
            wyświetlacz[wyświetlacz.length - 1][pozycjaV + szerokośćLitery / 2] = symbol;

            // jeżeli szerokość litrey jest nieparzysta dol V ma jeden znak
        } else
            wyświetlacz[wyświetlacz.length - 1][pozycjaV + szerokośćLitery / 2] = symbol;

        // ustawiamy "skrzydla" V

        // todo -> można jeszcze dopracować dla większych  wysokości liter
        for (int index = 0; index < wyświetlacz.length - 1; index++) {
            wyświetlacz[index][pozycjaV + (2 * index / (wysokość + 1))] = symbol;
            wyświetlacz[index][pozycjaV + szerokośćLitery - 1 - (2 * index / (wysokość + 1))] = symbol;
        }
    }

    private void E() {
        int pozycjaE = szerokośćLitery * 3 + spacja * 3;

        //ustawiamy lewy trzon E
        for (int i = 0; i < wyświetlacz.length; i++) {
            wyświetlacz[i][pozycjaE] = symbol;
        }
        //ustawiamy "łapki"
        for (int index = 0; index < szerokośćLitery; index++) {
            wyświetlacz[0][index + pozycjaE] = symbol;
            wyświetlacz[((wysokość - 1) / 2)][index + pozycjaE] = symbol;
            wyświetlacz[wysokość - 1][index + pozycjaE] = symbol;
        }
    }

    private String convertToString() {
        StringBuilder sb = new StringBuilder();

        // iterujemy po wysokości
        for (int i = 0; i < wysokość; i++) {

            //iterujemy po szerokości
            for (int j = 0; j < szerokośćWyświetlacza; j++) {
                // jeżeli w danym miejscu macierzy mamy symbol do StringBuildera dodajemy symbol
                // w przeciwnym wypadku powinna to być spacja
                sb.append(wyświetlacz[i][j] == symbol ? symbol : " ");
            }
            // kończymy linię
            sb.append("\n");
        }
        return sb.toString();
    }

    // tu możemy testować output!
    public static void main(String[] args) {
        Love love = new Love(2, 6, 6);
        System.out.println(love.getString());
    }
}

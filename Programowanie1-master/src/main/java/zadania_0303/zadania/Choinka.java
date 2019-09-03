package zadania_0303.zadania;

public class Choinka {

    private static final int WYSOKOŚĆ_TRZONU = 3;
    private static final String SYMBOL = "*";

    private int liczbaGalezi;
    private int wysokoscGalezi;

    public Choinka(int liczbaGalezi, int wysokoscGalezi) {
        this.liczbaGalezi = liczbaGalezi;
        this.wysokoscGalezi = wysokoscGalezi;
    }

    public String wypisz() {
        StringBuilder sb = new StringBuilder();
        czubek(sb);
        for (int i = 0; i < liczbaGalezi; i++) {
            galaz(sb);
        }
        trzon(sb);
        return sb.toString();
    }

    private void czubek(StringBuilder sb) {
        for (int i = 0; i < wysokoscGalezi; i++) {
            sb.append(" ");
        }
        sb.append(SYMBOL);
        for (int i = 0; i < wysokoscGalezi; i++) {
            sb.append(" ");
        }
        sb.append("\n");
    }

    private void trzon(StringBuilder sb) {
        for (int i = 0; i < WYSOKOŚĆ_TRZONU; i++) {
            czubek(sb);
        }
    }

    private void galaz(StringBuilder sb) {
        for (int i = 0; i < wysokoscGalezi; i++) {

            // lewa strona
            for (int j = 0; j < wysokoscGalezi; j++) {
                sb.append(j >= wysokoscGalezi - i - 1 ? SYMBOL : " ");
            }
            //srodek
            sb.append(SYMBOL);

            //prawa strona
            for (int j = 0; j < wysokoscGalezi; j++) {
                sb.append(j <= i ? SYMBOL : " ");
            }
            sb.append("\n");
        }

    }

    public static void main(String[] args) {
        Choinka choinka = new Choinka(3, 3);
        System.out.println(choinka.wypisz());
    }
}

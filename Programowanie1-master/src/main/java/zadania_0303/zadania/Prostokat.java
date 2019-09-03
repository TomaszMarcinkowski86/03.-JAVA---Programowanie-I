package zadania_0303.zadania;

public class Prostokat {
    int długość;
    int wysokość;

    public Prostokat(int długość, int wysokość) {
        this.długość = długość;
        this.wysokość = wysokość;
    }

    public void wypisz() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < wysokość; i++) {
            //czy jest górną lub dolna krawędzia
            if (i == 0 || i == wysokość - 1)
                wypiszPełnąLinie(sb);
            else
                wypiszNiepełnąLinie(sb);
            // znak nowej linii
            sb.append("\n");
        }
        System.out.println(sb);
    }

    // tworzymy krawędzie boczne
    private void wypiszNiepełnąLinie(StringBuilder sb) {
        for (int i = 0; i < długość; i++) {
            if (i == 0 || i == długość - 1)
                sb.append("*");
            else
                sb.append(" ");
        }
    }
// tworzymy górną lub dolną krawędź
    private void wypiszPełnąLinie(StringBuilder sb) {
        for (int i = 0; i < długość; i++) {
            sb.append('*');
        }
    }
// sprawdzamy nasz kod!
    public static void main(String[] args) {
        new Prostokat(5,10).wypisz();
    }
}


package zadania_0303.rekurencja;

public class Silnia {

    public static int oblicz(int podstawa) {
        if (podstawa < 0)
            throw new IllegalArgumentException();
        if (podstawa == 0)
            return 1;
        return oblicz(podstawa - 1) * podstawa;
    }

    public static int obliczv2(int podstawa) {
        if (podstawa < 0)
            throw new IllegalArgumentException();
        return podstawa == 0 ? 1 : (oblicz(podstawa - 1)) * podstawa;
    }
}

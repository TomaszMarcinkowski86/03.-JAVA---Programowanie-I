package zadania_0303.rekurencja;

public class Binarna {
    public static String zwróćBinarna(int input) {
        if (input < 0)
            throw new IllegalArgumentException();
        return input < 2 ? String.valueOf(input % 2) : zwróćBinarna(input / 2) + input % 2;
    }
}


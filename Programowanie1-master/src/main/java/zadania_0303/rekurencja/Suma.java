package zadania_0303.rekurencja;

public class Suma {

    public static int obliczSumę(int[] input) {
        return obliczSume(input, 0);
    }

    private static int obliczSume(int[] input, int index) {
        return index == input.length - 1 ? input[index] : input[index] + obliczSume(input, index + 1);
    }
}

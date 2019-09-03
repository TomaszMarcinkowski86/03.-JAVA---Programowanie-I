package zadania_0303.rekurencja;

public class Fibonacci {
    public static int oblicz(int n) {
        if (n == 1)
            return 1;
        if (n == 2)
            return 1;
        return oblicz(n - 1) + oblicz(n - 2);
    }

    public static void main(String[] args) {
        System.out.println(oblicz(39));
    }
}
package zadania_0903.lambdas.collections;

/**
 * 2. Dla tablicy wejściowej input zawierającą liczby typu int zwrócić tablicę zawierającą
 *    ilość elementów ujemnych oraz sumę elementów dodatnich.
 *    Jeśli tablica będzie pusta lub null, wtedy należy zwrócić pustą tablicę.
 */
public class Task2 {
    public static int[] function(int[] a) {
        int[] wynik = {0, 0};
        if (a == null || a.length == 0) {
            return new int[0];
        } else {
            for (int i = 0; i < a.length; i++) {
                if (a[i] > 0) {
                    wynik[1] += a[i];
                } else {
                    wynik[0]++;
                }
            }
        }
        return wynik;
    }
}

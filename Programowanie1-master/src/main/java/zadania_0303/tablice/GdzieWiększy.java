package zadania_0303.tablice;

import java.util.Random;

public class GdzieWiększy {
    private static Random random = new Random();

    public static void gdzieWikszy(int długość) {
        StringBuilder sb = new StringBuilder("Indeksy, w których element mniejszy występuje po większym to: ");
        int[] tab = new int[długość];

        for (int i = 0; i < długość; i++) {
            tab[i] = random.nextInt();
        }
        for (int i = 1; i < długość; i++) {
            if (tab[i] < tab[i-1])
                sb.append(i).append(", ");
        }
        sb.deleteCharAt(sb.length()-1).deleteCharAt(sb.length()-1);

        System.out.println(sb);
    }
}

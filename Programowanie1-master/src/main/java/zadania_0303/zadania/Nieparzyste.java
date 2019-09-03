package zadania_0303.zadania;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Nieparzyste {

    public static void wypisz(int limit) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i <= limit; i++) {
            if (i % 2 == 1)
                sb.append(i).append(", ");
        }

        //usuwamy spacje na końcu
        sb.deleteCharAt(sb.length() - 1);
        //usuwamy przecinek na końcu
        sb.deleteCharAt(sb.length() - 1);
        System.out.println(sb);
    }


    // efekt taki sam jak wyżej a o ile ciekawszy efekt!
    public static void wypiszStrumieniem(int limit) {
        System.out.println(
                IntStream.rangeClosed(0, limit)                     // tworzymy strumień małych intów od 0 do limit włącznie
                        .filter(i -> i % 2 == 1)                    // filtrujemy po liczbach nieparzystych
                        .mapToObj(x-> String.valueOf(x))            // każdego inta przekształcamy w String'a
                        .collect(Collectors.joining(", "))  // łączymy wszystkie Stringi z użyciem delimitera
        );
    }
}

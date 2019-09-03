package zadania_1003.collections;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class KalkulatorStreamem {

    private static Map<String, BinaryOperator<Integer>> operations; //mapa operacja: lambda do reduce

    static {
        // inicjujemy i uzupełniamy mapę operacji
        operations = new HashMap<>();
        operations.put("\\*", (x, y) -> x * y);
        operations.put("/", (x, y) -> x / y);
    }

    // metda która liczy wynik z zadanego String-a
    public static Integer count(String input) {
        return doOperations(input);
    }

    // metoda w której wykonujemy mnożenie i dzielenie, a następnie  łczymy to co zsotało do jednego stringa
    private static Integer doOperations(String input) {
        return Arrays.stream(input.split("(?=[\\+-])"))// dzielimy stringa po "+" i "-" tak żeby znaki pozostały w stringu i były po jego lewej stronie
                .sequential() // zapewniamy  ze wszystko będzie się działo sekwencyjnie _> po kolei
                .map(x -> x.replaceAll("\\+", "")) //usuwamy wszytskie plusy ze strumienia stringów
                .map(mutiplyOrDivide) // wykonujemy operacje mnożenia i dzilenia
                .map(Integer::valueOf) // mapujemy na INtereg
                .reduce((x, y) -> x + y) // dodejemy to co zostało
                .get(); // rozpakowujemy wynik
    }

    // jeżeli w stringu jest operacja mnożeni lub dzielenia to ja wyknujemy, jeżęli nie to zwracamy stringa bez zmian
    private static Function<String, String> mutiplyOrDivide =
            s -> s.contains("*") ? doOperation(s, "\\*") : s.contains("/") ? doOperation(s, "/") : s;

    // metoda do wykonania operacji mnoeżenia lub dzielenia
    private static String doOperation(String s, String operation) {
        return Arrays.stream(s.split(operation)) // dzielimy String po znaku operacji
                .map(Integer::valueOf) // mapujemy na Integer
                .reduce(operations.get(operation)) // wykonujemy operację po jej wyciagnieciu z mapy Operations
                .get() // rozpakowujemy wynik
                .toString(); // zwracamy String
    }
}

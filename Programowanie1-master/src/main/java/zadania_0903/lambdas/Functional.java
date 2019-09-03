package zadania_0903.lambdas;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Functional {


    /**
     * Obliczyć kwadraty elementów wejściowej listy.
     */
    public List<Integer> squares(List<Integer> list) {
        return list.stream().map(x -> x * x).collect(Collectors.toList());
    }

    /**
     * Zwrócić tylko parzyste liczby.
     */
    public List<Integer> even(List<Integer> list) {
        return list.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
    }

    /**
     * Policzyć liczby nieparzyste.
     */
    public Long countOdd(List<Integer> list) {
        return list.stream().filter(x -> x % 2 != 0).count();
    }

    /**
     * Zwrócić najmniejszą liczbę z listy.
     */
    public Integer smallest(List<Integer> list) {
        return list.stream().min(Integer::compareTo).get();
    }

    /**
     * Zwrócić średni arytmetyczna liczb z listy.
     */
    public Integer avarage(List<Integer> list) {
        return list.stream().reduce((x, y) -> x + y).get() / list.size();
    }

    /**
     * Zwrócić sumę kwadratów liczb z listy.
     */
    public Integer sumOfSquares(List<Integer> list) {
        return list.stream().map(x -> x * x).reduce((x, y) -> x + y).get();
    }

    /**
     * Zwrócić sumę modułów liczb z listy.
     */
    public Integer sumOfAbs(List<Integer> list) {
        return list.stream().map(Math::abs).reduce((x, y) -> x + y).get();
    }

    /**
     * Z zadanego stringa usunać, zadana literę.
     */
    public String removeLetter(String input, String letterToRemove) {
        return Arrays.stream(input.split("")).filter(x -> !x.equalsIgnoreCase(letterToRemove)).collect(Collectors.joining());
    }

    /**
     * Z zadanego zdania usunać wyrazy o określonej długości.
     */
    public String removeWordOfLength(String input, int length) {
        return Arrays.stream(input.split(" ")).filter(x -> x.length() != length).collect(Collectors.joining(" "));
    }

    /**
     * Z zadanego zdania usunać liczby.
     */
    public String removeNumbers(String input) {
        return input.replaceAll("\\d", "").replaceAll("  ", " ");
    }


}

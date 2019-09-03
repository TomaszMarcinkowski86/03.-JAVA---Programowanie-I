package zadania_1003.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * 7. Stwórz implementację kalkulatora, która dla podanego elementu String,
 * zachowa kolejnośc dzialań. Czy jest to możliwe do uzyskania przy
 * wykorzystaniu Twojej implementacji?
 */
//  1+27-63*5/3+2 -> przykłdowy input
public class KalkulatorZKolejnościa {

    ArrayList<Integer> liczby;
    ArrayList<String> dzialania;


    public int policz(String dzialanie) {
        podziel(dzialanie);
        wykonajDziałania();
        return liczby.get(0);
    }
// dzielimy String dzialania na dwie ArrayListy działań i liczb
    private void podziel(String dzialanie) {
        dzialania = (ArrayList<String>) Arrays.stream(dzialanie.split("\\d+"))
                .filter(s -> !s.isEmpty())
                .collect(Collectors.toList());

        liczby = (ArrayList<Integer>) Arrays.stream(dzialanie.split("\\D"))
                .filter(s -> !s.isEmpty())
                .map(Integer::valueOf)
                .collect(Collectors.toList());
    }

    private void wykonajDziałania() {
        for (int i = 0; i < dzialania.size();) {
            if (dzialania.get(i).matches("[*/]")) {
                działanie(dzialania.get(i), i);
            }
            else  i++;
        }
        while (dzialania.size()> 0 ){
            działanie(dzialania.get(0), 0);
        }
    }

    private void działanie(String działanie, int index) {

        switch (działanie) {
            case "+":
                liczby.set(index,liczby.get(index) + liczby.get(index +1));
                posprzataj(index);
                break;
            case "-":
                liczby.set(index,liczby.get(index) - liczby.get(index +1));
                posprzataj(index);
                break;
            case "*":
                liczby.set(index,liczby.get(index) * liczby.get(index +1));
                posprzataj(index);
                break;
            case "/":
                liczby.set(index,liczby.get(index) / liczby.get(index +1));
                posprzataj(index);
                break;
        }
    }

    private void posprzataj(int index) {
        liczby.remove(index +1);
        dzialania.remove(index);
    }

    public static void main(String[] args) {
        KalkulatorZKolejnościa calc = new KalkulatorZKolejnościa();

        System.out.println(calc.policz("1+27-63*5/3+2"));
    }

}

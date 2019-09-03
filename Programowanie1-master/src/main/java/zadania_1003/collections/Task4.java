package zadania_1003.collections;

import java.util.ArrayDeque;
import java.util.stream.IntStream;


/**
 * 4. Napisz program który mając zadany stos (ArrayDeque) wyszuka w nim największą
 * wartość i umieści tą wartość na szczycie stosu.
 */
public class Task4 {
    public ArrayDeque<Integer> najwieksze(ArrayDeque<Integer> stack) {
        ArrayDeque<Integer> temp = stack.clone();

        Integer maxTemp = temp.pop(); // zmienna tymczasowa dla przechowania największej wartości

        for (Integer i : temp) {
            maxTemp = maxTemp < i ? i : maxTemp;  //sprwadzamy która wartośc jest większa i zapisujemy ja w maxTemp
        }

//        for (int i = 0; i < temp.size(); i++) {
//            Integer tempInt= temp.pop();
//            maxTemp = maxTemp < tempInt ? tempInt : maxTemp;
//        }

        stack.push(maxTemp);
        return stack;
    }

// metoda do testowania kodu
    public static void main(String[] args) {
        ArrayDeque<Integer> integers = new ArrayDeque<>();

        IntStream.range(0, 10)
                .boxed()
                .forEach(e -> integers.push(e));

        System.out.println(integers);

        Task4 t4 = new Task4();

        t4.najwieksze(integers);

        System.out.println(integers);

    }
}

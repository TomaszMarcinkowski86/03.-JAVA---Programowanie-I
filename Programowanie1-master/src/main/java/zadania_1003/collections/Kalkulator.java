package zadania_1003.collections;

import zadania_1003.collections.dequeues.MyQueue;

/**
 * Wykorzystujc swoja implementację kolejki stwórz kalkulator,
 * /    który zachowuje kolejność działań dla [+,-,*,/] na zadanym Stringu.
 * /
 * / Przyjmij, że działania będ wykonywane w kolejności wystpienia, nie w kolejności matematycznej.
 */
public class Kalkulator {

    private MyQueue<Character> queue = new MyQueue<>();  // kolejka do rozdzielenia pojedynczych stringów
    private MyQueue<Integer> numbers = new MyQueue<>();  // kolejka przeznaczona dla liczb
    private MyQueue<Character> digits = new MyQueue<>(); // kolejka przeznaczona dla znaków operacji matematycznych

    private final String rownanie = "2+2*2"; // przykładowe równanie
    private int result = 0;  // int przechowujacy aktulany wynik


    // wypełnij kolejke queue a następnie jej elementy wstaw do odpowiednich kolejek
    public void fillQueue(String s) {
        for (int i = 0; i < s.length(); i++) {
            queue.push(s.charAt(i));
        }
        splitEqual();
    }

    // rozdziel Stringi z queue do odpowiednich kolejek
    public void splitEqual() {
        while (queue.size() > 0) {
            if (Character.isDigit(queue.peek())) {
                numbers.push(Character.getNumericValue(queue.pop()));

            } else {
                digits.push(queue.pop());
            }
        }
    }

    // wykonaj działanie
    public int calculate(String str) {
        fillQueue(str);

        result = numbers.pop();
        while (numbers.size() > 0) {
            if (!digits.isEmpty()) {
                switch (digits.peek()) {
                    case '+':
                        result += numbers.pop();
                        break;
                    case '-':
                        result -= numbers.pop();
                        break;
                    case '*':
                        result *= numbers.pop();
                        break;
                    case '/':
                        result /= numbers.pop();
                        break;
                }
            }
            digits.pop();
        }
        return result;
    }
}
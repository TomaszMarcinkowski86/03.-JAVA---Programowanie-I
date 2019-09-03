package zadania_0303.zadania;

public class FizzBuzz {
    public static void wypisz() {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < 21; i++) {
            if (i % 3 == 0) {
                sb.append("Fizz");
            }
            if (i % 5 == 0) {
                sb.append("Buzz");
            }
            if (i % 3 != 0 && i % 5 != 0){
                sb.append(i);
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }

    public static void main(String[] args) {
        wypisz();
    }

}

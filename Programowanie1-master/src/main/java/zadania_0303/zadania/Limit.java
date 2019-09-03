package zadania_0303.zadania;

public class Limit {

    public static void policz(int limit) {
        int ilość = 0;
        int suma = 0;

        do {
            ilość++;
            suma += ilość;
        } while (suma < limit);

        System.out.println("Ilość liczb to: " + ilość +
                "\nSuma liczb to: " + suma);
    }

    public static void main(String[] args) {
        policz(78);
    }
}

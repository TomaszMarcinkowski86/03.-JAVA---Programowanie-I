package zadania_1003.collections;


// klasa testowa dla sprawdzneia poprawności działania kalkulatora
public class KalkulatorMain {
    public static void main(String[] args) {
        String rownanie = "4*5+3+3+3+3*2";

        Kalkulator k = new Kalkulator();
        System.out.println(k.calculate(rownanie));
    }
}

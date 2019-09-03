package zadania_0303.zadania;

public class Linia {
    public static void wypisz(int długość) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < długość; i++) {
            sb.append('*');
        }
        System.out.println(sb);
    }
}
//            dwie operacje poniżej robią właściwie to samo
//            bo Java stworzy nowego StringBuildera za nas!

//            "*"+"*"+"*";  <-
//            new StringBuilder("*").append("*").append("*");

// Ale w przypadku pętli for będzie tworzone kilka/kilkanaście/kilkadziesiąt
// Stringów dla linii każdej długości po kolei!!
package zadania_0303.zadania;

import java.math.BigDecimal;

public class Sześcian {

    public static long policz(long podstawa) {
        return (long) Math.pow(podstawa, 3);
    }

    public static BigDecimal policz(BigDecimal podstawa){
        return podstawa.pow(3);
    }
}

package zadania_0903.lambdas.collections;


import java.util.*;

/**
 * 1. Napisz symulator losowania Lotto
 * * Z  użyciem Set
 * * Z  użyciem ArrayList
 */
public class Lotto {
    private Random random = new Random();

    private int losujLiczbe() {
        return random.nextInt(48) + 1;
    }

    public Set<Integer> wylosuj() {
        Set<Integer> set = new HashSet<>();
        while (set.size() < 6) {
            set.add(losujLiczbe());
        }
        return set;
    }

    public List<Integer> wylosujArray() {
        List<Integer> lista = new ArrayList<>();
        while (lista.size() < 6) {
            int someNumber = losujLiczbe();
            if (!lista.contains(someNumber))
                lista.add(losujLiczbe());
        }
        return lista;
    }

}


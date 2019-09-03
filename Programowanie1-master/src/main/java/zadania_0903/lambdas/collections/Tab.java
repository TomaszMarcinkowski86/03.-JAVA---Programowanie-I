package zadania_0903.lambdas.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//4. Utwórz dowolną klasę, a potem zainicjalizowaną tablicę obiektów tej klasy.
//   Zawartością tablicy wypełnij listę.
//   Wyłuskaj z niej fragment listy metodą subList(), a następnie usuń tę podlistę z oryginalnej listy.
//
public class Tab {

    Task4[] tablica = {new Task4(5),
            new Task4(2),
            new Task4(6),
            new Task4(3),
            new Task4(70),
            new Task4(2)
    };

    List<Task4> list = new ArrayList<>();

    {
        List<Task4> lista2 = Arrays.stream(tablica)
                .collect(Collectors.toList());

        Arrays.stream(tablica)
                .forEachOrdered(e -> list.add(e));

        lista2.subList(1,3)
                .stream()
                .forEachOrdered(lista2::remove);
//        lista2.remove();

        list.removeAll(list.subList(1,3));
        System.out.println(list);
        System.out.println(lista2);



    }



}

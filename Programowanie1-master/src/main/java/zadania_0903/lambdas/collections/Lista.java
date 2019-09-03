package zadania_0903.lambdas.collections;

import java.util.ArrayList;
import java.util.List;

public class Lista {

    List<Integer> list = new ArrayList<>();
    List<Integer> list2 = new ArrayList<>();

    // wypełniamy listę  wartościami od 0 do 9
    private void wypelnij(List<Integer> list) {
        for (int i = 0; i <= 9; i++) {
            list.add(i);
        }
    }


    public void zlaczListy() {
        // wypełniamy listy
        wypelnij(list);
        wypelnij(list2);

        // iterujemy po liście list2 w odwrotnej kolejności i
        // dodajemy jej elementy do list1
        for (int i = (list2.size() - 1); i >= 0; i--) {
            list.add(list2.get(i));

        }
        System.out.println(list);
    }


}

package zajęcia_3003.b_functional;

import zajęcia_3003.e_oop.World;
import zajęcia_3003.e_oop.util.Creator;

import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Functional {

    public static void main(String[] args) {

        //Optional - kontener na wartość która moze być nullem

        World world = Creator.getWorld();
        Optional.ofNullable(world.getCountries())
                .map(countries -> countries.get(0))
                .map(country -> country.getCities())
                .map(cities -> cities.get(0))
                .orElse(null);  // orElse zwraca wartość jeżeli jest jeżeli nie ma to możemy wstawić co ma zwrócić
                                      // jest jeszcze orElseGet i orElseThrow. raczej używa sie orElse.

//                .getCities().get(0)
//                .getFlats().get(0)
//                .getPeople().get(0)
//                .getFirstName();


        //Streams -
        List<Integer> list = generateRandomIntegerList();

        Function<Integer, Integer> pow2=i->i*i;

        list.stream().map(pow2);
        list.stream().map(i->i*i);
        list.stream().map(new Function<Integer,Integer>() {
                              @Override
                              public Integer apply(Integer i) {
                                  return i * i;
                              }
                          });


        //anonymous class


        //map -> transformacja (zmiana wartości na inną)
          list.stream().map(x->x*x);
        //limit -> ogranicza liczbę elementów
          list.stream().limit(20);
        //skip -> omija coś (tu pomija pierwsze 20 elementów streama)
          list.stream().skip(20);
        //filter -> filtruje coś sito które przepuszcza tylko jakieś elementy
          list.stream().filter(x->x>50000);
        //peek -> trzeba uważać
          list.stream().limit(100)
                  .peek(x-> System.out.println(x*x))
                  .map(pow2)
                  .forEach(System.out::println);
        //forEach -> wykonuje jakąś operację na każdym elemncie strumienia i nie zwraca żadnej wartości. Po tym zamykamy strumień i niemożemy z tym nic zrobić.
        //
           list.stream().forEach(System.out::println);
        //distinct -> zwraca nam unikalne w każdym strumieniu
           list.stream().distinct();


        //flatMap -> jak mamy listę list lub strumień strumieni to spłaszcza to i mamy strumień słożony z elementów wszystkich strumieni
     //      list.stream().flatMap(x->x*2);
        //anyMatch ->sprawdzamy warunek czy coś pasuje. Dostajemy true albo false
          list.stream().anyMatch(x->x<0);
        //noneMatch ->
          list.stream().noneMatch(x->x<0);
        //allMatch -> czy wszystko np. z kolekcji  pasuje
          list.stream().allMatch(x->x<0);
        //reduce -> z wszystkich elementów strumienia tworzy nam jeden element
          list.stream().reduce((x,y)->x+y);
        //collect
         list.stream().collect(Collectors.toList());  // do łączenia stringów może być wykorzystane .joining
        //count -> liczy elementy struminiea. operacja terminiująca czyli zamykająca strumień
          list.stream().count();
        //findFirst -> zwróci pierwsszy eleemnt strumienia
          list.stream().findAny();
        //findAny - > to zwraca dowolny element z listy (losowy)
          list.stream().findAny();


          ///------------Flagi--------------
        //sequential -> działa jak pętla for
          list.stream().sequential();

        //parallel-> odpala kilka wątków i wykonuje operacje na strumieniuna kilku wątkach
          list.stream().parallel();

         //  IntStream
           IntStream.range(0,10); // stworzy od 0-9
           IntStream.rangeClosed(0,10); // stworzy od 0-10


    }

    private static List<Integer> generateRandomIntegerList() {
        Random random = new Random();
        return IntStream.range(0, 1000)
                .map(i -> random.nextInt(100000))
                .boxed()
                .collect(Collectors.toList());
    }

    private static List<Integer> generateRandomIntegerListWithNulls() {
        Random random = new Random();
        return IntStream.range(0, 1000)
                .map(i -> random.nextInt(100000))
                .boxed()
                .map(x -> Math.random() > 0.5 ? x : null)
                .collect(Collectors.toList());
    }
}

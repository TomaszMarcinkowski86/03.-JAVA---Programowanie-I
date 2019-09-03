package zajęcia_3003.e_oop.util;

import zajęcia_3003.e_oop.Country;
import zajęcia_3003.e_oop.World;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Creator {

    public static <T> T getOrNull(T t) {
        return Math.random() > 0.5 ? t : null;
    }

    public static World getWorld() {
        return new World(getRandomCountryList());
    }

    private static List<Country> getRandomCountryList() {
        return IntStream.rangeClosed(0, 40)
                .mapToObj(i -> CountryGenerator.getRandomCountry())
                .collect(Collectors.toList());
    }
}



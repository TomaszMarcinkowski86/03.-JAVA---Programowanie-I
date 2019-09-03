package zadania_1703.money.transfer;

import zadania_1703.money.transfer.bank.Account;
import zadania_1703.money.transfer.bank.Bank;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class DataPreparation {

    private static int groceryConst = 15;

    /**
     * Metoda która tworzy przykłdow osobę i ja zwraca
     *
     * @param bank
     * @return
     */

    static Person preparePerson1(Bank bank) {
        Account account = bank.createAndAddAccount(BigDecimal.valueOf(1000), BigDecimal.valueOf(300));

        return new Person("Jan",
                "Kowalski",
                account,
                bank.giveDebitCardToAccount(account),
                "987321"
        );
    }

    /**
     * Metoda która tworzy przykłdow osobę i ja zwraca
     *
     * @param bank
     * @return
     */
    static Person preparePerson2(Bank bank) {
        Account account = bank.createAndAddAccount(BigDecimal.valueOf(2000), BigDecimal.valueOf(10));

        return new Person("Janusz",
                "Nowak",
                account,
                bank.giveCreditCardToAccount(account),
                "234594"
        );
    }

    /**
     * Metoda która tworzy przykłdow osobę i ja zwraca
     *
     * @param bank
     * @return
     */
    static Person preparePerson3(Bank bank) {
        Account account = bank.createAndAddAccount(BigDecimal.valueOf(10000), BigDecimal.valueOf(500));

        return new Person("Mariusz",
                "Pudzianowski",
                account,
                bank.giveDebitCardToAccount(account),
                "1234567"
        );
    }
    /**
     * Metoda która tworzy przykładowego pracodawcę dla 3 podanych osób
     *
     * (*) -> metodę można przerobić by korzystała z varargs i i do każdej osoby przypisaywała losow pensję
     */

    static Employer prepareEmployer(Person person1, Person person2, Person person3) {
        Employer employer = new Employer();
        employer.addEmployee(person1, BigDecimal.valueOf(1000));
        employer.addEmployee(person2, BigDecimal.valueOf(1400));
        employer.addEmployee(person3, BigDecimal.valueOf(10000));
        return employer;
    }


    /**
     *
     * Metoda która tworzy przykładowa listę produktów i j zwraca
     */
    static List<Product> createProductList() {
        return Stream.of(
                new Product("Ser", BigDecimal.valueOf(10)),
                new Product("Chleb", BigDecimal.valueOf(3)),
                new Product("Kawa", BigDecimal.valueOf(40)),
                new Product("Herbata", BigDecimal.valueOf(10)),
                new Product("Whisky", BigDecimal.valueOf(150)),
                new Product("Jajka ", BigDecimal.valueOf(15))

        ).collect(Collectors.toList());
    }

    /**
     *
     * Metoda która dla zadanej liczby produktów tworzy losowa liste zakupów.
     *
     */

    static List<Product> generateRandomGroceries(List<Product> products) {
        return IntStream.range(0, (int) (Math.random() * groceryConst))
                .map(i -> products.size() - 1)
                .map(i -> (int) (i * Math.random()))
                .mapToObj(products::get)
                .collect(Collectors.toList());
    }
}

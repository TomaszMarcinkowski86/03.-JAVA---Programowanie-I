package zadania_1703.money.transfer.bank;


import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Bank {

    String name;

    private List<Account> accounts;

    public Bank(String name) {
        this.name = name;
        accounts = new ArrayList<>();
    }

    // metoda do wpłacania pieniędzu na konto
    boolean add(Account account, BigDecimal amount) {
        account.setBalance(account.getBalance().add(amount));
        System.out.println(this.name + " shipped an amount of " + amount + " to account " + account.getNumber());
        return false;
    }

    boolean withdraw(Account account, BigDecimal amount) {
        return false;
    }

    // tworzymy konto o określonym saldzie i limicie i dodajemy do Listy kont w banku
    public Account createAndAddAccount(BigDecimal saldo, BigDecimal limit) {
        Account account = new Account(saldo, limit, generateAccountNumber(), this);
        accounts.add(account);
        return account;
    }

    // generujemy losowy numer konta
    private String generateAccountNumber() {
        System.out.println(this.name + " generating account number");
        return IntStream.range(0, 23)
                .map(x -> (int) (Math.random() * 9))
                .mapToObj(String::valueOf)
                .collect(Collectors.joining());
    }

    // Wydajemy kartę kredytowa do zadanego konta
    public CreditCard giveCreditCardToAccount(Account account) {
        System.out.println(this.name + " created a new Credit Card");
        return new CreditCard(account);
    }

    // Wydajemy kartę debetowa do zadanego konta
    public DebitCard giveDebitCardToAccount(Account account) {
        System.out.println(this.name + " created a new Debit Card");
        return new DebitCard(account);
    }

}

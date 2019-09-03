package zadania_1703.money.transfer;


import zadania_1703.money.transfer.bank.Account;
import zadania_1703.money.transfer.bank.BankCard;

import java.util.List;

public class Person {

    String lastName;

    String firstName;

    Account account;

    BankCard card;

    String id;


    public Person(String lastName, String firstName, Account account, BankCard card, String id) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.account = account;
        this.card = card;
        this.id = id;
    }

    // metoda odpowiedzialna za robienie zakupów
    public void doShopping(List<Product> productList, Shop shop) {
        System.out.println(this.firstName + " " + this.lastName + " attempting to do groceries.");
        shop.doGrocery(productList, this.card);
    }


    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public Account getAccount() {
        return account;
    }

    public BankCard getCard() {
        return card;
    }

    public String getId() {
        return id;
    }


}

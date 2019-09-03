package zadania_1703.money.transfer;

import zadania_1703.money.transfer.bank.Bank;

import static zadania_1703.money.transfer.DataPreparation.*;

public class TestApp {

    public static void main(String[] args) {

        //tworzymy bank
        Bank bank = new Bank("MojBank");

        //tworzymy przykładowe osoby
        Person person1 = preparePerson1(bank);
        Person person2 = preparePerson2(bank);
        Person person3 = preparePerson3(bank);

        //tworzymy sklep
        Shop shop = new Shop(createProductList());

        //tworzymy pracodawce
        Employer employer = prepareEmployer(person1, person2, person3);


        //odpalamy nasza aplikację w kilku watkach !
        //wypłata wynagrodzeń
        new Thread(new SalaryPayer(employer)).start();

        //zakupy
        new Thread(new GroceryMaker(person1, shop)).start();
        new Thread(new GroceryMaker(person2, shop)).start();
        new Thread(new GroceryMaker(person3, shop)).start();
    }

}

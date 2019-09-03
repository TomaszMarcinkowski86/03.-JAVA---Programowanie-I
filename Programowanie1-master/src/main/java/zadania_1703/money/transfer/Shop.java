package zadania_1703.money.transfer;

import zadania_1703.money.transfer.bank.BankCard;

import java.math.BigDecimal;
import java.util.List;

public class Shop {

    private List<Product> productsOnShelv;

    public Shop(List<Product> productsOnShelv) {
        this.productsOnShelv = productsOnShelv;
    }

    public List<Product> getProductsOnShelv() {
        return productsOnShelv;
    }

    public void setProductsOnShelv(List<Product> productsOnShelv) {
        this.productsOnShelv = productsOnShelv;
    }

    public void doGrocery(List<Product> products, BankCard card) {

        // liczymy wysokośc rachunku
        BigDecimal bill = countBill(products);

        // usuwamy z listy zakupów produkty które sa na półce
        products.removeAll(productsOnShelv);

        //płacimy kart za zakupy!
        card.pay(bill);
        System.out.println("Shop cashed a new bill with amount: " + bill.toString());
    }


    private BigDecimal countBill(List<Product> products) {
        return products.stream()
                .filter(productsOnShelv::contains) //sprawdzmay czy produkt jest na półce
                .map(Product::getPrice)  //zmieniamy produkt na jego cenę
                .reduce(BigDecimal::add) // sumujemy wszystkie ceny
                .orElse(BigDecimal.ZERO); //jeżeli ceny były null zwracamy ZERO!
    }


}

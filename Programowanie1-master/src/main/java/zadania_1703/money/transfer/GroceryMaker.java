package zadania_1703.money.transfer;

import static zadania_1703.money.transfer.DataPreparation.generateRandomGroceries;


/**
 * Klasa która wykonuj dla danej osoby zakupy raz na dwie sekundy
 */
class GroceryMaker implements Runnable {

    private Person person;
    private Shop shop;

    public GroceryMaker(Person person, Shop shop) {
        this.person = person;
        this.shop = shop;
    }

    @Override
    public void run() {
        while (true) {
            person.doShopping(generateRandomGroceries(shop.getProductsOnShelv()), shop);
            try {
                Thread.currentThread().sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

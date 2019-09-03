package zadania_1703.money.transfer.bank;


import java.math.BigDecimal;

/**
 * Część metod jest z modyfikatorem default
 * ponieważ niektóre czynności powinny być możliwe
 * tylko w obrębie banku!
 */

public class Account {

    private BigDecimal balance;

    private BigDecimal dailyLimit;

    private BigDecimal currentDailyLimit;

    private String number;

    private Bank bank;

    // default - tylko bank może stworzyc konto
    Account(BigDecimal balance, BigDecimal dailyLimit, String number, Bank bank) {
        this.balance = balance;
        this.dailyLimit = dailyLimit;
        this.number = number;
        this.bank = bank;
        this.currentDailyLimit = dailyLimit;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public BigDecimal getDailyLimit() {
        return dailyLimit;
    }

    void setDailyLimit(BigDecimal dailyLimit) {
        this.dailyLimit = dailyLimit;
    }

    public String getNumber() {
        return number;
    }

    public Bank getBank() {
        return bank;
    }

    BigDecimal getCurrentDailyLimit() {
        return currentDailyLimit;
    }

    void setCurrentDailyLimit(BigDecimal currentDailyLimit) {
        this.currentDailyLimit = currentDailyLimit;
    }

    public void payAmount(BigDecimal ammount){
        this.getBank().add(this, ammount);
    }
}

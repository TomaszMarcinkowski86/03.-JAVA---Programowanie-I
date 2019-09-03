package zadania_1703.money.transfer.bank;

import java.math.BigDecimal;

public class CreditCard implements BankCard {

    private Account account;

    CreditCard(Account account) {
        this.account = account;
    }

    public Account getAccount() {
        return account;
    }

    @Override
    public boolean pay(BigDecimal amount) {
        account.setBalance(account.getBalance().subtract(amount));
        account.setCurrentDailyLimit(account.getCurrentDailyLimit().subtract(amount));
        return true;
    }

    @Override
    public boolean withdraw(BigDecimal amount) {
        account.setBalance(account.getBalance().subtract(amount));
        account.setCurrentDailyLimit(account.getCurrentDailyLimit().subtract(amount));
        return true;
    }
}

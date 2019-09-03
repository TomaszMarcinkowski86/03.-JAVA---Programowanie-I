package zadania_1703.money.transfer.bank;

import java.math.BigDecimal;

public class DebitCard implements BankCard {

    Account account;

    DebitCard(Account account) {
        this.account = account;
    }

    @Override
    public boolean pay(BigDecimal amount) {
        if (isAfordable(amount)) {
            account.setBalance(account.getBalance().subtract(amount));
            account.setCurrentDailyLimit(account.getCurrentDailyLimit().subtract(amount));
            return true;
        }
        return false;
    }

    private boolean isAfordable(BigDecimal amount) {
        return getAccount().getBalance().compareTo(amount) >= 0
                && getAccount().getCurrentDailyLimit().compareTo(amount) >= 0;
    }

    @Override
    public boolean withdraw(BigDecimal amount) {
        if (isAfordable(amount)) {
            account.setBalance(account.getBalance().subtract(amount));
            account.setCurrentDailyLimit(account.getCurrentDailyLimit().subtract(amount));
            return true;
        }
        return false;
    }

    public Account getAccount() {
        return account;
    }
}

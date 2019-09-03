package zadania_1703.money.transfer.bank;

import java.math.BigDecimal;

public interface BankCard {

    boolean pay(BigDecimal amount);

    boolean withdraw(BigDecimal amount);
}

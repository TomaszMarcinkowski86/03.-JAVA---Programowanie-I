package zadania_1703.money.transfer;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class Employer {


    private Map<Person, BigDecimal> salaries;

    public Employer() {
        this.salaries = new HashMap<>();
    }

    public void addEmployee(Person employe, BigDecimal salary) {
        salaries.put(employe, salary);
        System.out.println("Added employee " + employe.getFirstName() + " " + employe.getLastName());
    }

    public void paySalaries() {
        salaries.entrySet().stream()
                .forEach(this::paySalary);
    }

    private void paySalary(Map.Entry<Person, BigDecimal> personBigDecimalEntry) {
        personBigDecimalEntry.getKey()
                .getAccount()
                .payAmount(personBigDecimalEntry.getValue());

        System.out.println("Paid salary for person " + personBigDecimalEntry.getKey().getFirstName() + " "
                + personBigDecimalEntry.getKey().getLastName());
    }

}

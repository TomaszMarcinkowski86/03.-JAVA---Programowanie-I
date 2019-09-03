package zadania_1703.money.transfer;

/**
 * Klasa która raz na 10 sekund wypłaca wynagrodzenie!
 */
public class SalaryPayer implements Runnable {

    Employer employer;

    public SalaryPayer(Employer employer) {
        this.employer = employer;
    }

    @Override
    public void run() {
        while (true) {
            employer.paySalaries();
            try {
                Thread.currentThread().sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

import java.math.BigDecimal;

public class ContoBancario {

    private String accountNumber;
    private BigDecimal balance;

    public ContoBancario(String accountNumber) {

        this.accountNumber = accountNumber;
        this.balance = BigDecimal.ZERO;
    }

    public void deposit(BigDecimal amount) {
        if (amount == null || amount.compareTo(BigDecimal.ZERO) <= 0) {
            System.out.println("Somma depositata non valida, deve essere maggiore di zero");
        } else {
            this.balance = balance.add(amount);
        }
    }

    public void withdraw(BigDecimal amount) {
        if (amount == null || amount.compareTo(BigDecimal.ZERO) <= 0) {
            System.out.println("Somma prelevata non valida, deve essere maggiore di zero");
        } else if (amount.compareTo(this.balance) > 0) {
            System.out.println("Fondi insufficienti per il prelievo");
        } else {
            this.balance = balance.subtract(amount);
        }
    }

    public BigDecimal getCurrentBalance() {
        return this.balance;
    }
}

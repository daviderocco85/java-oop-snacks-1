import java.math.BigDecimal;

public class ContoBancario {

    private String accountNumber;
    private BigDecimal balance;

    public ContoBancario(String accountNumber) {

        this.accountNumber = accountNumber;
        this.balance = BigDecimal.ZERO;
    }

    public String getAccountNumber() {
        return this.accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public BigDecimal getBalance() {
        return this.balance;
    }

    public void deposit(BigDecimal amount) {
        if (amount == null || amount.compareTo(BigDecimal.ZERO) <= 0) {
            System.out.println("Somma depositata non valida, deve essere maggiore di zero");
        } else {
            this.balance = this.balance.add(amount);
        }
    }

    public void withdraw(BigDecimal amount) {
        if (amount == null || amount.compareTo(BigDecimal.ZERO) <= 0) {
            System.out.println("Somma prelevata non valida, deve essere maggiore di zero");
        } else if (amount.compareTo(this.balance) > 0) {
            System.out.println("Fondi insufficienti per il prelievo");
        } else {
            this.balance = this.balance.subtract(amount);
        }
    }

}

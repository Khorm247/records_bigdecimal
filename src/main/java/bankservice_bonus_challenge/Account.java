package bankservice_bonus_challenge;

import java.math.BigDecimal;
import java.util.Objects;

public class Account {
    private String accountNumber;
    private Client client;
    private BigDecimal balance;

    public Account(String accountNumber, Client client, BigDecimal balance) {
        this.accountNumber = accountNumber;
        this.client = client;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return Objects.equals(accountNumber, account.accountNumber) && Objects.equals(client, account.client) && Objects.equals(balance, account.balance);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountNumber, client, balance);
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountNumber='" + accountNumber + '\'' +
                ", client=" + client +
                ", balance=" + balance +
                '}';
    }

    public void depositMoneyToBankAccount(BigDecimal amount){
        balance = balance.add(amount);
        System.out.println("new Balance: " + getBalance());
    }

    public void withdrawMoneyFromBankAccount(BigDecimal amount){
        balance = balance.subtract(amount);
    }
}

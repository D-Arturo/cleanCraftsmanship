package main.bankkata;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Account {

    private final Console console;
    List<Transaction> transactions = new ArrayList<Transaction>();

    public Account(Console console) {
        this.console = console;
    }

    public void deposit(int amount) {
        transactions.add(new Transaction(amount, "deposit", new Date()));
    }

    public void withdraw(int amount) {
        transactions.add(new Transaction(-amount, "withdraw", new Date()));
    }

    public void printStatement() {
        console.print(transactions);
    }
}

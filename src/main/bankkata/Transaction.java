package main.bankkata;

import java.util.Date;

public class Transaction {

    private final int amount;
    private final String operation;
    private final Date date;

    public Transaction(int amount, String operation, Date date) {
        this.amount = amount;
        this.operation = operation;
        this.date = date;
    }

    public int getAmount() {
        return amount;
    }

    public String getOperation() {
        return operation;
    }

    public Date getDate() {
        return date;
    }
}

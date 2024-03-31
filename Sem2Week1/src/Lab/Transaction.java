
package Lab;

import java.util.Date;

public class Transaction {
    private Date date = new Date();
    private char type;
    private double amount, balance;
    private String description;
    
    public Transaction(char type, double amount, double balance, String description) {
        this.type = type;
        this.amount = amount;
        this.balance = balance;
        this.description = description;
    }
    
    @Override
    public String toString() {
        return "Date: " + date +
                "\nType: " + type +
                "\nAmount of transaction: " + amount +
                "\nBalance: " + balance + 
                "\nDescription: " + description +"\n";
    }
    
}

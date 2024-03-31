
package Lab;

import java.util.ArrayList;

public class Account1 extends Account {
    private String name;
    ArrayList<Transaction> transaction = new ArrayList<>();
    
    Account1(String name, int id, double balance) {
        super(id, balance);
        this.name = name;
    }
    
    @Override
    public double deposit(double amount) {
        balance += amount;
        
        transaction.add(new Transaction('D', amount, balance, "Deposit"));
        
        return balance;
    }
    
    @Override
    public boolean withdraw(double amount) {
        if(balance >= amount) {
            balance -= amount;
            transaction.add(new Transaction('W', amount, balance, "Withdraw"));
            return true;
        } else {
            return false;
        }
    }
    
    public String toString() {
        String details =  "Holder: " + name + 
                            "\nAnnual Interest rate: " + annualInterestRate +
                            "\nBalance: " + balance + 
                            "\n\nTransaction history: \n";
        for(Transaction i : transaction) {
            details += i + "\n";
        }
        return details;
    }
}

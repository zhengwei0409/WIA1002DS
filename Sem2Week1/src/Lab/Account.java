
package Lab;

import java.util.Date;

public class Account {
    protected int id;
    protected double balance;
    protected static double annualInterestRate;
    protected Date dateCreated = new Date();
    
    public Account() {
        id = 0;
        balance = 0;
        annualInterestRate = 0;
    }
    
    public Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public static double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public static void setAnnualInterestRate(double annualInterestRate) {
        Account.annualInterestRate = annualInterestRate;
    }
    
    
    public double getMonthlyInterestRate() {
        return annualInterestRate/ 12;
    }
    
    public double getMonthlyInterest() {
        return balance * (getMonthlyInterestRate() / 100 );
    }
    
    public double deposit(double amount) {
        balance += amount;
        return balance;
    }
    
    public boolean withdraw(double amount) {
        if(balance >= amount) {
            balance -= amount;
            return true;
        } else {
            return false;
        }
    }
    
    
    
    
}

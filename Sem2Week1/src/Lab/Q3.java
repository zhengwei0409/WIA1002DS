
package Lab;

public class Q3 {
    public static void main(String[] args) {
        Account acc = new Account(1122, 20000);
        
        Account.setAnnualInterestRate(4.5);
        
        acc.withdraw(2500);
        
        acc.deposit(3000);
        
        System.out.println("Balance : " + acc.getBalance());
        System.out.println("Monthly interest rate : " + acc.getMonthlyInterest());
        System.out.println("Date account created: " + acc.getDateCreated());
    }
}

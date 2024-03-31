
package Lab;

public class Q4 {
    public static void main(String[] args) {
        Account1 acc = new Account1("George", 1122, 1000);
        Account.setAnnualInterestRate(1.5);
        acc.deposit(30);
        acc.deposit(40);
        acc.deposit(50);
        acc.withdraw(5);
        acc.withdraw(4);
        acc.withdraw(2);
        
        
        System.out.println("Account Summary: ");
        System.out.println(acc);
    }
}

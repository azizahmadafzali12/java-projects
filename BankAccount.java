import bankaccount.Account;
import java.util.Scanner;
public class BankAccount{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Account account1 = new Account("Elham");
        
        account1.deposit(2000);
        account1.withDraw(1000);
        
        System.out.println("total balance is: " + account1.checkBalance());
        
        
    }
}
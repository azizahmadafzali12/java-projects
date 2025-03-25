
package bankaccount;
public class Account {
    double totalBalance = 0;
        String name;
    
    public Account ( String  n) {
        this.name = n;
        System.out.println("account for " + name + " has been created");
    }
    
    public void deposit (double amount) {
        totalBalance += amount;
        System.out.println("the amount of deposite is: " + amount);
    }
    
    public void withDraw (double amount) {
        totalBalance -= amount;
        System.out.println("the amount of withdraw is: " + amount);
    }
    
    public double checkBalance(){
        return totalBalance;
    }
    
    
    
    
    
}

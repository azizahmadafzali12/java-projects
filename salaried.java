
package payrollsystem;

public class salaried extends Employee{
    private double monthlysalary;
    public salaried(String name, String address, String tazkira, double sal) {
        super(name, address, tazkira);
        if (sal < 0){
        throw new ArithmeticException("The Salary Must be above 0.0"); 
        }
        this.monthlysalary = sal;
     }
  
    public double getMonthlysalary() {
        return monthlysalary;
    }

    public void setMonthlysalary(double monthlysalary) {
        if (monthlysalary < 0){
        throw new ArithmeticException("The Salary Must be above 0.0"); 
        }
        this.monthlysalary = monthlysalary;
    }  
    @Override
    public String toString(){
      return String.format("%s, \n and his/her monthly "
              + "salary is %.2f", super.toString(), earnings());    
    }
    @Override
    public double earnings() {
       return this.monthlysalary;
    }

}

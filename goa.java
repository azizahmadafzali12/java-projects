
// import java.util.scanner;
import javax.swing.JOptionPane;
public class goa{
    public static void main(String[] args) {
     String numsubjects = JoptionPane.showinputDialog(args);
      int numsub = integer. paraseint(numsubjects);
      double marks[] = new double(numsub);
      double credits[] = new double(numsub);
      double gpas[] =  new double[numsub];
      double gpaXcri[] = new double[num sub];
      
       for (int i = 0;i < numsub;i++) {
 //       system.out.println("enter marks of subject # "  +  (i+1)+": ")
 //        double mark = in.nextdouble();
 //        system.out.println("enter credits of subject # " + (i+1)+";
 //        double credit = in.nextdouble();
 double mark = Double.parseDouble(Joptionpane.showInputDialog("Enter marks of subject # " + (i+1)+":  "));
 double credit= Double.parseDouble(Joptionpane.showInputDialog("Enter credits of subject # " + (i+1)+": "));
 int gpa = gpaCalc(mark);
 if (gpa == -1){
     i--;
     continue;
 }
   marks[i] = mark;
   credits[i] = credit;
   gpas[i] = gpa;
   gpaXcri[i] = (gpa * credit);
 }
   double totalmark =0, totalcredit=0, total gpa=0, totalgpaXcridet=0;
   for(int j =0; j < numsub; j++){
      totalmark = totalmark + marks[j];
      totalcredit = totalcredit + credits[j];
      totalgpa = totalgpa + gpas[j];
      totalgpaXcredit += gpaXcri[j];
}
// system.out.printiln("your Transcript Information: ");
     Joptionpane.showMessageDialog(null, "your Transcript Information: ");
     system.out.println("your Total Marks is : " + totalmark);
     system.out.println("your Average Marks is :" + totalmark/numsub);
     system.out.println("your Total Cridets is :" + totalcredit);
     system.out.println("your Accumulative GPA is" + totalgpaXcredit/totalgpa);
     static int gpaCalc(double mark)(
        int gpa =0;
        if(mark >= 90 && mark <= 100)(
           gpa = 4;
           system.out.println(" Your Grade A and GPA 4");
         )
        else if (mark >= 80 && mark<= 89) {
        gpa = 3;
        System.out.println("your Grade is B and GPA 3");
    }
        else if (mark >= 70 && mark<=79) {
         gpa =2;
         system.out.println("your Grade is c and GPA 2");
   } 
        else if (mark >= 60 && mark<=69){
          gpa = 1;
          System.out.println("your Grade is D and GPA 1");
     }  
   return gpa;
)
       )

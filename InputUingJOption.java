package javabasics;
import javax.swing.JOptionPane;
public class InputUingJOption {
//    static int checkUser(){
//        String name = JOptionPane.showInputDialog("Enter Your Name :");
//        String password = JOptionPane.showInputDialog("Enter Your Password :");
//        if (name.equals(password))
//            return 1;
//        else return 0;
//    }
    public static void main(String[] args){
//        checkUser();
       for (int i = 3; i >= 1; i--){
           if (login()){
               JOptionPane.showMessageDialog(null, "Login Sucessfully");
               break;
           }
           else{
                JOptionPane.showMessageDialog(null, "Login UnSucessfull Tries Remaining " + (i-1));

           }
//        String name = JOptionPane.showInputDialog("Enter Your Name : ");
//        String password = JOptionPane.showInputDialog("Enter Your Password : ");
//        
//        if (name.equals(password)){
//            JOptionPane.showMessageDialog(null, "Login Sucessfully");
//            break;
//        }
//        else{
//            JOptionPane.showMessageDialog(null, "Login UnSucessfull Tries Remaining " +(i-1));
//        }
       }

       
    }
    static boolean login(){
        String name = JOptionPane.showInputDialog("Enter Your Name : ");
        String password = JOptionPane.showInputDialog("Enter Your Password : ");
        if (name.equals(password)) return true;
        else return false;
    }
}

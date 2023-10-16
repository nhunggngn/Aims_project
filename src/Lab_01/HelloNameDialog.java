package Lab_01;

//Example 3:HelloNameDialog.java
import javax.swing.JOptionPane;
public class HelloNameDialog{
        public static void main(String[]args){
            String result;
            result = JOptionPane.showInputDialog("Nguyen Thi Nhung 20215109 -Please enter your name");
            JOptionPane.showMessageDialog(null,"Toi la Nguyen Thi Nhung 20215109. Hi " + result + "I");
            System.exit(0);
        }
}

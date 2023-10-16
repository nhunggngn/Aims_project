package Lab_01;

//Example 5:ShowTwoNumbers.java
import javax.swing.JOptionPane;
//Nhap vao 2 so va Hien ra hai so vua nhap
public class ShowTwoNumbers {
    public static void main(String[] args) {
        String strNum1, strNum2;
        String strNotification = "Nguyen Thi Nhung 20215109-You've just entered: ";
        strNum1 = JOptionPane.showInputDialog(null,
                "Nguyen Thi Nhung 20215109-Please input the first number:","Nguyen Thi Nhung - 20215109 - Input the first number ",
        JOptionPane.INFORMATION_MESSAGE);
        strNotification += strNum1 + " and ";
        strNum2 = JOptionPane.showInputDialog(null,
                "Nguyen Thi Nhung 20215109-Please input the second number:", "Nguyen Thi Nhung 20215109 Input the second number ",
        JOptionPane.INFORMATION_MESSAGE);
        strNotification += strNum2;
        JOptionPane.showMessageDialog(null, strNotification,
                "Show two numbers", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}

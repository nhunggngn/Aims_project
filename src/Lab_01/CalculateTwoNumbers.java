package Lab_01;

import javax.swing.*;

public class CalculateTwoNumbers {
    public static void main(String[] args) {
        String strNum1, strNum2;
        strNum1 = JOptionPane.showInputDialog(null,
                "Nguyen Thi Nhung 20215109-Please input the first number:",
                "Nguyen Thi Nhung - 20215109 - Input the first number ",
                JOptionPane.INFORMATION_MESSAGE);
        double num1 = Double.parseDouble(strNum1);
        strNum2 = JOptionPane.showInputDialog(null,
                "Nguyen Thi Nhung 20215109-Please input the second number:",
                "Nguyen Thi Nhung - 20215109 - Input the second number ",
                JOptionPane.INFORMATION_MESSAGE);
        double num2 = Double.parseDouble(strNum2);

        double sum = num1 + num2;
        double diff = num1 - num2;
        double product = num1 * num2;
        double quotient = num1 / num2;

        String strNotification = "Nguyen Thi Nhung 20215109\nSum: " + num1 + " + " + num2 + " = " + sum +
                "\nDifferent: " + num1 + " - " + num2 + " = " + diff +
                "\nProduct: " + num1 + " * " + num2 + " = " + product +
                "\nQuotient: " + num1 + " / " + num2 + " = " + quotient;
        JOptionPane.showMessageDialog(null, strNotification,
                "Show calculations", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}


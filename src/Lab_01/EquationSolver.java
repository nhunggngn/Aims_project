package Lab_01;
import javax.swing.*;
import java.util.Scanner;

public class EquationSolver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String choice = JOptionPane.showInputDialog(null,
                "Nguyen Thi Nhung 20215109-Please select the type of equation to solve:" +
                        "\n1. First-degree equation (linear equation) with one variable" +
                        "\n2. System of first-degree equations (linear system) with two variables" +
                        "\n3. Second-degree equation (quadratic equation) with one variable",
                "Nguyen Thi Nhung 20215109 - Select the type of equation ",
                JOptionPane.INFORMATION_MESSAGE); //đưa ra các lựa chọn bài toán
//lựa chọn bài toán
        switch (choice) {
            case "1": // nhập 1 thì giải phương trình 1 ẩn bậc 1
                solveLinearEquation(scanner);
                break;
            case "2": // nhập 2 thì giải hệ 2 phương trình 2 ẩn
                solveLinearSystem(scanner);
                break;
            case "3": // nhập 3 thì giải phương trình 1 ẩn bậc 2
                solveQuadraticEquation(scanner);
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }
        System.exit(0);
    }
//Giải phương trình 1 ẩn bậc 1
    public static void solveLinearEquation(Scanner scanner) {
        String strNum1, strNum2;
        strNum1 = JOptionPane.showInputDialog(null,
                "Nguyen Thi Nhung 20215109 - Equation: ax + b = 0 (a ≠ 0)" +
                        "\nPlease input the coefficient 'a' for the linear equation:",
                "Nguyen Thi Nhung 20215109 - Input the coefficient 'a' ",
                JOptionPane.INFORMATION_MESSAGE); //Nhập hệ số a
        while (strNum1.equals("0")) {
            strNum1 = JOptionPane.showInputDialog(null,
                    "Nguyen Thi Nhung 20215109 - Equation: ax + b = 0 (a ≠ 0)" +
                            "\nPlease input the coefficient 'a'(a ≠ 0) for the linear equation:",
                    "Nguyen Thi Nhung 20215109 - Input the coefficient 'a' ",
                    JOptionPane.INFORMATION_MESSAGE); //Nhập lạihệ số a
        } // nếu a = 0 thì nhập lại
        double a = Double.parseDouble(strNum1); //chuyển a sang kiểu double
        strNum2 = JOptionPane.showInputDialog(null,
                "Nguyen Thi Nhung 20215109 - Equation: ax + b = 0" +
                        "\nPlease input the coefficient 'b' for the linear equation:",
                "Nguyen Thi Nhung 20215109 - Input the coefficient 'b' ",
                JOptionPane.INFORMATION_MESSAGE); //Nhập hệ số b
        double b = Double.parseDouble(strNum2); //chuyển b sang kiểu double

        String strNotification = "Nguyen Thi Nhung 20215109 - Equation: " + a + " x + " + b + " = 0 ";
        double solution = -b / a;
        strNotification += "\nSolution: x = " + solution;
        JOptionPane.showMessageDialog(null, strNotification,
                "Show Solution", JOptionPane.INFORMATION_MESSAGE);
    }
//Giải hệ 2 ẩn 2 phương trình
    public static void solveLinearSystem(Scanner scanner) {
        String strNum1, strNum2, strNum3, strNum4, strNum5, strNum6;
        strNum1 = JOptionPane.showInputDialog(null,
                "Nguyen Thi Nhung 20215109 \nEquation: a11x1 + a12x2 = b1; a21x1 + a22x2 = b2" +
                        "\nPlease input the coefficient 'a11' for equation 1:",
                "Nguyen Thi Nhung 20215109 - Input the coefficient 'a11' ",
                JOptionPane.INFORMATION_MESSAGE); // nhập a11
        double a11 = Double.parseDouble(strNum1);
        strNum2 = JOptionPane.showInputDialog(null,
                "Nguyen Thi Nhung 20215109 \nEquation: a11x1 + a12x2 = b1; a21x1 + a22x2 = b2" +
                        "\nPlease input the coefficient 'a12' for equation 1:",
                "Nguyen Thi Nhung 20215109 - Input the coefficient 'a12' ",
                JOptionPane.INFORMATION_MESSAGE);//nhập a12
        double a12 = Double.parseDouble(strNum2);
        strNum3 = JOptionPane.showInputDialog(null,
                "Nguyen Thi Nhung 20215109 \nEquation: a11x1 + a12x2 = b1; a21x1 + a22x2 = b2" +
                        "\nPlease input the coefficient 'b1' for equation 1:",
                "Nguyen Thi Nhung 20215109 - Input the coefficient 'b1' ",
                JOptionPane.INFORMATION_MESSAGE); //nhập b1
        double b1 = Double.parseDouble(strNum3);
        strNum4 = JOptionPane.showInputDialog(null,
                "Nguyen Thi Nhung 20215109 \nEquation: a11x1 + a12x2 = b1; a21x1 + a22x2 = b2" +
                        "\nPlease input the coefficient 'a21' for equation 2:",
                "Nguyen Thi Nhung 20215109 - Input the coefficient 'a21' ",
                JOptionPane.INFORMATION_MESSAGE); //nhập a21
        double a21 = Double.parseDouble(strNum4);
        strNum5 = JOptionPane.showInputDialog(null,
                "Nguyen Thi Nhung 20215109\nEquation: a11x1 + a12x2 = b1; a21x1 + a22x2 = b2" +
                        "\nPlease input the coefficient 'a22' for equation 2:",
                "Nguyen Thi Nhung 20215109 - Input the coefficient 'a22' ",
                JOptionPane.INFORMATION_MESSAGE); //nhập a22
        double a22 = Double.parseDouble(strNum5);
        strNum6 = JOptionPane.showInputDialog(null,
                "Nguyen Thi Nhung 20215109\nEquation: a11x1 + a12x2 = b1; a21x1 + a22x2 = b2" +
                        "\nPlease input the coefficient 'b2' for equation 2:",
                "Nguyen Thi Nhung 20215109 - Input the coefficient 'b2' ",
                JOptionPane.INFORMATION_MESSAGE); //nhập b2
        double b2 = Double.parseDouble(strNum6);

        //tính các định thức a, d1, d2
        double d = a11 * a22 - a21 * a12;
        double d1 = b1 * a22 - b2 * a12;
        double d2 = a11 * b2 - a21 * b1;

        String strNotification = "Nguyen Thi Nhung 20215109 - Equation:\n" + a11 + " x1 + " + a12 +" x2 = " + b1 + ";\n" + a21 + " x1 + " + a22 +" x2 = " + b2;
        if (d != 0) { //nếu d khác 0 thì tính 2 nghiệm
            double x1 = d1 / d;
            double x2 = d2 / d;
            strNotification += "\nSolution: x1 = " + x1 + ", x2 = " + x2;
        } else {
            if (d1 == 0 && d2 == 0) { // nếu d = d1 = d2 = 0 thì hpt vô số nghiệm
                strNotification += "\nInfinite solutions";
            } else { // nếu d = 0 nhưng d1 hoặc d2 khác 0 thì hpt vô nghiệm
                strNotification += "\nNo solution";
            }
        }
        JOptionPane.showMessageDialog(null, strNotification,
                "Show Solution", JOptionPane.INFORMATION_MESSAGE);
    }
// giải phương trình 1 ẩn bậc 2
    public static void solveQuadraticEquation(Scanner scanner) {
        String strNum1, strNum2, strNum3;
        strNum1 = JOptionPane.showInputDialog(null,
                "Nguyen Thi Nhung 20215109 - Equation: ax^2 + bx + c = 0" +
                        "\nPlease input the coefficient 'a' for the quadratic equation:",
                "Nguyen Thi Nhung 20215109 - Input the coefficient 'a' ",
                JOptionPane.INFORMATION_MESSAGE); // nhập hệ số a
        while (strNum1.equals("0")){
            strNum1 = JOptionPane.showInputDialog(null,
                    "Nguyen Thi Nhung 20215109 - Equation: ax^2 + bx + c = 0" +
                            "\nPlease input the coefficient 'a' (a ≠ 0) for the quadratic equation:",
                    "Nguyen Thi Nhung 20215109 - Input the coefficient 'a' ",
                    JOptionPane.INFORMATION_MESSAGE);
        } // nếu a=0 thì nhập lại
        double a = Double.parseDouble(strNum1);
        strNum2 = JOptionPane.showInputDialog(null,
                "Nguyen Thi Nhung 20215109 - Equation: ax^2 + bx + c = 0" +
                        "\nPlease input the coefficient 'b' for the quadratic equation:",
                "Nguyen Thi Nhung 20215109 - Input the coefficient 'b' ",
                JOptionPane.INFORMATION_MESSAGE); // nhập hệ số b
        double b = Double.parseDouble(strNum2);
        strNum3 = JOptionPane.showInputDialog(null,
                "Nguyen Thi Nhung 20215109 - Equation: ax^2 + bx + c = 0" +
                        "\nPlease input the coefficient 'c' for the quadratic equation:",
                "Nguyen Thi Nhung 20215109 - Input the coefficient 'c' ",
                JOptionPane.INFORMATION_MESSAGE); // nhập hệ số c
        double c = Double.parseDouble(strNum3);
        String strNotification = "Nguyen Thi Nhung 20215109 \nEquation: " + a + " x^2 + " + b +" x " + c + " = 0 ";
        double discriminant = b * b - 4 * a * c; // tính denta
        if (discriminant > 0) { // nếu denta > 0 thì tính 2 nghiệm
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            strNotification += "\nRoots: x1 = " + root1 + ", x2 = " + root2;
        } else if (discriminant == 0) { //nếu denta = 0 thì tính nghiệm kép
            double root = -b / (2 * a);
            strNotification += "\nDouble root: x = " + root;
        } else { //nếu denta < 0 thì pt vô nghiệm
            strNotification += "\nNo real roots";
        }
        JOptionPane.showMessageDialog(null, strNotification,
                "Show Solution", JOptionPane.INFORMATION_MESSAGE);
    }
}
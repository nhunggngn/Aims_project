package Lab_01;
import java.util.Scanner;
public class TriangleDisplay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the height of the triangle: ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            } // tạo ta i khoảng trắng ở đầu mỗi dòng
            for (int j = 1; j < 2 * i; j++){
                System.out.print("*");
            } // in ra 2i-1 ngôi sao
            System.out.println();
        }
    }
}

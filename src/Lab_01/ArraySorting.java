package Lab_01;
import java.util.Scanner;
import java.util.Arrays;

public class ArraySorting {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("PLease enter the numbers of element:");
        int n = keyboard.nextInt(); //Nhập số phần tử của mảng
        int[] array = new int[n]; //khai báo mảng số nguyên với số phần tử do người dùng nhập
        for (int i = 0; i < n; i++) {
            int b = i + 1;
            System.out.println("PLease enter the number " + b + ": ");
            array[i] = keyboard.nextInt(); // nhập các phần tử của mảng
        }
        // sắp xếp mảng theo thứ tự tăng dần
        Arrays.sort(array);
        // In mảng đã sắp xếp
        System.out.println("Sorted array: " + Arrays.toString(array));

        // tính tổng các phần tử
        int sum = 0;
        for (int num : array) {
                sum += num;
            }
        System.out.println("Sum: " + sum);

        // tính trung bình giá trị các phần tử
        double average = (double) sum / array.length;
        System.out.println("Average: " + average);
        }
    }

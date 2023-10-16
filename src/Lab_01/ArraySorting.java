package Lab_01;
import java.util.Scanner;
import java.util.Arrays;

public class ArraySorting {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("PLease enter the numbers of element:");
        int n = keyboard.nextInt();
        int iSum = 0;
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            int b = i + 1;
            System.out.println("PLease enter the number " + b + ": ");
            array[i] = keyboard.nextInt();
        }
        // Sort the array in ascending order
        Arrays.sort(array);

        // Print the sorted array
        System.out.println("Sorted array: " + Arrays.toString(array));

        // Calculate the sum of array elements
        int sum = 0;
        for (int num : array) {
                sum += num;
            }
        System.out.println("Sum: " + sum);

        // Calculate the average value of array elements
        double average = (double) sum / array.length;
        System.out.println("Average: " + average);
        }
    }

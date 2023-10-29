package Lab_01;

import java.util.Scanner;

public class DisplayMonthDays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int year = getValidYear(scanner); //gọi phương thức duyệt năm
        int month = getValidMonth(scanner); //gọi phương thức duyệt tháng

        int days = getNumberOfDays(month, year); //gọi phương thức duyệt số ngày
        System.out.println("Number of days: " + days);
    }

    //Phương thức duyệt năm
    private static int getValidYear(Scanner scanner) {
        int year;
        do {
            System.out.print("Please enter the year: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter a valid year.");
                scanner.next();
            } //nhập năm
            year = scanner.nextInt();
            if (year < 0) {
                System.out.println("Invalid input. Please enter a non-negative year.");
            } // nếu năm nhập vào không hợp lệ thì nhập lại
        } while (year < 0);
        return year;
    }

    //Phương thức duyệt tháng
    private static int getValidMonth(Scanner scanner) {
        int month;
        do {
            System.out.print("Please enter the month: ");
            String input = scanner.next();
            switch (input.toLowerCase()) {
                case "january":
                case "jan.":
                case "jan":
                case "1":
                    month = 1; //tháng 1
                    break;
                case "february":
                case "feb.":
                case "feb":
                case "2":
                    month = 2; //tháng 2
                    break;
                case "march":
                case "mar.":
                case "mar":
                case "3":
                    month = 3; //tháng 3
                    break;
                case "april":
                case "apr.":
                case "apr":
                case "4":
                    month = 4; //tháng 4
                    break;
                case "may":
                case "5":
                    month = 5; //tháng 5
                    break;
                case "june":
                case "jun.":
                case "jun":
                case "6":
                    month = 6; //tháng 6
                    break;
                case "july":
                case "jul.":
                case "jul":
                case "7":
                    month = 7; //tháng 7
                    break;
                case "august":
                case "aug.":
                case "aug":
                case "8":
                    month = 8; //tháng 8
                    break;
                case "september":
                case "sep.":
                case "sep":
                case "9":
                    month = 9; //tháng 9
                    break;
                case "october":
                case "oct.":
                case "oct":
                case "10":
                    month = 10; //tháng 10
                    break;
                case "november":
                case "nov.":
                case "nov":
                case "11":
                    month = 11; //tháng 11
                    break;
                case "december":
                case "dec.":
                case "dec":
                case "12":
                    month = 12; //tháng 12
                    break;
                default:
                    month = 0;
                    System.out.println("Invalid input. Please enter a valid month.");
            }
        } while (month == 0);
        return month;
    }

    //Phương thức duyệt số ngày
    private static int getNumberOfDays(int month, int year) {
        int days;
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                days = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                days = 30;
                break;
            case 2: // nếu năm nhuận thì có 29 ngày, không nhuận thì có 28 ngày
                days = isLeapYear(year) ? 29 : 28;
                break;
            default:
                days = 0;
        }
        return days;
    }

    //Phương thức tính năm nhuận
    private static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}


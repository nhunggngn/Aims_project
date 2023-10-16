package Lab_01;

import java.util.Scanner;

public class DisplayMonthDays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int year = getValidYear(scanner);
        int month = getValidMonth(scanner);

        int days = getNumberOfDays(month, year);
        System.out.println("Number of days: " + days);
    }

    private static int getValidYear(Scanner scanner) {
        int year;
        do {
            System.out.print("Please enter the year: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter a valid year.");
                scanner.next();
            }
            year = scanner.nextInt();
            if (year < 0) {
                System.out.println("Invalid input. Please enter a non-negative year.");
            }
        } while (year < 0);
        return year;
    }

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
                    month = 1;
                    break;
                case "february":
                case "feb.":
                case "feb":
                case "2":
                    month = 2;
                    break;
                case "march":
                case "mar.":
                case "mar":
                case "3":
                    month = 3;
                    break;
                case "april":
                case "apr.":
                case "apr":
                case "4":
                    month = 4;
                    break;
                case "may":
                case "5":
                    month = 5;
                    break;
                case "june":
                case "jun.":
                case "jun":
                case "6":
                    month = 6;
                    break;
                case "july":
                case "jul.":
                case "jul":
                case "7":
                    month = 7;
                    break;
                case "august":
                case "aug.":
                case "aug":
                case "8":
                    month = 8;
                    break;
                case "september":
                case "sep.":
                case "sep":
                case "9":
                    month = 9;
                    break;
                case "october":
                case "oct.":
                case "oct":
                case "10":
                    month = 10;
                    break;
                case "november":
                case "nov.":
                case "nov":
                case "11":
                    month = 11;
                    break;
                case "december":
                case "dec.":
                case "dec":
                case "12":
                    month = 12;
                    break;
                default:
                    month = 0;
                    System.out.println("Invalid input. Please enter a valid month.");
            }
        } while (month == 0);
        return month;
    }

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
            case 2:
                days = isLeapYear(year) ? 29 : 28;
                break;
            default:
                days = 0;
        }
        return days;
    }

    private static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
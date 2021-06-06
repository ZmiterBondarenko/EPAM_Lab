// Ввести целые числа как аргументы командной строки, подсчитать их сумму (произведение) и вывести результат на консоль.
import java.util.Scanner;
public class Task5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
               int monthNumber;
               String month;
        System.out.print("Input month number:");
        monthNumber = in.nextInt();
        switch (monthNumber) {
            case 1:   month = "January";
                break;
            case 2:  month = "February";
                break;
            case 3:  month = "March";
                break;
            case 4:  month = "April";
                break;
            case 5:  month = "May";
                break;
            case 6:  month = "June";
                break;
            case 7:  month = "July";
                break;
            case 8:  month = "August";
                break;
            case 9:  month = "September";
                break;
            case 10: month = "October";
                break;
            case 11: month = "November";
                break;
            case 12: month = "December";
                break;
            default: month = "Input valid number of month (1-12)";
                break;
        }
        System.out.println(month);
    }

}
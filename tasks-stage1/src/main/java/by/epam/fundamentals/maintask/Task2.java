//Отобразить в окне консоли аргументы командной строки в обратном порядке
package by.epam.fundamentals.maintask;
import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input string: ");
        String name = in.nextLine();
        StringBuffer buffer = new StringBuffer(name);
        buffer.reverse();
        System.out.println(buffer);
    }
}

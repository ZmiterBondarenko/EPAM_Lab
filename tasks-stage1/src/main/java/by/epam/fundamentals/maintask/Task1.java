// Приветствовать любого пользователя при вводе его имени через командную строку
package by.epam.fundamentals.maintask;
import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
        System.out.println("Input name ");
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();
        System.out.print("Hello " + name + "!");
    }
}

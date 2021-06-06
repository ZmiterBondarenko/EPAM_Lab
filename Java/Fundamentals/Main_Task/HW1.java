// Приветствовать любого пользователя при вводе его имени через командную строку
import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
        System.out.println("Введите имя ");
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();
        System.out.print("Hello " + name + "!");
         }
}

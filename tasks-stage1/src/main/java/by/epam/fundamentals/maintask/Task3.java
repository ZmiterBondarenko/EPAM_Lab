//Вывести заданное количество случайных чисел с переходом и без перехода на новую строку
package by.epam.fundamentals.maintask;
import java.util.Scanner;
import java.util.Random;
public class Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random random = new Random();
        int capacity;
        System.out.print("Input quantity of numbers: ");
        capacity = in.nextInt();
        int[] myArray = new int[capacity];
        for (int i = 0; i<capacity; i++){
            myArray[i] = random.nextInt(100);
            System.out.print(myArray[i] + " ");
        }
        System.out.println("\n");
        for (int i = 0; i<capacity; i++){
            myArray[i] = random.nextInt(100);
            System.out.println(myArray[i]);
        }
    }
}
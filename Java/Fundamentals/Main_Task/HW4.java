//Ввести целые числа как аргументы командной строки, подсчитать их сумму (произведение) и вывести результат на консоль.
import java.util.Scanner;
public class HW4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numbers;
        int sum=0;
        int mult=1;
        System.out.print("Input quantity of numbers: ");
        numbers = in.nextInt();
        int[] myArray = new int[numbers];
        for (int i = 0; i<numbers; i++){
            myArray[i] = in.nextInt();
        }

        for (int i = 0; i<numbers; i++){
            sum += myArray[i];
            mult = mult * myArray[i];
        }
        System.out.println("Sum= " + sum);
        System.out.println("Mult= " + mult);
     }
}
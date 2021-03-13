//Вывести на консоль те числа, длина которых меньше (больше) средней длины по всем числам, а также длину.
import java.util.Scanner;
public class OT1_3 {
    public static void main(String[] args) {
        int size;
        double avg = 0;
        Scanner s = new Scanner(System.in);
        System.out.print("Input size of array: ");
        size = s.nextInt();
        System.out.print("Input numbers: ");
        String[] arr = new String[size];
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < size; i++) {
            arr[i] = in.nextLine();
        }
        for (int i = 0; i < size; i++) {
            avg += arr[i].replaceAll("\\D", "").length();
        }
        avg /= arr.length;
        System.out.println("Average length: " + avg);
        for (int i = 0; i < size; i++) {
            if (arr[i].replaceAll("\\D", "").length() > avg) {
                System.out.println("The number " + arr[i] + " with number of digits " + arr[i].replaceAll("\\D", "").length() + " longer than average");
            }
        }
      }
}





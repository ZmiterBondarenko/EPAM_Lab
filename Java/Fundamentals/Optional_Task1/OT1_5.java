//Найти количество чисел, содержащих только четные цифры, а среди оставшихся — количество чисел с равным числом четных и нечетных цифр
import java.util.Scanner;
public class OT1_5 {
    public static void main(String[] args) {
        int size;
        Scanner s = new Scanner(System.in);
        System.out.print("Input size of array: ");
        size = s.nextInt();
        System.out.print("Input numbers: ");
        String[] arr = new String[size];
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < size; i++) {
            arr[i] = in.nextLine();
        }
        int count;
        int countEven = 0;
        int countEqual = 0;
        for (int i =0; i < size; i++) {
            count = 0;
            for (int j =0; j < arr[i].replaceAll("\\D", "").length(); j++){
            if (arr[i].replaceAll("\\D", "").charAt(j) % 2 == 0) {
                count++;
            }
            }
            if (count == arr[i].replaceAll("\\D", "").length()){
              countEven++;
            } else {
            if (count == (float) (arr[i].replaceAll("\\D", "").length())/2) {
                countEqual++;
            }
            }
        }
        System.out.println("Quantity of numbers consist only even digits "+ countEven);
        System.out.println("Quantity of numbers with an equal number of even and odd digits "+ countEqual);
    }
}





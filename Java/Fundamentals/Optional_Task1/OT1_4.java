//Найти число, в котором количество различных цифр минимально. Если таких чисел несколько, найти первое из них.
import java.util.Scanner;
public class OT1_7 {
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
        String swap;
        int[] res = new int[size];
        for (int i = 0; i < size; i++ ){
            swap = null;
            swap = arr[i].replaceAll("\\D", "");
            res[i] =  swap.replaceAll("(.)(?=.*\\1)","").length();
        }
        int index = 0;
        for (int i=0; i<size; i++){
            if (res[i]<res[index]) {
                index = i;
            }
        }
        System.out.println("Number with minimum duplicate digits "+ arr[index]);
    }
}





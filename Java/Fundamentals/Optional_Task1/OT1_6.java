//Найти число, цифры в котором идут в строгом порядке возрастания. Если таких чисел несколько, найти первое из них.
import java.util.Scanner;
public class OT1_6 {
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
        int i = 0;
        int j = 0;
        int count = 0;
        boolean flag = true;
        while (i < size){
            while ((j < arr[i].replaceAll("\\D", "").length() - 1) && flag == true){
                flag = arr[i].replaceAll("\\D", "").charAt(j) < arr[i].replaceAll("\\D", "").charAt(j+1);
                j++;}
            if (flag == true) {
                System.out.println("Number contains digits in increasing order  " + arr[i]);
                i = size;}
            else {
                i++;
                count++;
                j=0;
                flag=true;}
        }
        if (count == size){
            System.out.println("No number contains digits in increasing order");}
    }

}





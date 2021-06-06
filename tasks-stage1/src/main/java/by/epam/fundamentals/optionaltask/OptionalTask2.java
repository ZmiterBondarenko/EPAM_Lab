//Вывести числа в порядке возрастания (убывания) значений их длины.
package by.epam.fundamentals.optionaltask;
import java.util.Scanner;
public class OptionalTask2 {
    public static void main(String[] args) {
        int size;
        Scanner s = new Scanner(System.in);
        System.out.print("Input size of array: ");
        size = s.nextInt();
        System.out.print("Input numbers: ");
        String[] arr = new String[size];
        Scanner in = new Scanner(System.in);
         for(int i = 0; i < size; i++){
             arr[i] = in.nextLine();
        }
        for(int i =0; i < arr.length-1; i++){
            for(int j = arr.length-1 ; j > i ; j--){
                if( arr[j].replaceAll("\\D", "").length() < arr[j-1].replaceAll("\\D", "").length() ){
                    String tmp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = tmp;
                }
            }
        }
        System.out.println("Numbers sorted by increasing quantity of digits: ");
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}


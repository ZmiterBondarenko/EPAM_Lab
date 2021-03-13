//Найти самое короткое и самое длинное число. Вывести найденные числа и их длину.
import java.util.Scanner;
public class OT1_1 {
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
        System.out.println("The longest number " + arr[size-1] + " with number of digits " + arr[size-1].replaceAll("\\D", "").length());
        System.out.println("The shortest number " + arr[0] + " with number of digits " + arr[0].replaceAll("\\D", "").length());
        }
    }






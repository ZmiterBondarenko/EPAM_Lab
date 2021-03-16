//Найти сумму элементов матрицы, расположенных между первым и вторым положительными элементами каждой строки
import java.util.Scanner;
import java.util.Random;
public class OT2_3 {
    public static void main(String[] args) {
        int n;
        int m;
        Scanner s = new Scanner(System.in);
        Random random = new Random();
        System.out.print("Input size of array: ");
        n = s.nextInt();
        Scanner in = new Scanner(System.in);
        System.out.print("Input range of value M: ");
        m = in.nextInt();
        int[][] a = new int[n][n];
        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                a[i][j] =-m + random.nextInt(2*m+1);
            }
        }
        System.out.println("Current array: ");
        for (int i=0; i<n; i++) {
            for (int j = 0; j<n; j++) {
                System.out.print(a[i][j] + "  ");
            }
            System.out.print("\n");
        }
        int tempSum = 0;
        int  sum = 0;
        int count=0;
        for (int i=0; i<n; i++) {
            for (int j = 0; j<n; j++) {
                if (count == 1 && a[i][j] <= 0){
                    tempSum += a[i][j];
                }
            if (a[i][j] > 0) {
            count ++;}
            } if (count == 1) {
                tempSum = 0;
            } else {
                sum+=tempSum;}
                count =0;
                tempSum = 0;
        }
        System.out.println("Sum of elements  "+ sum);
    }
}





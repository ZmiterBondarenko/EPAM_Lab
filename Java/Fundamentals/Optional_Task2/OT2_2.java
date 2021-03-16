//Найти и вывести наибольшее число возрастающих (убывающих) элементов матрицы, идущих подряд
import java.util.Scanner;
import java.util.Random;
public class OT2_2 {
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
        int max = 1;
        int count;
        int indi = 0;
        int indj = 0;
        for (int i = 0; i < n; i++ ) {
            count=1;
            for (int j = 0; j < n-1; j++) {
                if (a[i][j] < a[i][j + 1]) {
                    count++;
                    if (count >= max) {
                    max = count;
                    indi= i;
                    indj= j;
                                   }}
                else {
                    count = 1;
                }
            }
        }
        System.out.println("Max number increasing digits "+ max);
        for (int j=indj-max+2; j<indj+2; j++) {
            System.out.print(a[indi][j] + "  ");
        }
    }
}





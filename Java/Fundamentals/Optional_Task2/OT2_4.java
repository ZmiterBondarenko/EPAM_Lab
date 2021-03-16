//Найти максимальный элемент в матрице и удалить из матрицы все строки и столбцы, его содержащие
import java.util.Scanner;
import java.util.Random;
public class OT2_4 {
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

        int[][] b = new int[n-1][n-1];

        int max =a[0][0];
        int  row = 0;
        int col = 0;
        for (int i=0; i<n; i++) {
            for (int j = 0; j<n; j++) {
                if (a[i][j] > max){
                    max = a[i][j];
                    row = i;
                    col = j;
                }
            }
            }
        System.out.println("Max  element  a["+row+"]["+col+"]= "+max );
        int k = 0;
        int l = 0;
        for (int i=0; i<n; i++) {
            if (i != row) {
                for (int j = 0; j < n; j++) {
                    if (j != col) {
                        b[l][k] = a[i][j];
                        k++;
                    }
                }
                k = 0;
                l++;
            }
        }
        System.out.println("Result array: ");
        for (int i=0; i<n-1; i++) {
            for (int j = 0; j<n-1; j++) {
                System.out.print(b[i][j] + "  ");
            }
            System.out.print("\n");
        }
    }
}





//Упорядочить строки (столбцы) матрицы в порядке возрастания значений элементов k-го столбца (строки)
import java.util.Scanner;
import java.util.Random;
public class OT2_1 {
    public static void main(String[] args) {
        int n;
        int m;
        int k;
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
        Scanner column = new Scanner(System.in);
        System.out.print("Input column of array: ");
        k = column.nextInt();
        for (int i=0;  i < n-1  ; i++){
          for (int c=i+1; c < n; c++) {
              if (a[i][k] > a[c][k]) {
                  for (int j = 0; j < n; j++) {
                      int temp = a[i][j];
                      a[i][j] = a[c][j];
                      a[c][j] = temp;
                  }
              }
          }
        }
        System.out.println("Sorted array: ");
        for (int i=0; i<n; i++)
        {
            for (int j=0; j<n; j++)
            {
                System.out.print(a[i][j]+"  ");
            }
            System.out.print("\n");
        }
    }
}





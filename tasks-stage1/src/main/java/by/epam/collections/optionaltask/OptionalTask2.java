// Ввести число, занести его цифры в стек. Вывести число, у которого цифры идут в обратном порядке
package by.epam.collections.optionaltask;
import java.util.*;
public class OptionalTask2 {
    public static void main(String[] args) {
        Stack stack = new Stack();
        int number=0;
        System.out.println("Input number");
        Scanner sc = new Scanner(System.in);
        try {
            number = sc.nextInt();
        } catch (InputMismatchException fg)
        {
            System.out.print("It does not a number" );
        }
        char [] numbers = String.valueOf(number).toCharArray();
        for(char num : numbers){
            stack.push(num);}
        while(!stack.empty())
        {
            char stackNum;
            stackNum = (Character)stack.pop();
            System.out.print(stackNum);
        }
    }
}





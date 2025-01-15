
//basic calculator using if-else
package Conditionals.Module_8;
import java.util.Scanner;

public class CalculatorIfElse {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        char op = sc.next().charAt(0);

        if(op == '+') System.out.println(a + b);
        if(op == '-') System.out.println(a - b);
        if(op == '*') System.out.println(a * b);
        if(op == '/') System.out.println(a / b);

    }
}

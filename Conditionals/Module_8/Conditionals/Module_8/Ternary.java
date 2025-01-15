
//example of ternary operator in even odd question 
package Conditionals.Module_8;

import java.util.Scanner;

public class Ternary {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        int num;
        System.out.println("Enter a number: ");
        num = sc.nextInt();
        System.out.println((num % 2 == 0) ? "even" : "Odd");

    }
    
}

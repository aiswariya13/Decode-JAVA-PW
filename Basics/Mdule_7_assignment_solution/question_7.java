// Write a Java program that uses boolean variables and relational operators to compare two numbers. Print whether the numbers are equal, not equal, greater, or less.

import java.util.Scanner;
public class question_7 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num1,num2;
        System.out.println("Enter the first number: ");
        num1=sc.nextInt();
        System.out.println("Enter the second number:");
        num2=sc.nextInt();

        boolean is_Equal = num1 == num2 ;
        boolean isnot_Equal = num1 != num2 ;
        boolean is_Greater = num1 > num2 ;
        boolean is_less = num1 < num2 ;

        System.out.println("The first number is : "+ num1);
        System.out.println("The second number is : "+ num2);
        System.out.println("Are numbers equal? " +is_Equal);
        System.out.println("Are numbers not equal? " +isnot_Equal);
        System.out.println("Is the first number greater? " + is_Greater);
        System.out.println("Is the first number less? "+ is_less);

    }
    
}

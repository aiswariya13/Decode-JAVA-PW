//Multiple cobnditions using && and || (Logical Operator)
package Conditionals.Module_8;

import java.util.Scanner;
public class ThreeDigitnum {
    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);
    int number;         //variable declaration
    System.out.print("enter the number");
    number = sc.nextInt();          //taking input

    if(number > 99 && number < 1000)            //condition checking with logical &&
    System.out.println("The number is a three digit number.");
    else
    System.out.println("the number is not a three digit number");


    }
    
}

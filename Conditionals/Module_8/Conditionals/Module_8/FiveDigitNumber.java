//Multiple cobnditions using && and || (Logical Operator)
package Conditionals.Module_8;

import java.util.Scanner;
public class FiveDigitNumber {
    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);
    int number;                             //variable declaration
    System.out.print("enter the number");
    number = sc.nextInt();                  //taking input

    if(number > 9999 && number < 100000)        //condition checking using logical &&
    System.out.println("The number is a five digit number.");
    else
    System.out.println("the number is not a five digit number");


    }
    
}

package Conditionals.Module_8;
import java.util.Scanner;

public class DivisibleBy5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number;     //variable declaration
        System.out.println("Enter the number:");
        number = sc.nextInt();      //taking input

        if(number % 5 == 0)         //condition checking
        System.out.println("The number is divisible by 5.");
        else
        System.out.println("The number is not divisible by 5.");

    }
    
}

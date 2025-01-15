package Conditionals.Module_8;
import java.util.Scanner;

public class Absolute_number {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int number;         //variable declaration
        System.out.println("Enetr the number: ");
        number= sc.nextInt();

        if(number < 0)      //condition checking
        {

        number=number * (-1);           //calculation part
        System.out.println("The absolute value of given number is "+number);
        
        }

        else
        {

        System.out.println("The absolute value of given number is "+ number);
        
        }
        
    }
}

package Conditionals.Module_8;
import java.util.Scanner;
public class DivisibleBy5or3{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n;          //declaring variable
        System.out.println("Enter a number: ");
        n = sc.nextInt();           //taking input

        if(n % 5 == 0 || n % 3 == 0)        //condition checking with logical or 
        System.out.println("the number is divisible by 5 or 3");
        else
        System.out.println("the number is not divisible by 5 or 3");
    }
}
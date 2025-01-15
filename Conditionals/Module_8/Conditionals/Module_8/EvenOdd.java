package Conditionals.Module_8;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;              //variable declaration
        System.out.println("enter a number");
        n = sc.nextInt();           //taking input
        if(n % 2 == 0)                 //condition checking
        System.out.println("even number");
        else
        System.out.println("Odd number");

        
    }
    
}

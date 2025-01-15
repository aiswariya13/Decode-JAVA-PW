package Basics.Module_7;

//take a number input x and print the half of the number 

import java.util.Scanner;

public class Typecasting {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a value of x: ");
        int x = sc.nextInt();
        double y = (double)x;
        System.out.println(y/2);
    }
    
}

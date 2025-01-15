// Write a Java program to find and print the greatest of three numbers entered by the user.

import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2, num3 ;                      //variable declaration 
        System.out.println("Enter the first numbers: ");
        num1 = sc.nextInt() ;                       //First variable initialization 
        System.out.println("Enter the second numbers: ");
        num2 = sc.nextInt() ;                       //second variable initialization
        System.out.println("Enter the third numbers: ");
        num3 = sc.nextInt() ;                       //third variable initialization

        if(num1 > num2 && num1 > num3){             //using conditional operator &&
            System.out.println(num1+ " is the greatest of three.");
        }
        else if(num2 > num3 ){
            System.out.println(num2+" is the greatest");
        }
        else{
            System.out.println(num3+" is the greatest ");
        }
        
    }
}


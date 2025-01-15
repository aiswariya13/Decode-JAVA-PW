//Write a Java function that takes an integer as input and prints "Even" if the number is even and "Odd" if it's odd

import java.util.Scanner;
public class Question1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.print("Enter the number: ");
        num = sc.nextInt() ;
        if(num % 2 == 0){
            System.out.println("Even number");
        }
        else{
            System.out.println("Odd number ");
        }

    }
}

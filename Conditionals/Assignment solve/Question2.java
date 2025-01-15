//Create a Java method to find and print the absolute value of an integer without using the built-in Math.abs() function

import java.util.Scanner;
public class Question2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.print("Enter a number:");
        num = sc.nextInt() ;
        if(num < 0){
            num = num * (-1);
            System.out.println("The absolute value is :"+ num);
        }
        else{
            System.out.println("The absolute value is :"+ num);
        }
    }
    
}



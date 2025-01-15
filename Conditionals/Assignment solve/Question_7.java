 // Develop a Java program to find and print the least of three numbers using nested if-else statements

import java.util.Scanner;
public class Question_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2, num3 ;
        System.out.println("Enter the numbers:");
        num1 = sc.nextInt() ;       //variable initialisation
        num2 = sc.nextInt() ;       //variable initialisation
        num3 = sc.nextInt() ;       //variable initialisation

        //using nested if-else statement 
    
        if(num1 < num2 ){
            if(num1 < num3 ){
                System.out.println(num1+" is the least number ");
            }

            else{
                System.out.println(num3+ " is the least number.");
            }
            }
        else {
            if(num2 > num3 )
            {
                System.out.println(num3 +" is the least number");
            }
            else{
                System.out.println(num2+" is the least");
            }
        }
            
        }

    }    


// Implement a Java function to determine if a given year is a leap year or not. Print "Leap Year" if true, otherwise print "Not a Leap Year.

import java.util.Scanner;
public class Question4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year ;
        System.out.print("Enter a year: ");
        year = sc.nextInt();
        
        if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
            System.out.println("It's a Leap-Year");
        }
        else{
            System.out.println("It's not a Leap-Year");
        }
    }
}


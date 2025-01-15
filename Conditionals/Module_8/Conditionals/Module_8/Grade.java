//grading_system
package Conditionals.Module_8;
import java.util.Scanner;
public class Grade {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int marks;
        System.out.println("Enter the marks: ");
        marks = sc.nextInt();

        if(marks >= 81 && marks <= 100 ){
            System.out.println("Very Good");
        }

        else if( marks >=61 && marks <= 80){
            System.out.println("Good");
        }
        else if( marks >=41 && marks <= 60){
            System.out.println("Average");
        }
        else if(marks <= 40){
            System.out.println("Fail");
        }
    }


    
}

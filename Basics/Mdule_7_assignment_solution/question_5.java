// Write a Java program to calculate the area of a circle and the simple interest. Take necessary inputs from the user.

import java.util.Scanner;
public class question_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a radius :");
        double r = sc.nextDouble();
        double area = Math.PI * r * r;
        System.out.println("The area of a circle is :" + area);

        System.out.print("Enter the principle: ");
        double p = sc.nextDouble();
        System.out.print("Enter the rate of interest:");
        double i = sc.nextDouble();
        System.out.print("Enter the time (in years) :");
        double t = sc.nextDouble();

        double interest =( p * i * t )/100;
        

        System.out.println("The amount of interest is " + interest);
    }

    

    
}

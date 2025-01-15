package Conditionals.Module_8;
import java.util.Scanner;
public class SideOfTriangle {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int side1, side2, side3 ;
        System.out.println("Enter the sides of a triangle:");
        side1 = sc.nextInt() ;
        side2 = sc.nextInt() ;
        side3 = sc.nextInt() ;

        if(side1 + side2 > side3 && side2 + side3 > side1 && side3 + side1 >side2){
            System.out.println("this triangle can be formed");

        }
        else{
            System.out.println("No triangle can be formed");
        }

    }
    
}

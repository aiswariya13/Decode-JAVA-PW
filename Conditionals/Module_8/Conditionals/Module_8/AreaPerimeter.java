
package Conditionals.Module_8;
import java.util.Scanner;

public class AreaPerimeter {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        double l, b, area, perimeter ;              //variable declaration

        System.out.print("Enter the length of the rectangle: ");
        l = sc.nextDouble();                            //taking the input of the length
        System.out.print("Enter the breadth of the rectangle: ");           //taking the input of the breadth
        b = sc.nextDouble();

        area = l * b ;                  //calculating area
        perimeter = 2 * (l + b) ;       //calculating perimeter

        if(area > perimeter ){              //condition checking 
            System.out.println("area is greater than the perimeter " );
        }

        if(area < perimeter){               //condition checking 

            System.out.println("area is less than the perimeter ");

        }

        if(area == perimeter ){           //condition checking for equality 
            System.out.println("Both area and perimeter are same");
        }


    }
}

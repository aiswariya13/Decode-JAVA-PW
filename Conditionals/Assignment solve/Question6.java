//Create a Java function that takes three integer parameters representing the sides of a triangle and prints whether it's equilateral, isosceles, or scalene
	
import java.util.Scanner;
    public class Question6 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int side1, side2, side3 ;
            System.out.println("Enter the three sides of a triangle: ");
            side1 = sc.nextInt() ;          //variable initialisation 
            side2 = sc.nextInt() ;          //variable initialisation
            side3 = sc.nextInt() ;          //variable initialisation

            if(side1 == side2 && side2 == side3 && side3 == side1){         //using conditional operator
                System.out.println("Equilateral Triangle");
            }
            else if (side1 == side2 || side1 == side3 || side2 == side3){
                System.out.println("Isosceles Triangle");
            
            }

            else if(side1 != side2 && side1 != side3 && side2 != side3){
                System.out.println("Scalene Triangle");
            }

        }
    
}



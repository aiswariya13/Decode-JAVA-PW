import java.util.Scanner;

public class MarksLessThan35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int noOfStudents, i ;
        System.out.println("Enter the number of students:");
         noOfStudents = sc.nextInt();

         System.out.println("Enter the numbers:");
         int[] arr = new int[noOfStudents];
         for(i= 0; i < noOfStudents; i++){
            arr[i] = sc.nextInt();

         }
         System.out.println("The roll numbers are: ");
         for(i = 0; i < noOfStudents; i++ ){
            if(arr[i] < 35){
                System.out.print(i+1 + " ");
            }
         }

    }    
}

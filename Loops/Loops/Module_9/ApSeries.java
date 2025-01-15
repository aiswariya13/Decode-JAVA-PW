package Loops.Module_9 ;

import java.util.Scanner;
public class ApSeries {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n ;
        System.out.println("Enter the number of term to print :");
        n = sc.nextInt();
        for(int i = 1 ; i <= 2 * n - 1 ; i+=2){
            System.out.println(i);
        }
        
    }
    
}

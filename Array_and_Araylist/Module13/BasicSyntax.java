import java.util.Scanner;
public class BasicSyntax {
    public static void main(String[] args) {
        int[] arr ; // declaration
        arr = new int[100]; //memory allocation
        //data type[] arrayname(variablename) = new(keyword to create space in memory) int[100](size of array)

        //initializing an array individually
        arr[0] = 7 ;
        arr[1]= 5;

        //output of an array
        System.out.println(arr[0] + " ");
        arr[0] = 99;
        arr[0] += 10 ;
        System.out.println(arr[0] + " ");


        arr[2] = 20;
        arr[3] = 30;
        arr[4] = 40;
        arr[5] = 50;
        arr[6] = 60;
        arr[7] = 70;

        //output using for loop

        for(int i = 2 ; i <= 7; i++){
            System.out.println(arr[i] + " ");
        }
        
        //input using for loop

        for(int j = 0; j <= 7 ; j++){
            // arr[j] = sc.nextInt();
        }

        //taking  a size of arr

        // int n;
        // System.out.println("enter the size of n :");

        // n = sc.nextInt();
        // int[] arr1 = new int[n];

        //int[] arr = {10, 20, 30, 40};
        // System.out.println(arr[2]);
    

    }
    
}

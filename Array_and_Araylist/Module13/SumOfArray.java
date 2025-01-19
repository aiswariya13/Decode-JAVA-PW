import java.util.Scanner;
public class SumOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, sum = 0;
        int[] arr = new int[10] ;
        System.out.println("Enter the values of array:");
        for(i = 0 ; i < 10 ; i++){
            arr[i] = sc.nextInt();

        }
        for(i = 0 ; i < 10 ; i++){
        
            sum += arr[i];
    }
    System.out.println("sum of the array is :" + sum);
    
}
}

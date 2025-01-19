import java.util.Scanner;
public class printGivenArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int i, n;
        System.out.print("Enter the value of n:");
        n = sc.nextInt();

        int[] arr = new int[n];
        System.out.print("Enter the values of the array:");
        for( i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("the given array is :");
        for(i= 0 ; i < n ; i++){
            System.out.print(arr[i] + " ");
        }
    }
    
}

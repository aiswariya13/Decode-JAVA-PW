import java.util.Scanner;

public class MinimumElement {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int[] arr ;
        int i, n;
        System.out.println("Enter the value of n:");
        n = sc.nextInt();

        arr = new int[n];
        System.out.println("Enter the elements of an array:");
        for(i = 0; i < n ; i++){
            arr[i] = sc.nextInt();

        }
        int minimum_element = arr[0] ;

        for(i = 0 ; i < n ; i ++){
            if(arr[i] < minimum_element){
                minimum_element = arr[i] ;
            }
        }

        System.out.println("The minimum element is "+ minimum_element);

    }
    
}

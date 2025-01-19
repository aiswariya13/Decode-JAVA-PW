import java.util.Scanner;
public class ReverseArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n, i ;

        System.out.println("Enter the number of element");
        n = sc.nextInt();

        int[] arr = new int[n] ;
        System.out.println("Enter the elements of the array:");
        for(i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("The given array is :");
        for(i = 0 ; i < n ; i++ ){
             System.out.print(arr[i]+ " ");
        }
        System.out.print("\nThe reversed array is :");
        for(i = arr.length - 1 ; i >= 0 ; i-- ){
             System.out.print(arr[i]+ " ");
        }


    }
    
}

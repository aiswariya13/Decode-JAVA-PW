import java.util.Scanner;
public class SecondMaximumElement {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n, i, max_element = Integer.MIN_VALUE, second_max = Integer.MIN_VALUE;
        System.out.println("Enter the size of array :");
        n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the values of an array:");
        for(i = 0; i < n; i++){
            arr[i] = sc.nextInt() ;

        }

        for(i = 0; i < n ; i++){
            if(arr[i] > max_element){
                max_element = arr[i] ;
            }
        }

        for(i = 0; i < n; i++){
            if(arr[i] > second_max && arr[i] != max_element){
                second_max = arr[i];
            }
        }

        System.out.println("The Second Laegest element is : "+second_max);
    }
}

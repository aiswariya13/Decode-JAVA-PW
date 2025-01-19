import java.util.Scanner;
public class ProductOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i, product = 1 ;
        int[] arr = new int[10];
        System.out.println("Enter the values of array:");
        for(i = 0 ; i < 10 ; i++)
        arr[i] = sc.nextInt();

        for(i = 0 ; i < 10 ; i++){
            product *= arr[i];
        
    }
    System.out.println("The product is :"+ product);
    
}
}

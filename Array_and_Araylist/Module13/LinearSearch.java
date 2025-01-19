import java.util.Scanner;
public class LinearSearch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int i, x, n, flag=0;

        //enter the size of an array
        System.out.println("Enter the size of an array:");
        n = sc.nextInt();
        //array initializing
        int[] arr = new int[n];
      
        System.out.println("Enter the elements of an array :");
        for(i = 0 ; i < n ; i++){
        arr[i] = sc.nextInt();

        }

        System.out.println("Enter the target elements:");
        x = sc.nextInt();

        for(i = 0 ; i < n ; i++){
            if(arr[i] == x){
                flag = i ;
                break ;         // otherwise the loop will continue after getting the value
                
            }
            else{
                flag = -1 ;
            }
        }

        if(flag == -1){
            System.out.println(x+" is not found in the array");
            
        }
        else{
            System.out.println(x+" is found in the array");

        }

    }
    
}


/*
 * boolean flag = false;
 * for (int i = 0 ; i < n ; i++){
 * if (arr[i] == x){
 * flag = true ;
 * break; }}
 */

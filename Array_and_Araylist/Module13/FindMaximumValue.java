import java.util.Scanner;
public class FindMaximumValue {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, i, max;
        System.out.println("Enter the size of array:");
        n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the values of the array:");
        for(i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }
        max = arr[0];

        for(i = 0 ; i < n ; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("The maximum value in the array is :"+ max);

    }
   
}

//alternativesolve

/*
 * boolean flag = false;
 * for(i = 0 ; i<n ; i++)
 * if(arr[i]== x){
 * flag = true}
 * //another way to solve
 * max = Integer.MIN_VALUE;//lowest value 
 max = Math.max(max,arr[i])
 */

import java.util.Scanner;
public class TwoSum{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, i, j ;
        int[] arr = {2, 5, 8, 9, 4, 1, 3, 6, 7} ;
        System.out.println("Enter the value of x:");
        x = sc.nextInt() ;

        for(i = 0; i < arr.length ; i++){

            for(j = i + 1 ; j< arr.length ; j++){
                if(arr[i] + arr[j] == x){
                    System.out.println(arr[i]+"+"+arr[j]);
                }
            }

        }
    }
    
}

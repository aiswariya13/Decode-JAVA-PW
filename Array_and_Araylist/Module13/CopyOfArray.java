import java.util.Arrays;

public class CopyOfArray {

    public static void main(String[] args) {
        int[] arr = {30, 10, 40, 23, 89, 34};
        for(int ele : arr){
            System.out.print(ele + " ");

        }

        System.out.println();
        int[] nums = arr ; //Shallow Copy
        nums[0] = 70 ;
        System.out.println(arr[0]);
        
        //deep copy
        int[] brr = Arrays.copyOf(arr, arr.length);
        brr[0] = 70 ; 
        System.out.println(arr[0]);
        
        //another way  to create deep copy
        int[] crr = new int[arr.length];
    }
    
}

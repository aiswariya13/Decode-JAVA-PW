import java.util.Arrays;

public class BuiltInMethods {

    public static void main(String[] args) {
        int[] arr = {10, 20, 14, 64, 21, 30, 50 ,70, 24} ;
        for (int ele : arr){
            System.out.print(ele + " ");
        }

        Arrays.sort(arr);
        System.out.println();
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i] + " ");
        }

    }
    
}

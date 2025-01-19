import java.util.Arrays;
public class SortWithoutAlgo {

    public static void main(String[] args) {

        int[] arr = {0, 1, 2, 0, 0, 2, 1, 1, 2, 2, 1, 0, 2};
        for(int i = 0 ; i < arr.length ; i++){
        System.out.print(arr[i]+ " ");
        }
        Arrays.sort(arr);
        System.out.println();
        for(int i = 0 ; i < arr.length ; i++){

            System.out.print(arr[i] + " ");

        }
        
    }
    
}

import java.util.Scanner;

 class RotateArrayByK {
    public void reverse(int[] arr, int i, int j,int a){
        while(i <= j){

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp ;
        i++;
        j--;

        }
        

    }

    public static void main(String[] args) {
        
        Scanner sc =new Scanner(System.in);

        int k, n,a;
        System.out.println("Enter the value of K(numbers of steps)/;");
        k = sc.nextInt();
        System.out.println("Enter the size of array:");
        n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the array elements: ");
        for(a = 0 ; a < n ; a++){
            arr[a] = sc.nextInt();

        }
        for(a = 0 ; a < n ; a++){
            System.out.print(arr[a]+" ");

        }
        RotateArrayByK obj = new RotateArrayByK();
        k = k % n ;
        obj.reverse(arr, 0, n-k-1,0);
        obj.reverse(arr, n-k,n-1,0);
        obj.reverse(arr, 0, n-1 ,a);


        System.out.println();
        for(a = 0 ; a < arr.length ; a++){
            System.out.print(arr[a]+" ");

        }


    }
    
}

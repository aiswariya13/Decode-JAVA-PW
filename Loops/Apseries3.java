import java.util.Scanner;

public class Apseries3 {


    //4 7 10 13.....

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.println("Enter a value of n:");

        n = sc.nextInt();
        for(int i = 4 ; i <= 3 * n + 1 ; i = i + 3){
            System.out.println(i);
        }
    }
    
}

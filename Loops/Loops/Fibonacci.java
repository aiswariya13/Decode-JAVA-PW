import java.util.Scanner;
public class Fibonacci {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fterm = 0, sterm = 1, nterm, i, n;
        System.out.println("Enter the number of terms:");
        n = sc.nextInt();

        for(i = 1; i <= n; ++i){
            System.out.println(fterm+",");

            nterm = fterm + sterm ;
            fterm = sterm;
            sterm = nterm;
            
        }
    }
    
}

import java.util.Scanner;
//4,7,10,13,16.....upto n term
public class apseries2{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n ;
        System.out.println("Enter the number of term to print :");
        n = sc.nextInt();
        
        // formula
        //an = a+(n-1)d
        // [a=first term ; d = common difference ]
        // an = 4 + 3*n- 3
        // an = 3n +1

        for(int i = 4 ; i <= 3 * n + 1  ; i+=3){
            System.out.println(i);
        }
        
    }
    
}

    


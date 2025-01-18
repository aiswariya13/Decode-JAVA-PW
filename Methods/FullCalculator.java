import java.util.Scanner;
class Calculation{
    int add(int x, int y){
        return x + y ; 

    }
    int sub(int x, int y){
        return x - y ;

    }
    int mul(int x, int y){
        return x * y ;
    }
    float div(int x, int y){
        return x / y ;

    }
}
public class FullCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1, n2;
        System.out.println("Enter the value of n1:");
        n1 = sc.nextInt();
        System.out.println("Enter the valueof n2:");
        n2 = sc.nextInt();

        Calculation calc = new Calculation();

        int a = calc.add(n1, n2);
        int b = calc.sub(n1, n2);
        int c = calc.mul(n1, n2);
        float d = calc.div(n1, n2);

        System.out.println("addition value:"+a);
        System.out.println("substraction value:"+b);
        System.out.println("multiplication value:"+c);
        System.out.println("division value:"+d);

    }
    
}

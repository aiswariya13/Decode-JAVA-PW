// Design a Java program that calculates and prints whether a transaction results in a profit, loss, or break-even based on the cost price and selling price

import java.util.Scanner;
public class Question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double cp, sp, profit, loss ;
        System.out.print("Enter the Cost-price: ");
        cp = sc.nextDouble();
        System.out.print("Enter the selling price : ");
        sp = sc.nextDouble();

        if(cp > sp){
            System.out.println("It's a loss");
            loss = cp - sp ;
            System.out.println("The amount of loss is "+ loss);
        }
        else if(sp > cp){
            System.out.println("It's a profit");
            profit = sp - cp ;
            System.out.println("The amount of loss is "+ profit);

        }
        else if( sp == cp ){
            System.out.println("It's neither loss nor profit ");
            
        }
    }
    
}


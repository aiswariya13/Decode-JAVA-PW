package Conditionals.Module_8;

import java.util.Scanner;

public class ProfitLoss {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        double cost_price, selling_price, profit, loss;         //variables declaration

        System.out.print("Enetr the Cost price: ");
        cost_price = sc.nextDouble();                           //taking cost price
        System.out.print("Enter the selling price: ");
        selling_price = sc.nextDouble();                        //taking selling price

        if(cost_price > selling_price){                        //condition checking for loss
            loss = cost_price - selling_price ;                //calculating losss 
            System.out.println("It's a loss of amount "+ loss);
        }

        if(cost_price < selling_price){                         //condition checking for profit
            profit = selling_price - cost_price ;               //calculating profit
            System.out.println("It's a profit of amount "+profit);

        }

        if(cost_price == selling_price){                        //condition checking for same profit and loss
            System.out.println("No profit no loss");
        }


    }
}

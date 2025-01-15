package Basics.Module_7;

import java.util.Scanner;
public class Area_circleUI {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("enter the radius");
        double r = sc.nextDouble();
        double area = 4*3.1415*r*r;
        System.out.println(area);
 
    }
    
}

package Basics.Module_7;

import java.util.Scanner;

public class CharDataType {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a character: ");
        char ch = sc.next().charAt(0);
        int x = (int)ch;
        System.out.println(x);


    }
    
}

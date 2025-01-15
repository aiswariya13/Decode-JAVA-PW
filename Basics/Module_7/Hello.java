package Basics.Module_7;


//concept of printing and newline 

//before this public class line here should be a package name but you need to create the package first in your system then you need to add this 
public class Hello{             //it should be the file name always 
    public static void main(String[] args ){
        int x=6;                //initialization and declaration
        System.out.println(x);
        x += 7;      //x=x+7 shortcut process


        System.out.println();                                           //just give a blank line 
        System.out.print("hello Aiswariya");                         //it prints but doesn't take a new line
        System.out.println("Welcome to JAVA World");                //it gives a new line for the next line 
        System.out.println("\n Welcome to Tech World\n");          //it gives new line at first and at last 
        System.out.println("Let's start your DSA Journey");     //  "" takes the text to print
        System.out.println(x);          //takes the x variable
    }
}
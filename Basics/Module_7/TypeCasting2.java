package Basics.Module_7;

public class TypeCasting2 {
    // here we'll know about

    //   int / int = int
    //   int / double = double
    //   double / int = double 
    //   double / double = double
   
    // so double holds the higher priority 

    public static void main(String[] args) {
        
        double x = 5;
        double y = 2;
        System.out.println(x/y);

        double z = 5/2;     // here it's evaluated first then it stores in z as z is double so it's saved as 2.0 then it's printed 
        System.out.println(z);
    }
 

    
}

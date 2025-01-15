// Find the youngest of Ram Shyam Arjun
package Conditionals.Module_8;

import java.util.Scanner;
public class Youngest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int Ram_age, Shyam_age, Arjun_age ;
        System.out.println("Enter the three ages : ");
        Ram_age = sc.nextInt();
        Shyam_age = sc.nextInt();
        Arjun_age = sc.nextInt();

        if(Ram_age < Shyam_age){
            if(Ram_age < Arjun_age){
                System.out.println(Ram_age+" is the least");
            }
            else{
                System.out.println(Arjun_age+"is the least"
                );
            }

        }

        else{
            if(Shyam_age < Arjun_age){
                System.out.println(Shyam_age+"is the least");
            }
            else{
                System.out.println(Arjun_age+"is the least");
            }
        }
        
    }
}


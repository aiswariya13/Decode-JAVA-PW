package Basics.Module_7;

//calculate the volume of a sphere

public class VolumeOfSphere {
    public static void main(String[] args){
        double r = 3.7;
        double volume = ( 4 * 3.1415 * r * r * r) / 3;
        System.out.println("The volume of the sphere with radius "+r+ " is "+volume);
    }
}

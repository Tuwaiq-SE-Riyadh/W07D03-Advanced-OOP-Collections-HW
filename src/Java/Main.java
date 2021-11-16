package Java;

public class Main {

    public static void main(String[] args) {

        //Declare an instance of class Circle in the main and test methods(getRadius, getArea) of this instance.
        Circle circle1=new Circle("red",  2.0,  10);
        System.out.println("Circle color: "+circle1.getColor());
        System.out.println("Circle Radius: "+circle1.getRadius());

        //Declare an instance of class Cylinder in the main and test its methods.
        Cylinder Cylinder1=new Cylinder("Blue",2.0,20,2);
        System.out.println("The volume is: "+Cylinder1.getVolume());
        System.out.println(Cylinder1.toString());
    }
}

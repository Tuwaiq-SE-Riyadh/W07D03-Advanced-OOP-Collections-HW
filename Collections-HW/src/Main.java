public class Main {
    public static void main(String [] args){
        circle circle = new circle("red",  1.0,  5);
        System.out.println("Circle color: " + circle.getColor());
        System.out.println("Circle Radius: " + circle.getRadius());

        Cylinder cylinder = new Cylinder("black",2.0,10,2);
        System.out.println("cylinder color: " + cylinder.getColor());
        System.out.println("cylinder Radius: " + cylinder.getRadius());
        System.out.println("The volume is: " + cylinder.getVolume());
    }
}

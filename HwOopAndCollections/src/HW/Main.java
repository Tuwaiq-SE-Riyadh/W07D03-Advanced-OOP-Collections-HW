package HW;

public class Main {

    public static void main(String[] args) {
        System.out.println("--- Circle ---");
        Circle obj1 = new Circle();
        System.out.println(obj1.getRadius());
        System.out.println(obj1.getArea());

        System.out.println("--- Cylinder ---");
        Cylinder obj2 = new Cylinder();
        System.out.println(obj2.getHeight());
        System.out.println(obj2.getVolume());


    }
}

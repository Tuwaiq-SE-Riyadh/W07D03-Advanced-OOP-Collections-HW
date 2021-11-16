package advOopAndCollectionHW;

public class Test {

	public static void main(String[] args) {
		Circle circle1 = new Circle();
		System.out.println("Radios = " + circle1.getRadius() + "\nColor: " + circle1.getColor());
		
		System.out.println("--------------------------------------------");
		
		Circle circle2 = new Circle(3.0 , "Black");
		System.out.println("Radios = " + circle2.getRadius() + "\nColor: " + circle2.getColor());
		
		System.out.println("--------------------------------------------");
		
		Cylinder cylinder = new Cylinder(4.0, "blue", 5.0);
		System.out.println("Radios = " + circle2.getRadius() + "\nColor: " + circle2.getColor() + "\nHeight = " + cylinder.getHeight());
		System.out.println("Volume = " + cylinder.getVolume());
	}
}

package advOopAndCollectionHW;

public class Cylinder extends Circle {
	
	private double height = 1.0;
	
	public Cylinder(double radius, String color, double height){
		super(radius, color);
		this.height = height;
	}
	public double getHeight() {
		return this.height;
	}
	public double getVolume(){
		return this.height * (3.142 * (getRadius() * getRadius()));
	}
}

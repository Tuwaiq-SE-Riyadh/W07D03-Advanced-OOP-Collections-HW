package advOopAndCollectionHW;

public class Circle {
	private double radius = 1.0;
	private String color = "red";
	
	public Circle(){
		
	}
	public Circle(double radius, String color){
		this.radius = radius;
		this.color = color;
	}
	public double getRadius() {
		return this.radius;
	}
	public String getColor() {
		return this.color;
	}
}


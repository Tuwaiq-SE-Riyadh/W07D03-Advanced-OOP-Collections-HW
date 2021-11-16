public class circle {
    private double radius = 1.0;
    private String color = "red";
    private double area;

    public circle(String color, double radius, double area){
        this.color=color;
        this.radius=radius;
        this.area=area;
    }

    public double getRadius(){
        return radius;
    }
    public double getArea(){
        return area;
    }
    public String getColor() {
        return color;
    }

}

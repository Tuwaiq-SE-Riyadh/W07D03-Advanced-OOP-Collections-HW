package com.company;
import java.util.* ;
public class Main {

    public static void main(String[] args) {
    circle circle= new circle();
        System.out.println("Circle radius:\t"+circle.getRadius());
        System.out.println("Circle Area:\t"+circle.getArea());
        Cylinder cylinder=new Cylinder();

        System.out.println("Cylinder height:\t"+cylinder.getHeight());
        System.out.println("Cylinder volume:\t"+cylinder.getVolume());

//                       task2
        ArrayList<String> days = new ArrayList<String>();
        days.add("Saturday");
        days.add("Sunday");
        days.add("Monday");
        days.add("Tuesday");
        days.add("Wednesday");
        days.add("Thursday");
        days.add("Friday");
        System.out.println("the days before replace :\t"+days);
        days.set(1,"good day");
        System.out.println("the days after replace :\t"+days);

        PriorityQueue<String> color=new PriorityQueue<String>();
        color.offer("Black");
        color.offer("Red");
        color.offer("Yellow");
        color.offer("Green");
        color.offer("Blue");
        Iterator element =color.iterator();
        while (element.hasNext()){
            System.out.println("colors:\t"+element.next());
        }

        Scanner input=new Scanner(System.in);
        System.out.println("Please write color to check it's in queue ");
        String checkColor=input.next();
        if (color.contains(checkColor)){
            System.out.println("The "+checkColor+" in queue");
        }else {
            System.out.println("The "+checkColor+" is not in queue i well add it ");
            color.add(checkColor);
            Iterator elementCheck =color.iterator();
            while (element.hasNext()){
                System.out.println("colors:\t"+elementCheck.next());
            }
        }






    }
}

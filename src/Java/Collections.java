package Java;
import java.util.*;
public class Collections {
    public static void main(String[] args) {
        Scanner read=new Scanner(System.in);
        List<String> arrayList = new ArrayList<String>();
        arrayList.add("New York");
        arrayList.add("Atlanta");
        arrayList.add("Dallas");
        arrayList.add("Madison");

        arrayList.remove(1);
        arrayList.add(1,"Saudi Arabia");
        System.out.println(arrayList);

        //Create a new priority queue, add some colors (string) and iterate through all elements.
       PriorityQueue<String> color = new PriorityQueue<String>();
        color.offer("Red");
        color.offer("Black");
        color.offer("Orange");
        color.offer("Blue");
        // iterate the Priority Queue
        System.out.println("Elements of the Priority Queue: ");
        for (String element : color) {
            System.out.println(element);
        }
//Let the user insert elements into priority queue then check if a specific element is in the list or not.
        PriorityQueue<String> cities = new PriorityQueue<String>();
        System.out.println("Please enter three city in your country");
        String city="";
        for(int i=0;i<3;i++){
            cities.add(read.next()) ;
        }
        System.out.println("the user there cities: "+cities);

    }
}

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Collections {
    public static void main(String[] args) {

//        Write a Java program to replace the second element of a ArrayList with the specified element
        List<String> arrayList = new ArrayList<String>();
        arrayList.add("Maram");
        arrayList.add("Abdulaziz");
        arrayList.add("Khaled");
        arrayList.add("Ahmed");
        System.out.println("Before: " + arrayList);
        arrayList.set(1,"Mohammed");
        System.out.println("After: " + arrayList);


//        Create a new priority queue, add some colors (string) and iterate through all elements.
        PriorityQueue<String> color = new PriorityQueue<String>();
        color.offer("black");
        color.offer("red");
        color.offer("yellow");
        color.offer("Blue");
        System.out.println("Queue Color: ");
        for (String e : color) {
            System.out.println(e);
        }

//        Let the user insert elements into priority queue then check if a specific element is in the list or not.
        Scanner scanner = new Scanner(System.in);
        System.out.println("pick color:");
        String input = scanner.nextLine();
        if(color.contains(input)){
            System.out.println("The Color already exists");
        }else {
            color.add(input);
            System.out.println("The Color added");
            System.out.println(color);
        }

    }
}

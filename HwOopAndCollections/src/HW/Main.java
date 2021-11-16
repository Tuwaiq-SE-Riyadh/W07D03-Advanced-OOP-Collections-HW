package HW;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Scanner;

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

        System.out.println("====================================================");
        System.out.println("====================================================");
        System.out.println("====================================================");

        System.out.println("--- Before replace second element ---");
        ArrayList <Integer> arrList1 = new ArrayList<>();
        arrList1.add(10);
        arrList1.add(20);
        arrList1.add(30);
        arrList1.add(40);
        arrList1.add(50);
        System.out.println(arrList1);
        System.out.println("--- After replace second element ---");
        arrList1.remove(1);
        arrList1.add(1,98);
        System.out.println(arrList1);

        System.out.println("-------------------------");
        PriorityQueue <String> pq1 = new PriorityQueue<>();
        pq1.offer("Blue");
        pq1.offer("Red");
        pq1.offer("Black");

        Iterator <String> iterator1 = pq1.iterator();
        while (iterator1.hasNext())
        {
            System.out.println(iterator1.next());
        }
        System.out.println("-------------------------");

        Scanner sc = new Scanner(System.in);
        PriorityQueue <String> pq2 = new PriorityQueue<>();

        System.out.println("Enter any thing name or [Exit] to finish the loop");
        while (true)
        {
            System.out.print("Input :");
            String userInput = sc.next();

            if(userInput.equals("Exit"))
            {
                System.out.println("Exit the loop !");
                System.out.println("All names you Add : " + pq2);
                return;
            }
            else
            {
                    if(pq2.contains(userInput))
                    {
                        System.out.println("Sorry, This name is add before !");
                    }
                    else
                    {
                        pq2.add(userInput);
                    }
            }

        }


    }
}

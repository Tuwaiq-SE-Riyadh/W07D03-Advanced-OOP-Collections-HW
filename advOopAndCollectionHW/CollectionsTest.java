package advOopAndCollectionHW;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class CollectionsTest {

	public static void main(String[] args) {
		// replace the second element of a ArrayList with the specified element
		System.out.println("-----ArrayList-----\n");
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		arrayList.add(3);
		arrayList.add(6);
		arrayList.add(15);
		arrayList.add(27);
		arrayList.add(48);
		System.out.println(arrayList);
		arrayList.set(1, 9); // we replace the element in index 1 with element '9'
		System.out.println(arrayList);
		
		//--------------------------------------PriorityQueue-----------------------------------------\\
		
		System.out.println("\n-----PriorityQueue-----\n");
		// Create a new priority queue and adding some colors to it
		PriorityQueue<String> priorityQueue = new PriorityQueue<String>();
		priorityQueue.offer("White");
		priorityQueue.offer("Black");
		priorityQueue.offer("Blue");
		priorityQueue.offer("Red");
		priorityQueue.offer("Green");
		System.out.println(priorityQueue);
		
		// iterate through all elements
		Iterator iterator = priorityQueue.iterator();
		while (iterator.hasNext()) {
		System.out.println(iterator.next());
		}
		
		// Let the user insert elements into priority queue
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please Enter Color: ");
		String userColor = scanner.next();
		// check if a specific element is in the list or not
		if(priorityQueue.contains(userColor)){
			System.out.println(userColor + " is already exist in the Queue");
		}
		else{
			priorityQueue.offer(userColor);
			System.out.println("inserted successfully in the queue");
		}
		System.out.println(priorityQueue);
	}
}

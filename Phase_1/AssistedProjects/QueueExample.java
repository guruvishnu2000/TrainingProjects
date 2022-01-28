package LIS;

import java.util.*;

public class QueueExample {
	public static void main(String[] args) 
{
        		Queue <String>locationsQueue=new LinkedList<>(); 
        				locationsQueue.add("India");
        		locationsQueue.add("Karnataka");
        		locationsQueue.add("TamilNadu");
        		locationsQueue.add("Kerala");
        		locationsQueue.add("AndraPradesh");
        		System.out.println("Queue is : " + locationsQueue);
        		System.out.println("Head of Queue : " + locationsQueue.peek());
        		locationsQueue.remove();
        		System.out.println("After removing Head of Queue : " + locationsQueue);
        		System.out.println("Size of Queue : " + locationsQueue.size());
    	}
}
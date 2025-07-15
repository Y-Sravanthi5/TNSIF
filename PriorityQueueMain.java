package com.tnsif.collections;
import java.util.PriorityQueue; 
public class PriorityQueueMain {

	public static void main(String[] args) {
		PriorityQueue <Integer> ll=new PriorityQueue<Integer>();
		ll.add(9);
		ll.add(5);
		ll.add(64);
		ll.add(100);
		ll.add(22);
		for(int x:ll){
			System.out.println(x);
		}
	}
}

	



import java.util.*;
public class ArrayListFun {
	public static void main(String args[]) {
	    ArrayList<String> list = new ArrayList<>();

	    list.add("Apple");
	    list.add("Grapes");

	    System.out.println("Original List: " + list);

	    list.add(1, "Mango");
	    System.out.println("After Adding element at index 1: " + list);

	    list.remove(0);
	    System.out.println("Element removed from index 0: " + list);

	    list.remove("Grapes");
	    System.out.println("Element Grapes removed: " + list);

	    list.set(0, "Orange");
	    System.out.println("List after updation of value: " + list);
	}
}




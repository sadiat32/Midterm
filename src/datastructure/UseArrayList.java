package datastructure;
import java.util.*;
import java.util.ArrayList;
public class UseArrayList {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * Store all the sorted data into one of the databases.
		 * 
		 */
		//LinkedList list = new LinkedList();
		ArrayList<String> alist=new ArrayList<String>();
		alist.add("John");
		alist.add("Sadia");
		alist.add("Sara");
		alist.add("Peter");
		alist.add("Cali");
		alist.add("Hill");
		System.out.println(alist);
		alist.add(3, "Peter");
		System.out.println(alist);

		alist.remove("Peter");
		System.out.println(alist);
		alist.remove(2);
		System.out.println(alist);
		System.out.println("Head of the list:" + UseArrayList.peek());
		System.out.println("The element at index 3 in the ArrayList is: " + alist.get(3));

		for(String str:alist)
			System.out.println(str);
	}

	private static String peek() {

		return peek();
	}

}

package LinkedList;
import java.util.*;
public class LL {
	public static void main(String args[]) {
		LinkedList<Integer>List = new LinkedList<Integer>();
		List.add(1);
		List.add(5);
		List.add(7);
		List.add(3);
		List.add(8);
		List.add(2);
		List.add(3);
		System.out.println(List);
		System.out.println(List.size());
		System.out.println(List.get(2));
		System.out.println(List.element());
	}

}

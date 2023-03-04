package collections;


import java.util.LinkedList;

public class LinkedListEx {

	public static void main(String[] args) {
		LinkedList l1=new LinkedList();//create the linkedlist
		l1.add("jayshri");// add the element in the linkedlist
		l1.add(5);
		l1.add("pritika");
		System.out.println(l1);//print the linkedlist
		l1.remove(1);// remove the element in the index number 1 
		System.out.println(l1); // print final Linkedlist

	}

}


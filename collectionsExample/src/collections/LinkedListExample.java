package collections;

import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) 
	{
		LinkedList<String> l=new LinkedList<String>();// create linkedlist
		l.add("Jayashri");//add the element in the linkedlist
		l.add("Pranjal");
		l.add("Pritika");
		l.add("pooja");
		System.out.println(l);//print the linkedlist
		
		l.addFirst("kalyani");// Adding element at first place 
		l.addLast("Aishwarya");// Adding element at last place 
		System.out.println(l);
		
		l.removeFirst();//removing first element 
		l.removeLast();//remove last element
		System.out.println(l);
		
		l.set(2, "Poonam");//replacing the value at index position 2
		System.out.println(l);
		
		System.out.println(l.getFirst()); // retriving at first element 
        System.out.println(l.getLast());// retriving at last element 
        
        l.add(3, "meena"); //adding the data at index number 3
	   System.out.println(l);
	   
	   l.add(4, "poonam");  //adding the data at index number 4
	   System.out.println(l);
	   
	   l.removeFirstOccurrence("poonam");//
	   System.out.println(l);
	   
	  l.removeLastOccurrence("poonam");
	  System.out.println(l);
   }

}

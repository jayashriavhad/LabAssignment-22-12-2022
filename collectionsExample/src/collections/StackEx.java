package collections;

import java.util.Stack;

public class StackEx {

	public static void main(String[] args) {
		
		Stack s=new Stack();//create stack
		s.push("jayshri");// it is simply add the element in stack
		s.push("nikita");
		s.push("megha");
		System.out.println(s);//print the stack element
	
		Stack s1 = new Stack();//create new stack
		s1.addAll(s);//this method is use to the all element in the previous stack all  to come in new stack  
		s1.push("pooja");//adding the element in the stack
		System.out.println(s1);
		
		
		s1.peek();// it is a retriving the data to the stack
		System.out.println(s);
		
		s.pop();// it is remove the element in the stack
		System.out.println(s);
		
		System.out.println(s.pop());// it is remove the element in the stack or print the remove element
		System.out.println(s);
		
		
		System.out.println(s1.search("pooja"));//we can search the value in the stack
		System.out.println(s1.search("A"));//we can search the value in the stack but this value is not available then it return -1

	}

}

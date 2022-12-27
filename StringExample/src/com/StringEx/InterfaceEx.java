/*WAP create 2 interfaces "Printable" and "Calculate" and use these 2 interfaces in 2 classes one will
  calculate square and another will calculate cube.*/

package com.StringEx;


	interface Printable
	{
		void displaySC();
	}
	class Square implements Printable
	{
		public void displaySC() 
		{
			System.out.println("Square of a number is : ");
		}
		public int cal(int n)
		{
			return n*n;
		}
	}
	interface Calculate
	{
		int cal(int n);
	}
		
	class Cube implements Calculate
	{
		public void displaySC() 
		{
			System.out.println("Cube of a number is : ");
		}
		public int cal(int n)
		{
			return n*n*n;
		}
	}

	public class InterfaceEx 
	{
		public static void main(String[] args) 
		{
			Square sq = new Square();
			sq.displaySC();
			System.out.println(sq.cal(5));
			
			Cube c = new Cube();
			c.displaySC();
			System.out.println(c.cal(5));
		}
  	}

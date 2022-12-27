//Take a String from user and reverse it and also convert the same String to UpperCase.

package com.StringEx;

import java.util.Scanner;

public class StringReverse
{
		public static void main(String args[])
		{
			Scanner SC = new Scanner(System.in);
			
			System.out.println("Enter the String:");
			String str= SC.nextLine();
		
			StringBuilder SB= new StringBuilder();
			SB.append(str);
			SB.reverse();
			
			System.out.println("Reverse String : "+SB);
			
			System.out.println("Uppercase of String"+str.toUpperCase());
			
		}

}

//WAP take 2 string as input from user and find if first String exits in another

package com.StringEx;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class StringExits {
		public static void main(String args[])
		  {
		  try
		   {
			   BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			   String s1,s2;
			   System.out.println("Enter the First String: ");
			   s1=br.readLine();
			   System.out.println("Enter the Second String: ");
			   s2=br.readLine();
			   
			   System.out.println("First String :"+s1);
			   System.out.println("Second String:"+s2);
		    
			if(s1.contains(s2))
			{
				System.out.println("yes,First String exits in another");
				
		    }
			else
			{
				System.out.println("No,First String exits in another");
			}
			}
		   catch(Exception e)
			   {
				System.out.println(e);
			   }
		  }

	}


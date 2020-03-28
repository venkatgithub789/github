package myproject;

import java.util.Scanner;

public class console_input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
		System.out.println("Plz enter all the tree values");
		int a,b,c;
		Scanner s = new Scanner(System.in);
		      a = s.nextInt();
		      b = s.nextInt();
		      c = s.nextInt();
		      
		      if (a>b && a>c)
		       System.out.println("a is bigger ");
		      else if (b>c)
		        System.out.println("b is biggest" );
		      else 
		    	  System.out.println("c is biggest");
		      
		
		
		
	}

}

//String input = "1 fish 2 fish red fish blue fish";
//Scanner s = new Scanner(input).useDelimiter("\\s*fish\\s*");
//System.out.println(s.nextInt());
//System.out.println(s.nextInt());
//System.out.println(s.next());
//System.out.println(s.next());
//s.close();



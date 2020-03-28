package myproject;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

//import javax.print.DocFlavor.STRING;

public class LIST_EX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		List<String> lst = new ArrayList<String>();
		lst.add("selenium");
		lst.add("java");
		lst.add("cobal");
		lst.add("python");
		lst.add("xml");
		lst.add("html"); //in LIST all values are arranged as it is ,given in List.
		
		for(String x : lst)
			System.out.println(x);
		
		System.out.println("--------------------------------------------------");
		
		TreeSet<String> ts = new TreeSet<String>();
		
		ts.add("rahul");
		ts.add("venkat");
		ts.add("prabhu");
		ts.add("aadi");
		ts.add("rajuu");
		ts.add("rajesh");// in Tree set all values are arranged in alphabetical order.
		                  // ie the output will be in alphabetical order 
		
		for(String x : ts)
		System.out.println(x);
		
	    
		
		
		
		
	}

}

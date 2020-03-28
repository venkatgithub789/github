package myproject;

public class primitive_class1 {

	public static void main(String[] args) {
		
		//converting int into integer
		
		
		int a = 20;
		
		 Integer i=Integer.valueOf(a);//converting int into integer
				                      //Returns an Integer instance representing the specified int value. 
		 Integer j = a;		 //auto boxing ,now compiler will write integer.value(a) internally
		 
		 System.out.println(a+"    "+i+"    "+j);
		 
		 
	
	}

}

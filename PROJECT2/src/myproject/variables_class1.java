package myproject;

public class variables_class1 {
	
	
	int data = 20;// instance variable 
	static int m = 30;//static variable 
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		int p1 = 40;// local varaiable 
		
		variables_class1 obj1= new variables_class1();
		
		System.out.println(obj1.data);
		//System.out.println(m);
		System.out.println(p1);
		
		System.out.println(m);
		variables_class1.m=90;// static variable is called with class name & only one instance  
		System.out.println(m);                             //is created for all objects.
		
		variables_class1.m=450;
		System.out.println(m);
		//obj1.data = 35; no need for this
		//System.out.println(obj1.data);
		
		
	}

}

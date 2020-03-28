package myproject;

public class methods_class1 {
	
	int x = 20;
	int y = 40;
	
	public void add()
	{
		
		System.out.println(x+y);
					
	}
	
	
	public void mult()
	{
		System.out.println(x*y);
	}
	
	public void add(int a ,int b) // method overloading for function add() with 2 arguments
	
	{
	
	System.out.println(a+b);	
	}	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
      methods_class1  mtd1  = new methods_class1();
      
      
      
            
      System.out.println(mtd1.x);
      System.out.println(mtd1.y);
      
      //methods_class1.x= 75;
      //methods_class1.y = 100;
      //System.out.println(x);
      //System.out.println(y);
      
      System.out.println("*****************************");
      
      
     // System.out.println(mtd1.x);
      //System.out.println(mtd1.y);
      
      mtd1.add();
      mtd1.mult();
      mtd1.add(3, 5);
      
      		
	}

}

package myproject;

public class PRG_CALCULATOR {
	
	
	public PRG_CALCULATOR()
	
	{  
		System.out.println("hi this is constructer being called here");
	}
	
	
	
	public void add()
	{
		System.out.println("this is add function defifntion");
	}
	
			
	public void sub()
	{
		System.out.println("this is sub function defifntion");
	}
	
	
	

	public static void main(String[] args) {
		
        PRG_CALCULATOR obj =  new PRG_CALCULATOR();
        
        obj.add();
        obj.sub();
	
		
		
		
	}

}

/*public class Calculator {

	
	  
	 
	
	public Calculator() {
		
		System.out.println("Calling constructor");
		
	}
	
	public void add() {

		System.out.println("Adding some number");
	}

	public void sub() {

		System.out.println("Sub some number");
	}

	public void div() {

		System.out.println("Div some number");
	}

	public void mult() {

		System.out.println("Mult some number");
	}

	public static void main(String[] args) {

	
		Calculator calc = new Calculator();
		calc.add();
		calc.sub();
		calc.div();
		calc.mult();
		
	}

}
*/
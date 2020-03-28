
public class Calculator {

	/*
	 * 
	 * TheDarkNight
	 * theDarkNight
	 * 
	 * 
	 */
	
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

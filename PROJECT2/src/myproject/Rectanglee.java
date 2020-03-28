package myproject;

public class Rectanglee extends shape1

{

	public Rectanglee()
	
	{
		super();
		System.out.println("cons of class rectanglee");
	}
	
	public void draw1()
	
	{
		System.out.println("this is method drwa1() from class Rectanglee here ");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Rectanglee r1 = new Rectanglee();
		
		r1.side= 10;
		r1.area=20;
		System.out.println("side from class shape1 is"+r1.side);
		System.out.println("area from class shape1 is "+r1.area);
		r1.draw();
		r1.draw1();
		

	}

}

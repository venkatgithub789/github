package JAVA_PROGRAMS;


public class switch_case_month {

	
	public static void main(String[] args)
	
	{
	
		int month = 7;
		
		String monthstring = "";
		
		switch(month) 
		
		{
		
		case 1 :
	
		monthstring = " 1 - january";
		break;
		
		case 2 :
		
		monthstring = " 2 - February";
		break;
		
		case 3 :
		monthstring = " 3 - march";
		break;
		
		case 4 :
		monthstring = " 4 - April";
		break;
		
		case 5 :
		monthstring = " 5 - May";
		break;
		
		case 6 :
		monthstring = " 6 - june";
		break;
		
		case 7 :
		monthstring = " 7 - july";
		break;
		
		case 8 :
		monthstring = " 8 - august";
		break;
		
		case 9 :
		monthstring = " 9 - sept";
		break;
		
		case 10 :
		monthstring = " 10 - october";
		break;
		
		case 11 :
		monthstring = " 11 - november";
		break;
		
		case 12 :
		monthstring = " 12 - december";
		break;
		
		default : 
		System.out.println("wrong entry for month given");
		
		}
		
		//printing month of the given number
		System.out.println("month entered is"+ monthstring);
				

	}

}

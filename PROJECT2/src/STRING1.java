

public class STRING1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		   
	   String str = "This is the new1 class java";
	   System.out.println(str.length());  // length count starts from index 0
	   System.out.println(str.charAt(10));
	   System.out.println(str.substring(3,10));	// 
	   System.out.println(str.contains("hello"));
	   System.out.println(str.indexOf("the"));
	   System.out.println(str.replace("the", "venkat"));
	   System.out.println(str.toUpperCase());
	   
	   String date = "28-dece-2019" ;
	   
	   if(date.matches("\\d{2}\\-[a-z]{6}\\d{4}"));
	   System.out.println("date format is correct");
	   //else 
	   System.out.println("incorrect date format");
	   
	   String s2 = "asdf12lkjhgasfd234quwtrut8764ncdgejwk8776";
	   System.out.println(s2.replaceAll("[a-z]","*"));// all small alphabets  are replaced with * 
	   
	     
	      
	   
	}

}

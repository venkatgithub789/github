package myproject;

public class student {

	String sname , course ; // Instance variable ,means varaibles are called only after object is created.
	                         // a copy of object is created .
	
	static String college ; //static varible & is called directly with name of the class.
	                        //only one copy of college is created.
                      	//and later if any changes made on static variable college each time
	                        //the values gets changed(updated).
	 
	// student.college ="nagarjuna"; not possible to call college variable before main() function                      
	   
	//college = "oxford"; //showing error.plz check later
	
	
	public void getdata()
	{
	System.out.println(sname+"     "+course+"     "+college);
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		
		System.out.println("college name is "+college);
		
		student.college="jntuc";
		
		
		student s1 = new student();
		
		s1.sname="rahul";
		s1.course="java";
		student.college ="simhapuri";
		
		s1.getdata();
		
		//student.college="andhra";
		
		student s2 = new student();
		s2.sname = "gopi";
		s2.course = "chash";
		student.college="venkat";
		
		s1.getdata();
		s2.getdata();
		student.college ="sobhan";
		s1.getdata();
		s2.getdata();
	}

}

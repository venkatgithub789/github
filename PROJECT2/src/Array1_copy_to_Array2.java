
public class Array1_copy_to_Array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		//*************program*****to copy elements of one array to another**********
		
				int arr1[] = {10,20,30,40,50};
				
				System.out.println(arr1.length); //length is --5. Here index of array  starts from zero.
				                                 // i,e arr1[0],arr1[1],arr1[2],arr1[3],arr1[4]
				System.out.println("*************************************************");
				int arr2[] = new int[arr1.length];
				System.out.println(arr2.length);  //we get length of arr2 is also 5 now.
				System.out.println("*************************************************");
				
				for(int i=0;i<arr1.length;i++)
				{
					 arr2[i] = arr1[i];
				}
				
				
				// Now display arr1[] elements
				
				for(int i=0;i<arr1.length;i++)
				{
					 System.out.println(arr1[i]);
				}
				
				System.out.println("*************************************************");
				// Now display arr2 elements
				
				
				for(int i=0;i<arr2.length;i++)
				{
					 System.out.println(arr2[i]);
				}
				
			//************************************************************************	
				
				
				

		
		
		
		
		
		
		
		
		
		
		

	}

}

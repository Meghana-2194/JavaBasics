package MeghJava;

public class ArrayConcepts {

	public static void main(String[] args) {
		int a[]= new int[3];
	
		a[0]= 21;
		a[1]= 22;
		a[2]= 23;
		
		System.out.println(a.length) ; //prints the size of array
	
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		
		// To print all the array values use for loop
		
		for (int j = 0 ; j < a.length ; j++){
			System.out.println(a[j]);
		}
	

	}

}

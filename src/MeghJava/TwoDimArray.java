package MeghJava;

public class TwoDimArray {

	public static void main(String[] args) {

		String  a[][] = new String [2][2];
		
		System.out.println(a.length); // size of row
		System.out.println(a[0].length);// size of colum
		
		a[0][0] = "A";
		a[0][1] = "B";
		
		a[1][0] = "C";
		a[1][1] = "D";
		
		// to print all the row and colum use for loop
		for (int row = 0 ; row <a.length ; row ++){ // row
			for (int colum = 0 ; colum <a[0].length ; colum++) // column
				System.out.println(a[row][colum]);// print 
				
		}		
	}
	
}

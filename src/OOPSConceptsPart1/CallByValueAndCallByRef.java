package OOPSConceptsPart1;

public class CallByValueAndCallByRef {

	public static void main(String[] args) {
		CallByValueAndCallByRef obj = new CallByValueAndCallByRef();
		int x = 10 ;
		int y = 20 ;
		obj.testSum(x, y);
		System.out.println(obj.testSum(x, y));

	}
	// call by value or pass by value 
	public int testSum(int a , int b){
		a= 30;
		b= 40;
		int c = a+ b ;
		return c ;
	}

}

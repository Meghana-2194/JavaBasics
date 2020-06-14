package OOPSConceptsPart1;

public class FunctionsInJava {

	public static void main(String[] args) {

		// create an object to call the methods
		FunctionsInJava obj = new FunctionsInJava();

		// call the methods
		// Note : In order to call non-static methods , first need to create an
		// object
		obj.test();
		int l = obj.pqr();
		System.out.println(l);

		int d = obj.division(20, 10);
		System.out.println(d);

	}

	public void test() // no input and no output
	{
		System.out.println("Test method");
		return;
	}

	public int pqr() // no input and some output
	{
		System.out.println("pqr");
		int a = 10;
		int b = 20;
		int c = a + b;
		return c;
	}

	public int division(int x, int y) // some input and some output
	{
		System.out.println("division");
		int d = x / y;
		return d;

	}

}

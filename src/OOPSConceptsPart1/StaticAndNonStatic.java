package OOPSConceptsPart1;

public class StaticAndNonStatic {
	
	String name = "tom" ; // non -static variable
	static int age = 25 ; // static variable

	public static void main(String[] args) {
		// call static method and variable 1. direct calling , 2 by class name
		 //direct calling 
		sum(); // static method
		System.out.println(age) ; // static variable
		
		System.out.println("________________-");
		
		// by class name
		StaticAndNonStatic.sum();
	    System.out.println(StaticAndNonStatic.age) ;
	    
	    System.out.println("________________-");
	    // Non-static 
	    StaticAndNonStatic obj = new StaticAndNonStatic();
	    obj.test();
	    System.out.println(obj.name);
		
	}
	 public static void sum(){ // static method 
		 System.out.println("Static");
		
	 }
	 
	 public void test() {
		 System.out.println("Non-Static"); // non static method
		
	 }

}

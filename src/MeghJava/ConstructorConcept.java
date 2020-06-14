package MeghJava;

public class ConstructorConcept {

	String name;
	int age;
	int number;

	// no abstract , static, final , synchronized
	// not inherited
	// should be same as class name
	// can be overloaded
	public ConstructorConcept(String mName, int age) {
		name=mName;
		this.age = age;
	}

	// can be overloaded
	public ConstructorConcept(String name, int age, int number) {
		this.name = name;
		this.age = age;
		this.number = number;

	}

	public static void main(String[] args) {

		ConstructorConcept obj = new ConstructorConcept("tom", 45);
		ConstructorConcept obj1 = new ConstructorConcept("tom", 45, 90);
		System.out.println(obj.name + " " + obj.age);
		System.out.println(obj1.name + " " + obj1.age + " " + obj1.number);
	}

}

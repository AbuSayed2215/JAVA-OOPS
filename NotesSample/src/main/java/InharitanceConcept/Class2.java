package InharitanceConcept;

public class Class2 extends Class1 {
	
	public static void car() {
		String brand = "Toyota";
		System.out.println("Dad has a car");
	}
	public static void main(String[] args) {
		Class2 a = new Class2();
		a.house();
		a.furniture();
		System.out.println(a.price());
		a.car();
	}
}

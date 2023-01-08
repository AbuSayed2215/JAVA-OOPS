package InharitanceConcept;

public class Class1 {
	
	public static void house() {
		System.out.println("My Grandfa has a house");
	}
	public void furniture() {
		System.out.println("He has a nice couch");
	}
	
	public int price () {
		return 2000;
		
		
	}
	public static void main(String[] args) {
		Class1 z = new Class1();
		System.out.println(z.price());
	}

}

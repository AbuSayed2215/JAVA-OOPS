package InharitanceConcept;

public class Class3 extends Class2 {
	public void job() {
		String Work = "Mobil";
		System.out.println("I work at mobil");
	}
	public static void main(String[] args) {
		

	Class3 x = new Class3 ();
	x.house();
	x.furniture();
	System.out.println(x.price());
	x.car();
	x.job();
	}	
}

package hotwire;

public class Test {
	
 static String condition;	//Static variable
 int mileage;	//Instance variable
	public static void main(String[] args) {
		
		Test obj = new Test();
		Test.Truck();
		obj.car();
		Vehicle.car();
		Vehicle.boats();
		
		System.out.println("The boat price is :"+obj.boatPrice());
		Vehicle abc = new Vehicle();
		System.out.println(abc.bicycle());
	}
	
	void car() {
		int year = 2016;
		
		String model = "sentra";
		
		String make = "Nissan";
		
		mileage = 49000;
		
		String condition = "Fair";
		
		System.out.println(year);
		System.out.println(model);
		System.out.println(make);
		System.out.println(mileage);
		System.out.println(condition);
	}
	
	
	
	static void Truck() {
		
		int year = 2003;
		
		String model = "Ram";
		
		String make = "Douge";
		condition = "Good";
		
		System.out.println("What is the make year of the car:"+year);
		System.out.println("What is the model of the car:"+model);
		System.out.println("What is the maker of the car:"+make);
		System.out.println("The Truck condition is :"+condition);
	}
	
	int boatPrice() {
		return 1300;
	}
	
	}



package hotwire;

public class Vehicle {
	

public static void main(String[] args) {
	
	Vehicle.car();
	
	Vehicle obj = new Vehicle();
	
	
	System.out.println(obj.motorcycle());
	System.out.println(obj.truck());
	System.out.println(obj.islowPrice());
	
	Vehicle.boats();
	System.out.println(obj.buses());
	Vehicle.buses();
	
	obj.airplane(0);
	
	Test.Truck();
}
	
	static void car () {

		int price = 26000;

		String color = "Red";

		int mileage = 16000;

		String male = "Nissan";

		Boolean lowPrice = false;

System.out.println("The color of the CAR is :"+color);
System.out.println("The price of the CAR is :"+price);
}

	//Non-void or a return type method--
	
	 int motorcycle() {	//System.out.println(obj.motorcycle());
		 return 20;
	 }

	 String truck() {	//System.out.println(obj.truck());
		 return "Foard";
	 }
	 

		boolean islowPrice () {		//System.out.println(obj.islowPrice());
			return false;
		}

		//Static or global method

			static void boats() {	//Vehicle.boats();
				
			
			int price = 10500;
			
			String color = "Red";
			
			int mileage = 1725;
			
			String make = "Concord";
			
			boolean lowPrice = false;
			
			System.out.println("The color of the BOAT is :"+color);
		}
			//we can have static return type methods as well

			static String buses () {	//System.out.println(obj.buses());
				return "public";
			}
			void motorcycle(int price) {
			 price = 5000; 
	}

			void airplane(int spreed) {
			spreed = 8000;
				
			}
			private void trains() {
				String passenger = "Rovert";
			}
		
			static String bicycle() {
				return "phonix";
			}
	
}

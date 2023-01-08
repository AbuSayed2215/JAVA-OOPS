package hotwire;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Practice {
	
		public static void houseHold() {
			String []Name = new String[6];
			Name[0]="bed";
			Name[1]="couch";
			Name[2]="Telivision";
			Name[3]="freedze";
			Name[5]="aircondition";	
			String a =Arrays.toString(Name);
			System.out.println(a);
			
		}
		public static void main(String[] args) {
			Practice.houseHold();
		}
}
		class Array1{
			static void cars () {
				int []mileage = new int [4];
				mileage[0]=966001112;
				mileage[1]=123000;
				mileage [2]= 187000;
				mileage [3]=45000;
				
				//for (int a:mileage) {
					System.out.println(Arrays.toString(mileage));
				}
			//}
			public static void main(String[] args) {
				Array1.cars();
			}
		}
		
		

		 class ArrayIfElse {
			
			public static void onlineOrder(){
				List<String>items = new ArrayList<String>(); 
				items.add("beef");
				items.add("rice");
				items.add("orange");
				items.add("milk");
				items.add("eggs");
				items.add("water");
				for (int i = 0; i<items.size(); i++) {
					System.out.println(items.get(i));
				}
				if (items.contains("rice")) {
					System.out.println("have the item");
				}else {
					System.out.println("don't have the item ");
				}
				
			}
			public static void main(String[] args) {
				ArrayIfElse.onlineOrder();
			}
		}
			
		

	
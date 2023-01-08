package InterviewPractice;

public class Swap {
	public void getSwap(int a, int b) {
		
		System.out.println("Before swap a value="+a);
		
		System.out.println("Before swap b value="+b);
		
		a=a+b;
		
		System.out.println("After swap a value="+a);
		
		System.out.println("After swap a value="+b);
	}
	
	public static void main(String[] args) {
		new Swap().getSwap(100, 200);
	}
	
}

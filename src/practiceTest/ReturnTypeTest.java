package practiceTest;

public class ReturnTypeTest {

	public static void main(String[] args) {
	
		int a = sum();
		int b = a+5;
		System.out.println(sum());  //or
		System.out.println(a);
		System.out.println(b);
		
	}

		public static int sum() {
		int x = 10+20;
		return x;
	}
		}

package tests;

public class ArgumentsTest {

	public static void main(String[] args) {
			
		//we can perform any formulas
		
		
		sum(); //4+5
		//what if we want get 6+8 or many other..do we create methods everytime?
		sum(6,8);
		sum(10,10);
		sum(100,200,300);
		mul(4,5);
	}

	public static void sum() {
		int a = 4+5;
		System.out.println(a);
	}
										//bottom formula will sum all 2 digit arguments such as 6+8, 10+10..
	public static void sum (int b, int c) {
		int a = b+c;
		System.out.println(a);
	}
	
	public static void mul (int x, int y) {
		int a = x*y;
		System.out.println(a);}
										//bottom formula will sum all 3 digit arguments such as 6+7+8, 10+10+10..
	public static void sum(int p, int q, int r) {
		int a = p+q+r;
		System.out.println(a);
	}
	
}

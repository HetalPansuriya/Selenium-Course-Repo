package tests;

public class ForLoopTest {

	public static void main(String[] args) {

		/*
		 * System.out.println(1); System.out.println(2); System.out.println(3);
		 * System.out.println(4); System.out.println(5); System.out.println(6);
		 * System.out.println(7); System.out.println(8); System.out.println(9);
		 * System.out.println(10);
		 */

		for (int i = 1; i <= 100; i++) {
			System.out.println(i);
			if (i == 10) {
				System.out.println("We got 10");
				break; // if we'll put break then java won't execute next functions or formulas. it
						// will stop and that will be its last step.
			}
		}

		System.out.println("After For loop");

	}

	{

		for (int i = 1; i < 100; i = i + 2) // will increase 2 in numbers,1,3,5..
		{
			System.out.println(i);
		}

		for (double i = 2.3; i < 10; i++) {
			System.out.println(i);
		}
	}
}

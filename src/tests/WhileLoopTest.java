package tests;

public class WhileLoopTest {

	public static void main(String[] args) {

		int i = 1;
							//while loop executes infinite numbers or data..to stop it just press bottom red terminate button
		while(i<=100) {
			System.out.println(i);	//if we forget to enter increament just press bottom red button and terminate code
				if(i==10) {
			System.out.println("we got 10");
			break;
		}
			i++;
		}

	}

}

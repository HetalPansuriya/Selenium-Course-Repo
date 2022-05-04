package practiceTest;

public class Calc {

	int num1;
	int num2;																//object has this values
	int result;
	
	public void perform()
	{
		result = num1 + num2;
	}
	
	public static void main(String[] args) {
		
		Calc obj = new Calc();	//create object for calculator 	//object knows something and does something
		obj.num1 = 3;
		obj.num2 = 5;
		
		obj.perform();				//call above method
		System.out.println(obj.result);
	}

}

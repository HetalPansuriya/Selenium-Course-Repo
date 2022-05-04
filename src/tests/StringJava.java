package tests;

public class StringJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String tool = "Selenium";
System.out.println(tool);

String type = "webdriver";
System.out.println(type);

String s = " ";

System.out.println(tool+type);
System.out.println(tool+" "+type);
System.out.println(tool+s+type);

int a = 20;
int b = 30;

System.out.println(tool+type+a+b);	//a+b will join characters
System.out.println(tool+type+(a+b));	//(a+b)will do addition
System.out.println(a+b+tool+type);		//a+b in start will perform as an integer


	}

}

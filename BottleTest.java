import java.util.Scanner;
public class BottleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bottle mNm = new Bottle("M&M");
		Bottle cookie = new Bottle("cookie");
		Bottle nickels = new Bottle("nickels");
		System.out.println("Please enter a number for mNm");
		System.out.println("The value entered for mNm is:" + mNm.read());
		System.out.println("mNm has " + mNm.getCount() + " bottles.");
		mNm.set(7);
		System.out.println("mNm has " + mNm.getCount() + " bottles.");
		cookie.add(3);
		System.out.println("Cookies number is now : " + cookie.getCount());
		
		System.out.println("Enter an integer to add to the value cookie has.");   
		System.out.println("The sum will be put in mNm.");  
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();   
		mNm.add(x); 
		System.out.println("mNm now has cookie Plus mNm, which is: " + mNm.getCount());
	}

}

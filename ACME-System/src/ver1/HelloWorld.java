package ver1;
import java.util.Scanner;
public class HelloWorld {

	public static void main(String[] args) {
		System.out.println("Hello from Eclipse");

		System.out.println("Gibby is working locally on his branch");
		

	}
	public static void heyNow() {
		String Msg = "Hey Now!";
		System.out.println(Msg);
	}
	
	public static void whatFor() {
		Scanner scn = new Scanner (System.in);
		System.out.println("Type message.");
		
		String message = scn.nextLine();
		System.out.println (message +", what for?");
			
	
	}


}


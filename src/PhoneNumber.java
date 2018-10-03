/**
 * 
 * @author Tanya Kalianda
 * Phone Number
 */
import java.util.Scanner;
public class PhoneNumber
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter name: ");
		String name = in.next();
		in.nextLine();
		
		System.out.print("Enter phone number: ");
		String number = in.next();
		in.nextLine();
		
		String num1 = number.substring(0,3);
		String num2 = number.substring(3,6);
		String num3 = number.substring(6);
			
		System.out.printf("%-20s", name);
		System.out.print("(" + num1 + ")" + num2 + "-" + num3);	
	}
}

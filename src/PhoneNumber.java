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
			//Scanner = data type (class)
			//in = variable name
			// creating new scanner object and storing it in the variable in
			//nextDouble reads the next double
			//parameter for scanner class is System.in (allows computer to read from keyboard in the console)
		
		System.out.print("Enter name: ");
		String name = in.nextLine();
			//stores the reference to the string Tanya in the variable name
		
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

/**
 * 
 */
package Proc;

import java.util.Scanner;

/**
 * @author admin
 *
 */
public class PracJenkins {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		/*Scanner sc = new Scanner(System.in);
		String s = sc.next();*/
		String s= "Second";
		System.out.println(" You entered "+s);
		
		switch(s)
		{
			case "First":
				System.out.println("This is the first step");
				break;
			case "Second":
				System.out.println("This is the second step");
				break;
			case "Third":
				System.out.println("This is the Third step");
				break;
			default:
				System.out.println("No matching choice");
		        break;
		}
		
		
		

	}

}

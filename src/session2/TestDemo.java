/*Write a program TestDemo.java, which accepts the number as argument and print 
 "You Have entered Zero" if the value is equal to 0.

It should print "You have Entered Positive Value" if the value is greater than 0.

It should print "You have Entered Negative Value" if the value is less than 0.*/
package session2;

import java.util.Scanner;

public class TestDemo {

	public static void main(String args[]) {
		// Take input from user
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int i = sc.nextInt();
		sc.close();
		// check the condition
		if (i < 0) {
			System.out.println("You have Entered Negative Value");
		} else if (i > 0) {
			System.out.println("You have Entered Positive Value");
		} else {
			System.out.println("You Have entered Zero");
		}
	}
}

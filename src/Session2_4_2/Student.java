/*A student has A grade if marks are more than 70 (marks > 60 if age is less than 15), B 
grade, if marks are between 61 and 70 ( marks between 45 and 60 for age < 15) and C 
grade, if marks are less than 61 (marks less than 45 for age < 15).  Write a program to
print the grade for given marks and age.
*/

package Session2_4_2;

import java.util.Scanner;

public class Student {

	public static void main(String[] args) {

		// Asking user to input the marks and age

		System.out.println("Enter the marks of the student");
		Scanner sc = new Scanner(System.in);
		int marks = sc.nextInt();

		System.out.println("Enter the age of the student");
		int age = sc.nextInt();
		sc.close();

		System.out.println("Grade obtained: ");
		// Check the values of marks and age
		if (marks > 70) {
			System.out.println("A Grade");
		} else if (marks > 60 && age < 15) {
			System.out.println("A Grade");
		}

		if (marks > 61 && marks < 70) {
			System.out.println("B Grade");
		} else if ((marks >= 45 && marks <= 60) && (age < 15)) {

			System.out.println("B Grade");
		}

		if (marks < 61) {
			System.out.println("C Grade");
		} else if (marks < 45 && age < 15) {
			System.out.println("C Grade");
		}
	}
}
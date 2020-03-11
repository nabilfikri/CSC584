//Filename: ScannerTest.java
import java.io.*;
import java.util.Scanner;

public class ScannerTest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter name: ");
		String name = scan.nextLine();

		System.out.print("Enter full name: ");
		String fullName = scan.nextLine();

		System.out.print("Enter integer number: " );
		int num = Integer.parseInt(scan.nextLine());

		System.out.print("Enter floating point number: ");
		double numA = Double.parseDouble(scan.nextLine());

		System.out.println("\n\n\nSample output: ");
		System.out.println("Name: " + name);
		System.out.println("Fullname: " + fullName);
		System.out.println("Integer number:" + num);
		System.out.println("Floating point number: " + numA);
	}
}
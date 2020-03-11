//Filename: StrTokenApp.java

import java.util.*;

public class StrTokenApp
{
	public static void main(String args[])
	{
		Scanner scanner = new Scanner (System.in);

		System.out.print("Enter data:");
		String inputLine = scanner.nextLine();
		StringTokenizer tokenizer = new StringTokenizer(inputLine);

		String name = tokenizer.nextToken();
		int num =  Integer.parseInt(tokenizer.nextToken());
		double decNum = Double.parseDouble(tokenizer.nextToken());

		System.out.println("Name: " +name);
		System.out.println("Integer number: " + num);
		System.out.println("Floating number: " +  decNum);
	}
}

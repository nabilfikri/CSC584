//Filename: ArrayTest.java

package basic;

import java.util.*;

public class ArrayTest
{
	public static void main (String[] args)
	{
		Scanner scanner = new Scanner (System.in);

		int[] item = new int[5];  //declare an array item of five components
		int sum = 0;
		int counter;

		System.out.println("Enter five integers, one integer per line");

		for(counter = 0; counter < 5; counter++){
			item[counter] = scanner.nextInt();
			sum = sum + item[counter];
		}
		System.out.println("The sum of the numbers = "+sum);
	}
}
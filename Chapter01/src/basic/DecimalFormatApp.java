//Filename: DecimalFormatApp.java

package basic;

import java.text.*;

public class DecimalFormatApp {

    public static void main(String[] args) {

		DecimalFormat df = new DecimalFormat("0.0000");
		double number = 22.0 / 7.0;

		System.out.println(number);
		System.out.println(df.format(number));
    }
}
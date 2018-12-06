package asmt1;

import java.util.Scanner;

public class a1q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		double temp = in.nextDouble();
		Tempurature t1 = new Tempurature(temp);
		System.out.println("The F is: " + t1.getFahrenheit());
		System.out.println("The Celcius is: " + t1.getCelcius());
		System.out.println("The Kelvin is: "+ t1.getKelvin());
	}

}

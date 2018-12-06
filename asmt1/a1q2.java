package a1q2;

import java.util.*;

public class a1q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		long start = System.currentTimeMillis();
		primes(10);
		long end = System.currentTimeMillis();
		long elapsed = end - start;
		
		System.out.println("(" +elapsed +" milliseconds)");

	}
	
	public static void primes(int n) {
		ArrayList<Integer> list = new ArrayList<Integer>(); //ArrayList of all primes.
		
		for (int i = 2; i <= n; i++) { //If the number is prime, append it to list.
			if (isPrime(i)) {
				list.add(i);
			}
		}
		
		System.out.println("1");
		for (int i = 0; i < list.size(); i++) { //Print out the list of primes.
			System.out.println(list.get(i));
		}
	}
	
	public static boolean isPrime(int number) //Prime checker
	{
		for (int i = 2; i < number; i++) { //Don't check for 1 since anything divisible by will give modulo == 0
			if (number % i == 0) {
				return false;
			}
		}
		
		return true;
		
	}

}

package gitExample;

import java.util.Scanner;

public class test {
	static int value = 10;
	static boolean a, b, c;

	public static void main(String args[]) {
		
		System.out.println("enter");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		double result;
		for(double i = 1; i <= n; i++) {
			for(double j = 1; j <= n; j++) {
				
				result = (i/n) + (j/n);
				System.out.print(result + " ");
				
			}
			System.out.println();
		}
	
	}

	static int p1(int input) {
		value = input * value;
		System.out.println("In p1: " + value);
		return value;
	}

	static int p2(int input) {
		int value = 5;
		value = input / value;
		System.out.println("In p2: " + value);
		return value;
	}

}

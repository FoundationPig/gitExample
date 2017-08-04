package gitExample;

public class exerTester {

	public static String Excer1() {
		int i = 1;
		String x = "";
		for (int j = 0; j < 5; j = j + 2) {
			i = (i * i) + j;
		}
		switch (i) {
		case 3:
			// System.out.println("zero");
			break;
		case 13:
			// System.out.println("one");
			x += "one";
		case 175:
			// System.out.println("two");
			x += "two";
		default:
			// System.out.println("default");
			x += "default";
		}

		return x;
	}

	public static int Excer2() {
		int n;
		int F_0 = 1, F_1 = 1;
		int F_n = 0;
		n = 5;
		for (int i = 1; i < n; i++) {
			F_n = F_0 + F_1;
			F_0 = F_1;
			F_1 = F_n;
		}

		return F_n;
	}

	public static int Excer3() {
		int inner = 2, outer = 2;
		int result = 0;
		for (int i = 0; i < outer; i++) {
			for (int j = 0; j < inner; j++) {
				result = (result * result) + 1;
			}
		}

		return result;
	}

	public static int Excer4() {
		int x = 3;
		int y = 10;
		int ctr = 0;
		while (x < y) {
			x = x + 1;
			y = y - 1;
			ctr++;
		}
		
		return ctr;
	}
	
	public static long[] Excer6(int n) {
		long[] x = new long[n*n];
		long result;
		int ctr = 0;
		for(long i =1; i <= n; i++) {
			for(long j = 0; j <=n; j++) {
				result = i/n + j/n;
				x[ctr] = result;
			}
			
			System.out.println();
		}
		
		return x;
	}

}

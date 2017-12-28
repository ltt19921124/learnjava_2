package bi1112;

import java.util.HashMap;
import java.util.Hashtable;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// while (true) {
		// for (int i = 0;i < 10;i++) {
		// System.out.println(i);
		// }
		// }
		Hashtable ht = new Hashtable();
		HashMap hs = new HashMap();
		int[] arr = { 8, 6, 2, 9, 10 };
		for (int x = 0; x < arr.length - 1; x++) {
			for (int y = x + 1; y < arr.length; y++) {
				if (arr[x] > arr[y]) {
					int temp = arr[x];
					arr[x] = arr[y];
					arr[y] = temp;
				}
			}
		}
		for (int x = 0; x < arr.length; x++) {
			System.out.println(arr[x] + "¡¢");
		}
		int c;
		int i = 3;
		c = ++i;
		System.out.println("c=" + c);
		System.out.println(isPrime(4));
		System.out.println(Math.sqrt(8));
//		int a = (int) Math.sqrt(8);
		System.out.println(3 < Math.sqrt(8));
	}

	public static boolean isPrime(int num) {
		if (num < 2)
			return false;
		else {
			for (int i = 2; i <= Math.sqrt(num); i++) {
				if (num % i == 0) {
					return false;
				}
			}
		}
		return true;
	}

}

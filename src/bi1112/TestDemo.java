package bi1112;

import com.sun.javafx.collections.SourceAdapterChange;

class Solution {
	public int[] twoSum(int[] nums,int target) {
		for (int i = 0;i < nums.length;++i) {
			for (int j = 0;j < nums.length;++j) {
				if (nums[i] + nums[j] == target) {
					return new int[] {i,j};
				}
			}
		}
		return null;
	}
}


public class TestDemo {

	public static void main(String[] args) {
//		int a=6,b=1;
//		int c = a ^ b;
//		System.out.println(c);
//		System.out.println(add(5,6));
//		System.out.println((6 ^ 6));
//		System.out.println(0b1100);
		int[] arr = {2,7,5,20};
		int target = 9;
		Solution sou = new Solution();
		sou.twoSum(arr, target);
		
	}
	
	static int add(int a,int b) {
		if (b == 0) {
			return a;
		}
		int sum = a ^ b;
		int carry = (a & b) << 1;
		return add(sum,carry);
		
		
	}
	public static void selectSotr(int[] arr) {
		for (int  x = 0; x < arr.length;x++) {
			for (int i = x + 1;i < arr.length;i++) {
				if (arr[x] > arr[i]) {
					int temp = arr[x];
					arr[x] = arr[i];
					arr[i] = temp;
				}
			}
		}
		for (int x = 0;x < arr.length;x++) {
			System.out.print(arr[x] + "¡¢");
		}
	}
}








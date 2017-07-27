package Array;

public class ArrayDemo {

	public static void main(String[] args) {
		int [] arr = new int[4];
//		arr[0] = 10;
		
//		for (int i = 0; i < arr.length; i++) {
//			System.out.println(arr[i]);
//		}
//		int [] temp = null;
//		temp = arr;
//		temp[0] = 99;
//		System.out.println(temp[0]);
		
//		System.out.println(new int[]{1,56,67,77}.length);
		
		int data[][] = new int[][] {{1,2,3},{1,4},{6,7,8}};
		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data[i].length; j++) {
				System.out.print("data[" + i + "][" + j + "]=" + data[i][j] + "¡¢");
			}
			System.out.println();
		}
	}

}

package Array;

public class ArrayDemo2 {

	public static void main(String[] args) {
		
		int[] data = init();
//		int[] temp = data;
		array(data);
		printArray(data);
		

	}
	public static void array(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			arr[i] *= 2;
		}
	}
	//
	public static int[] init() {
		return new int[] {1,2,2,3,3};
	}
	//
	public static void printArray(int[] temp) {
		System.out.print("[");
		for (int i = 0; i < temp.length; i++) {
			if (i != temp.length - 1)
				System.out.print(temp[i] + "¡¢");
			else		
				System.out.print(temp[i] + "]");
		}
	}
	
	
	
	
}

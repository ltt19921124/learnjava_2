package Array;

public class ArrayDemo3 {

	public static void main(String[] args) {
		
		int[] arr = new int[] {1,3,4,17,90,2,45,89,67};
		char[] arr1 = new char[] {'³å','Ñù','ºÃ'};
		java.util.Arrays.sort(arr);
		java.util.Arrays.sort(arr1);
		
		
		printArray(arr);
//		sortArray_2(arr);
		printArray(arr1);
		
	}

	public static void sortArray(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			for(int y = i + 1;y < arr.length;y++) {
				if (arr[i] > arr[y]){
					int temp = arr[i];
					arr[i] = arr[y];
					arr[y] = temp;
				}
			}
		}
	}
	public static void sortArray_2(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			for(int y = 0;y < arr.length - 1 - i;y++) {
				if (arr[y] > arr[y + 1]){
					int temp = arr[y];
					arr[y] = arr[y + 1];
					arr[y + 1] = temp;
				}
			}
		}
	}
	
	public static void printArray(int[] temp) {
		System.out.print("[");
		for (int i = 0; i < temp.length; i++) {
			if (i != temp.length - 1)
				System.out.print(temp[i] + "¡¢");
			else		
				System.out.print(temp[i] + "]");
		}
		System.out.println();
	}
	
	public static void printArray(char[] temp) {
		System.out.print("[");
		for (int i = 0; i < temp.length; i++) {
			if (i != temp.length - 1)
				System.out.print(temp[i] + "¡¢");
			else		
				System.out.print(temp[i] + "]");
		}
		System.out.println();
	}

}

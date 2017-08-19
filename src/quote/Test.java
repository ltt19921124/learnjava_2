package quote;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1,26,23,89,45};
		printArray(arr);
//		insertSort(arr);
		insertSort_1(arr);
		printArray(arr);
//		double b = Math.ceil(9.2);
//		System.out.println((int)b);
		String str = getNumber();
		System.out.println(str);
		print();
	}
	//希尔排序
	public static void insertSort_1(int[] arr) {
		double d1 = arr.length;
		int temp = 0;
		while (true) {
			d1 = Math.ceil(d1/ 2);
			int d = (int)d1;
			for (int x = 0; x < d; x++) {
				for (int i = x + d; i < arr.length; i++) {
					int j = i - d;
					temp = arr[i];
					for (;j >= 0 && temp < arr[j];j -= d) {
						arr[j + d] = arr[j];
					}
					arr[j + d] = temp;
				}
			}
			if (d == 1)
				break;
		}
		
	}

	public static void insertSort(int[] arr) {
		
		int temp = 0;
		for (int i = 1; i < arr.length; i++) {
			int j = i - 1;
			temp = arr[i];
			for (; j >= 0 && temp < arr[j]; j--) {
				arr[j + 1] = arr[j];
				
			}
			arr[j + 1] = temp;
		}
//		printArray(arr);
		
	}
	//
	public static void printArray(int[] arr) {
		System.out.print("[");
		for (int i = 0; i < arr.length; i++) {
			if (i != arr.length - 1) {
				System.out.print(arr[i] + "、");
			} else {
				System.out.print(arr[i] + "]");
			}
		}
		System.out.println();
	}
	//获取号码
	public static String getNumber() {
		int [] arr = {8,2,1,0,3};
		int [] index = {2,0,3,2,4,0,1,3,2,3,3};
		
		String tel = "";
		for (int i : index) {
			tel += arr[i];
		}
//		System.out.println("联系方式:" + tel);
		return tel;
	}
	public static void print() {
		int[] a = {1,7,56,6};
		for (int i : a) {
			System.out.print(i + "、");
		}
	}

}






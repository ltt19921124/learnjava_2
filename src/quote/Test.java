package quote;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1,19,27,2,4,189,345,90,26,23,89,45};
		printArray(arr);
//		insertSort(arr);
//		insertSort_1(arr);
//		slectSort(arr);
		quickSort(arr);
		printArray(arr);
//		double b = Math.ceil(9.2);
//		System.out.println((int)b);
//		String str = getNumber();
//		System.out.println(str);
//		print();
	}
	//归并排序
	public static void mergeSort() {
		
		
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
	//简单选择排序
	public  static void slectSort(int[] arr) {
		int position = 0;
		
		for (int i = 0; i < arr.length; i++) {
			int j = i + 1;
			position = i;
			int temp = arr[i];
			for(;j < arr.length;j++) {
				if (arr[j] < temp) {
					temp = arr[j];
					position = j;
				}
			}
			arr[position] = arr[i];
			arr[i] = temp;
		}
//		for (int i = 0; i < arr.length; i++) {
//			System.out.println(arr[i]);
//		}
		
	}
	//直接插入排序
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
	//打印数组
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
	//快速排序
	public static void quickSort(int[] arr) {
		
		if (arr.length > 0) {
			_quickSort(arr,0,arr.length - 1);
		}
		
	}
	private static void _quickSort(int[] list, int low, int high) {
		if (low < high) {
			int middle = getMiddle(list,low,high);
			_quickSort(list, low, middle - 1);
			_quickSort(list, middle + 1, high);
			
		}
	}
	public static int getMiddle(int[] list,int low,int high) {
		int tmp = list[low];
		while (low < high) {
			while (low < high && list[high] >= tmp) {
				high--;
			}
			list[low] = list[high];
			while (low < high && list[low] <= tmp) {
				low++;
			}
			list[high] = list[low];
		}
		list[low] = tmp;
		return low;
	}

}






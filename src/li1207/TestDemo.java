package li1207;

class Person {
	int age;
	String name;
	
}

public class TestDemo {

	public static void main(String[] args) {
		
		Person p1 = new Person();
		Person p2 = new Person();
		int x = 0,y = 0;
		System.out.println(x == y);
		
		int [] data = {1,2,3};
		int [] data1 = new int[3];
		data1[0] = 10;
		data1[1] = 20;
		data1[2] = 30;
//		System.out.println(data1[2]);
		
//		for (int i = 0; i < data1.length; i++) {
//			System.out.print(data[i] + "¡¢");
//		}
		
//		int[] data2 = null;
//		data2 = new int[3];
//		
//		int[] data3 = {4,6};
//		int[] data4 = new int[] {2,3};
		//Êý×é
		System.out.println(new int[] {1,3,5}.length);
		int[][] arr= {{1,2},{2,4,5}};
		System.out.println(arr[0][1]);
		int n = 101;
		int sum = (1 + 101) * n /2;
		System.out.println(sum);
	}

}

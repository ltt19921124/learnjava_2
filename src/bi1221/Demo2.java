package bi1221;

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String week = getWeek(3);
//		System.out.println(week);
		
		int[][] arr = new int[3][2];
		System.out.println(arr.length);//打印二维数组的长度。其实就是一维数组的个数。
		System.out.println(arr[1].length);//打印二维数组中角标为1一维数组的长度。
	}
	
	public static String getWeek(int num)
	{

		if(num>7 || num<1)
		{
			return "错误的星期";
		}
		String[] weeks = {"","星期一","星期二","星期三","星期四","星期五","星期六","星期日"};

		return weeks[num];
	}

}

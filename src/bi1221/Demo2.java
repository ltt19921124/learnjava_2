package bi1221;

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String week = getWeek(3);
//		System.out.println(week);
		
		int[][] arr = new int[3][2];
		System.out.println(arr.length);//��ӡ��ά����ĳ��ȡ���ʵ����һά����ĸ�����
		System.out.println(arr[1].length);//��ӡ��ά�����нǱ�Ϊ1һά����ĳ��ȡ�
	}
	
	public static String getWeek(int num)
	{

		if(num>7 || num<1)
		{
			return "���������";
		}
		String[] weeks = {"","����һ","���ڶ�","������","������","������","������","������"};

		return weeks[num];
	}

}

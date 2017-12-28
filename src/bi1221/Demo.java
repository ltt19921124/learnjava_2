package bi1221;

public class Demo {
	public static void main(String []args) {
		
		int n = 8;
		n = 9;
		n = 19;

//		System.out.println(n);
		int[] arr = new int[3];
		arr[0] = 90;
		System.out.println(arr[0]);
		
		xiaoqiang:for (int x=0; x<3 ;x++ )
		{
			wangcai:for (int y=0; y<4 ; y++)
			{
				System.out.println("x="+x);
				continue xiaoqiang;
			}
			
		}
		
		toHex_2(28);
	}
	
	public static void toHex_2(int num)
	{

		if(num==0)
		{
			System.out.println("0");
			return ;
		}
		//定义一个对应关系表。
		char[] chs = {'0','1','2','3',
						'4','5','6','7',
						'8','9','A','B',
						'C','D','E','F'};
		/*
		一会查表会查到比较的数据。
		数据一多，就先存储起来，在进行操作。
		所以定义一个数组。 临时容器。
		*/
		char[] arr = new char[8];
		int pos = arr.length;
			
		while(num!=0)
		{
			int temp = num&15;
			arr[--pos] = chs[temp];
			num  = num >>> 4;
		}

		System.out.println("pos="+pos);
		for(int x=pos ;x<arr.length; x++)
		{
			System.out.print(arr[x]);
		}


	}

}

package bi1222;


/*
���Ӹ����У���Ա���ص����֡�
1����Ա������
2����Ա������
3�����캯����



*/

//1����Ա������

/*
������ĳ�Ա�;ֲ�����ͬ����this���֡�
���Ӹ����еĳ�Ա����ͬ����super���ָ��ࡣ

this��super���÷������ơ�

this:����һ�������������á�
super������һ������ռ䡣



*/
class Fu1
{
	private int num = 4;

	public int getNum()
	{
		return num;
	}
}


class Zi1 extends Fu1
{
	private int num = 5;


	void show()
	{
		System.out.println(this.num+"....."+super.getNum());
	}
}


class ExtendsDemo2 
{
	public static void main(String[] args) 
	{
		Zi1 z = new Zi1();
		z.show();
	}
}

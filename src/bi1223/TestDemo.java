package bi1223;

interface Demo1 {
	public static final int NUM = 4;

	public abstract void show1();
	public abstract void show2();
}
class DemoImpl implements /*ʵ��*/Demo1
{
	public void show1()
	{}

	public void show2()
	{
	
	}
}

interface A
{
	public void show();
}

interface Z
{
	public int add(int a,int b);
}

class Test1 implements A,Z//��ʵ��
{
	
	public int add(int a,int b)
	{
		return a+b+3;	
	}
	/**/
	public void show(){}
	
}

class Q
{
	public void method()
	{}
}

abstract class Test2 extends Q implements A,Z
{

}

interface CC
{
	void show();
}
interface MM
{
	void method();
}

interface QQ extends  CC,MM//�ӿ���ӿ�֮���Ǽ̳й�ϵ�����ҽӿڿ��Զ�̳С� 
{
	void function();
}

class WW implements QQ
{
//����3��������
	public void show(){}
	public void method(){}
	public void function(){}
}

public class TestDemo {

	public static void main(String[] args) {
		Test1 t = new Test1();
		t.show();
		
		DemoImpl d = new DemoImpl();	
		System.out.println(d.NUM);
		System.out.println(DemoImpl.NUM);
		System.out.println(Demo1.NUM);
	}

}





package bi1222;

class Fu2
{


}

class Zi2 extends Fu2
{
	void show()
	{
		System.out.println("this:");
	}
}
class ExtendsDemo 
{
	public static void main(String[] args) 
	{
		Zi z = new Zi();
		System.out.println("z="+z);
		z.show();
	}
}

package bi1223day10;
/**/
class Single
{
	private static  Single S = new Single();
	Single(){}

	public static Single getInstance()
	{
		S = new Single();
		return S;
	}
}

class Single2
{
	private static  Single2 s = null;
	private Single2(){}
	public static Single2 getInstance()
	{
		if(s ==null)
			s = new Single2();
		return s ;
	}
}


class Fu2
{
	private Fu2(){}
}
class Zi2 extends Fu
{

}




class FinalTest 
{
	public static void main(String[] args) 
	{
		new Zi();
	}
}

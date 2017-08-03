package Abstract;

interface INewss {
	int NUM = 100;
	public static final String NSG = "aaa";
	public abstract String get();
}

abstract class AbstractMesssage{
	public abstract void print();
}

class NewssImpl extends AbstractMesssage implements INewss {
	public String get() {
		return "www.baidu.com";
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		
	}
}


public class TestDemo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		INewss news = new NewssImpl();
		System.out.println(news.get());
		
		AbstractMesssage am = (AbstractMesssage) news;
		
		
	}

}












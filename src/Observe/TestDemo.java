package Observe;

import java.util.Observable;
import java.util.Observer;

class House extends Observable {
	
	private double price;
	public House(double price) {
		this.price = price;
	}
	public void setPrice(double price) {
		if (price > this.price) {
			super.setChanged();
			super.notifyObservers(price);
		}
		this.price = price;
	}
}

class Person implements Observer {

	@Override
	public void update(Observable o, Object arg) {
		if (o instanceof House) {
			if (arg instanceof Double) {
				System.out.println("人们关注房价，新价格:" + arg);
			}
		}
	}
	
}


public class TestDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person a = new Person();
		Person b = new Person();
		Person c = new Person();
		
		House house = new House(80000.00);
		house.addObserver(a);
		house.addObserver(b);
		house.addObserver(c);
		house.setPrice(150000.00);
	}

}







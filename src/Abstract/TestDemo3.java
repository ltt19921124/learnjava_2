package Abstract;

abstract class Action {
	public static final int EAT = 1;
	public static final int SLEEP = 5;
	public static final int WORK = 10;
	
	public void command(int cmd) {
		switch (cmd) {
		case EAT:
			this.eat();
			break;
		case SLEEP:
			this.sleep();
			break;
		case WORK:
			this.work();
			break;
		case EAT + SLEEP + WORK:
			this.eat();
			this.sleep();
			this.work();
		}
	}
	//
	public abstract void eat();
	public abstract void sleep();
	public abstract void work();
	
}

class Human extends Action {
	public void eat() {
		System.out.println("�˳Է�������ʳ");
	}
	public void sleep() {
		System.out.println("������˯��");
	}
	public void work() {
		System.out.println("��Ŭ��ƴ��");
	}
}


class Pig extends Action {
	public void eat() {
		System.out.println("���ò��ӳԣ���");
	}
	public void sleep() {
		System.out.println("��ֱ��˯Ȧ��˯");
	}
	public void work() {
		
	}
}

class Robot extends Action {
	public void eat() {
		System.out.println("�����˲�������");
	}
	public void sleep() {
		
	}
	public void work() {
		System.out.println("�����˲�ͣ����");
	}
}

public class TestDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fun(new Human());
		fun(new Pig());
		fun(new Robot());
		
	}
	public static void fun(Action action) {
		action.command(Action.EAT + Action.SLEEP + Action.WORK);
	}
}








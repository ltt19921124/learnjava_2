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
		System.out.println("人吃饭，吃熟食");
	}
	public void sleep() {
		System.out.println("人困了睡觉");
	}
	public void work() {
		System.out.println("人努力拼搏");
	}
}


class Pig extends Action {
	public void eat() {
		System.out.println("猪用槽子吃，吃");
	}
	public void sleep() {
		System.out.println("猪直接睡圈里睡");
	}
	public void work() {
		
	}
}

class Robot extends Action {
	public void eat() {
		System.out.println("机器人补充能量");
	}
	public void sleep() {
		
	}
	public void work() {
		System.out.println("机器人不停工作");
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








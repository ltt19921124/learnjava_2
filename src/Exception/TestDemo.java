package Exception;

public class TestDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
//		System.out.println(1 / 1);
		
		
		System.out.println("��ѧ���㿪ʼǰ");
		
		try {
//			int x = Integer.parseInt(args[0]);
//			int y = Integer.parseInt(args[1]);
			
			System.out.println("��ѧ����:" + (10 / 2));
			
		} catch (ArithmeticException e) {
			e.printStackTrace();
//			System.out.println("�쳣�Ѿ��������� !");
		} finally {
			System.out.println("һ��ִ�е����");
		}
		
		
		System.out.println("��ѧ���������");
		
		
	}

}

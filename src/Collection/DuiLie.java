package Collection;

import java.util.LinkedList;

public class DuiLie {
	private LinkedList link;
	
	public DuiLie() {
		link = new LinkedList();
	}
	/*
	 * ���е����Ԫ�ع���
	 */
	public void myAdd(Object obj) {
		link.addFirst(obj);
	}
	
	public Object myGet() {
		return link.removeFirst();
	}
	
	public boolean isNull() {
		return link.isEmpty();
	}
	
}

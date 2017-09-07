package Arrays;

@SuppressWarnings("rawtypes")
class BinaryTree {
	private class Node {
		private Comparable data;
		private Node left;
		private Node right;
		
		@SuppressWarnings("unused")
		public Node(Comparable data) {
			this.data = data;
		}
		public void addNode(Node newNode) {
			if (this.data.compareTo(newNode.data) > 0) {
				if (this.left == null) {
					
				}
			}
		}
	}
	//
	private Node root;
	public void add(Object data) {
		if (data == null) {
			return;
		}
		Node newNode = new Node((Comparable) data);
		if (this.root == null) {
			this.root = newNode;
		} else {
			this.root.addNode(newNode);
		}
	}
	
}


public class TestDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

package util;

public class List {

	private Node head;
	
	public void add(Double value) {
		Node node = new Node();
		node.setValue(value);
		node.setNext(head);
		head = node;
	}
	
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("[");
		
		Node p = head;
		while (p != null) {
			sb.append(p.getValue() + " ");
			p = p.getNext();
		}
		
		sb.append("]");
		return sb.toString();
	}
}

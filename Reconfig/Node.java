
import java.util.ArrayList;
import java.util.List;

public class Node<T1, T2> {

	private T1 religador = null;
	private T2 custo = null;

	private List<Node<T1, T2>> children = new ArrayList<>();

	private Node<T1, T2> parent = null;

	public Node(T1 r, T2 c) {
		this.religador = r;
		this.custo = c;
	}

	public Node<T1, T2> addChild(Node<T1, T2> child) {
		child.setParent(this);
		this.children.add(child);
		return child;
	}

	public void addChildren(List<Node<T1, T2>> children) {
		children.forEach(each -> each.setParent(this));
		this.children.addAll(children);
	}

	public List<Node<T1, T2>> getChildren() {
		return children;
	}

	public T1 getData() {
		return religador;
	}

	public void setData(T1 data) {
		this.religador = data;
	}

	private void setParent(Node<T1, T2> parent) {
		this.parent = parent;
	}

	public Node<T1, T2> getParent() {
		return parent;
	}

}
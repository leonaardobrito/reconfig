import java.util.ArrayList;
import java.util.List;

public class PowerReconfig {

    public static void main(String[] args) {
	Node<String, Integer> root = createTree();
	int beta = 0;

		printTree(root, " ");

	// test the deletion of all leaf nodes
//		root.deleteAllLeafNodes();
		printTree(root, " ");
    }

    private static Node<String, Integer> createTree() {
	Node<String, Integer> root = new Node<>("A", 5);

	Node<String, Integer> nodeB = root.addChild(new Node<String, Integer>("B", 5));
	Node<String, Integer> nodeG = nodeB.addChild(new Node<String, Integer>("G", 20));
	Node<String, Integer> nodeN = nodeG.addChild(new Node<String, Integer>("N", 13));
	Node<String, Integer> nodeL = nodeG.addChild(new Node<String, Integer>("L", 13));
	Node<String, Integer> nodeP = nodeB.addChild(new Node<String, Integer>("P", 10));

	Node<String, Integer> nodeC = root.addChild(new Node<String, Integer>("C", 10));
	Node<String, Integer> nodeO = nodeC.addChild(new Node<String, Integer>("O", 40));

	Node<String, Integer> nodeF = nodeC.addChild(new Node<String, Integer>("F", 50));
	Node<String, Integer> nodeM = nodeF.addChild(new Node<String, Integer>("M", 13));

	return root;
    }

    private static <T1, T2> void printTree(Node<T1, T2> node, String appender) {
	System.out.println(appender + node.getData());
	node.getChildren().forEach(each -> printTree(each, appender + appender));
    }

}
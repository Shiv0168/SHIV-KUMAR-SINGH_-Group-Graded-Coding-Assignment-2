package greatLearningGroupAssignment2.Skewedtree;

class Node {
	int val;
	Node left;
	Node right;

	Node(int data) {
		val = data;
		left = null;
		right = null;
	}
}

public class GFG {

	public static Node node;
	static Node previousNode = null;
	static Node headNode = null;
	private static Object right;

	// function to flatten the binary
	// search tree into skewed tree in increasing order

	static void flattenBTToSkewed(Node root, int order) {

		// Base case
		if (root == null) {
			return;
		}

		// Condition to check the order in which the skewed tree to maintained

		if (order > 0) {
			flattenBTToSkewed(root.right, order);
		} else {
			flattenBTToSkewed(root.left, order);
		}

		Node rightNode = root.right;
		Node leftNode = root.left;

		// condition to check if the root Node of the skewed tree is not defined
		if (headNode == null) {
			headNode = root;
			root.left = null;
			previousNode = root;
		} else {
			previousNode.right = root;
			root.left = null;
			previousNode = root;
		}

		// similarly recurse for the left/right subtree on the basis of the order
		// required
		if (order > 0) {
			flattenBTToSkewed(leftNode, order);
		} else {
			flattenBTToSkewed(rightNode, order);
		}
	}

	// function to traverse the right
	// skewed tree using recursion

	static void traverseRightSkewed(Node root) {

		if (root == null) {
			return;
		}
		System.out.print(root.val + " ");
		traverseRightSkewed(root.right);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 50
		// / \
		// 30 60
		// / /
		// 10 55

		GFG tree = new GFG();
		GFG.node = new Node(50);
		GFG.node.left = new Node(30);
		GFG.node.right = new Node(60);
		GFG.node.left.left = new Node(10);
		GFG.node.right.left = new Node(55);

		// order of the skewed tree can be defined as follows
		int order = 0;
		flattenBTToSkewed(node, order);
		traverseRightSkewed(headNode);
	}

}

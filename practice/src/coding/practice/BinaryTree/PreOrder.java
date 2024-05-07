package coding.practice.BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class PreOrder {
	public static class Node{
		int data;
		Node left;
		Node right;
		
		public Node(int data) {
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}
	
	
	public static class BinaryTree{
		static int idx = -1;
		public static Node buildTree(int nodes[]) {
			idx++;
			if(nodes[idx]==-1)
				return null;
			
			Node newNode = new Node(nodes[idx]);
			newNode.left = buildTree(nodes);
			newNode.right = buildTree(nodes);
			
			return newNode;
		}
		
		public static void preOrderTree(Node root) {
			if(root == null) {
			//	System.out.println(-1);
				return;
			}
			
			System.out.print(root.data+ " ");
			preOrderTree(root.left);
			preOrderTree(root.right);
			
		}
		
		public static void inOrderTree(Node root) {
			if(root == null) {
			//	System.out.println(-1);
				return;
			}
			
			inOrderTree(root.left);
			System.out.print(root.data+ " ");
			inOrderTree(root.right);
			
			
		}
		
		public static void postOrderTree(Node root) {
			if(root == null) {
			//	System.out.println(-1);
				return;
			}
			
			postOrderTree(root.left);
			postOrderTree(root.right);
			System.out.print(root.data+" ");
			
		}
		
		public static void levelOrder(Node root) {
			Queue<Node> q = new LinkedList<>();
			q.add(root);
			q.add(null);
			
			while(!q.isEmpty()) {
				Node currNode = q.remove();
				if(currNode == null) {
					System.out.println();
					if(q.isEmpty()) {
						break;
					}else {
						q.add(null);
					}
				}else {
					System.out.print(currNode.data+" ");
					if(currNode.left!=null) {
						q.add(currNode.left);
					}
					if(currNode.right!=null) {
						q.add(currNode.right);
					}
				}
			}
			
		}
		
			public static int noOfNodes(Node root) {
				
				if(root==null)
					return 0;
				
				int leftNode = noOfNodes(root.left);
				int rightNode = noOfNodes(root.right);
				
				return leftNode+rightNode+1;
			}
		
	}
	
	public static void main(String[] args) {
		int[] nodes = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
		BinaryTree tree = new BinaryTree();
		Node root = tree.buildTree(nodes);
		System.out.println(root.data);
		
		System.out.println("PreOrder traversal : ");
		tree.preOrderTree(root);
		System.out.println("\nPostOrder traversal : ");
		tree.postOrderTree(root);
		System.out.println("\nInOrder traversal : ");
		tree.inOrderTree(root);
		System.out.println("\nLevel Order traversal : ");
		tree.levelOrder(root);
		System.out.println("\nTotal No of Node : ");
		System.out.println(tree.noOfNodes(root));
	}
}

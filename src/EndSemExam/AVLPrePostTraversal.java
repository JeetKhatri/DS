package EndSemExam;

import java.util.Scanner;

class Node {
    int key, height;
    Node left, right;
 
    Node(int d) {
        key = d;
        height = 1;
    }
}
 
public class AVLPrePostTraversal {
 
    Node root;
 
    int height(Node N) {
        if (N == null)
            return 0;
 
        return N.height;
    }
 
    int max(int a, int b) {
        return (a > b) ? a : b;
    }
 
    Node rightRotate(Node y) {
        Node x = y.left;
        Node T2 = x.right;
 
        x.right = y;
        y.left = T2;
 
        y.height = max(height(y.left), height(y.right)) + 1;
        x.height = max(height(x.left), height(x.right)) + 1;
 
        return x;
    }
 
    Node leftRotate(Node x) {
        Node y = x.right;
        Node T2 = y.left;
 
        y.left = x;
        x.right = T2;
 
        x.height = max(height(x.left), height(x.right)) + 1;
        y.height = max(height(y.left), height(y.right)) + 1;
 
        return y;
    }
 
    int getBalance(Node N) {
        if (N == null)
            return 0;
 
        return height(N.left) - height(N.right);
    }
 
    Node insert(Node node, int key) {
 
        if (node == null)
            return (new Node(key));
 
 
        if (key < node.key)
            node.left = insert(node.left, key);
        else
            node.right = insert(node.right, key);
 
        node.height = 1 + max(height(node.left),
                              height(node.right));
 
        int balance = getBalance(node);
 
        if (balance > 1 && key < node.left.key)
            return rightRotate(node);
 
        if (balance < -1 && key > node.right.key)
            return leftRotate(node);
 
        if (balance > 1 && key > node.left.key) {
            node.left = leftRotate(node.left);
            return rightRotate(node);
        }
 
        if (balance < -1 && key < node.right.key) {
            node.right = rightRotate(node.right);
            return leftRotate(node);
        }
 
        return node;
    }
 
    void preOrder(Node node) {
        if (node != null) {
            System.out.print(node.key + " ");
            preOrder(node.left);
            preOrder(node.right);
        }
    }
 
    public static void main(String[] args) {
    	AVLPrePostTraversal tree = new AVLPrePostTraversal();
 
        Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String[] arr = str.split(" ");
		boolean flag=true;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i].equals("D")){
				flag=false;
			}else{
				if(flag==true){
					tree.root = tree.insert(tree.root,Integer.parseInt(arr[i]));
				}else{
					tree.root = tree.delete(tree.root,Integer.parseInt(arr[i]));
				}
			}
		}
		tree.preOrder(tree.root);
		System.out.println("\n\n");
		tree.inOrder();
    }
    public Node delete(Node node,int no){
    	
    	return root;
    }
    public void delete(int no){
		root = deleteRec(root,no);
	}

	public Node deleteRec(Node node2, int no) {

		if(root==null){
			return root;
		}else{
			if(no > root.key){
				root.right = deleteRec(root.right, no);
			}else if(no < root.key){
				root.left = deleteRec(root.left, no);
			}else{
				if (root.left==null)
					return root.right;
				else if (root.right==null)
					return root.left;
				root.key = minValue(root.right);
				root.right = deleteRec(root.right, root.key);
			}
		}
		return root;
	}
	
	public int minValue(Node node) {
		int min = node.key;
		while (node.left != null) {
			min = node.left.key;
			node = node.left;
		}
		return min;
	}
	public void inOrder() {
		inOrderDisplay(root);
	}
	
	public void inOrderDisplay(Node node){
		if(node!=null){
			inOrderDisplay(node.left);
			System.out.print(node.key+" ");
			inOrderDisplay(node.right);
		}
	}

	
}

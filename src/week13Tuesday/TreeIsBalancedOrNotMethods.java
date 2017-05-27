package week13Tuesday;


public class TreeIsBalancedOrNotMethods {

	Node node;
	
	public boolean isBalanced(Node node){
		
		int leftHeight=0;
		int RightHeight=0;
		
		if(node == null)
			return true;
		
		leftHeight=calculateHeight(node.getLeft());
		RightHeight = calculateHeight(node.getRight());
		
		if(Math.abs(leftHeight-RightHeight) < 2  && isBalanced(node.getLeft()) && isBalanced(node.getRight()))
			return true;
		else
			return false;
	}
	
	private int calculateHeight(Node node){
		if(node==null)
			return 0;
		return 1 + (maxCalculate(calculateHeight(node.getLeft()),calculateHeight(node.getRight())));
	}

	private int maxCalculate(int no1,int no2) {
		return (no1>=no2)? no1 : no2;
	}
	
	
	
	//  for create BST insert
	
	
	public void add(int no) {
		node = insertRec(node,no);
	}

	public Node insertRec(Node node, int no) {
		
		
		if(node==null){
			node = new Node(no);
		}else{
			if(no > node.getData()){
				node.setRight(insertRec(node.getRight(), no));
			}else if(no < node.getData()){
				node.setLeft(insertRec(node.getLeft(), no));
			}
		}
		return node;
	}
	
}
package week11Friday;

public class Q1Methods<T>  {
	
	private Tree node;

	public void add(int no) {
		node = insertRec(node,no);
	}

	public Tree insertRec(Tree node, int no) {
		
		if(node==null){
			node = new Tree(no);
		}else{
			if(no > node.getData()){
				node.setRight(insertRec(node.getRight(), no));
			}else if(no < node.getData()){
				node.setLeft(insertRec(node.getLeft(), no));
			}
		}
		return node;
	}
	
	public void delete(int no){
		node = deleteRec(node,no);
	}

	public Tree deleteRec(Tree node2, int no) {

		if(node==null){
			return node;
		}else{
			if(no > node.getData()){
				node.setRight(deleteRec(node.getRight(), no));
			}else if(no < node.getData()){
				node.setLeft(deleteRec(node.getLeft(), no));
			}else{
				if (node.getLeft()==null)
					return node.getRight();
				else if (node.getRight()==null)
					return node.getLeft();
				node.setData(minValue(node.getRight()));
				node.setRight(deleteRec(node.getRight(), node.getData()));
			}
		}
		return node;
	}
	
	public int minValue(Tree node) {
		int min = node.getData();
		while (node.getLeft() != null) {
			min = node.getLeft().getData();
			node = node.getLeft();
		}
		return min;
	}
	
	public void inOrder() {
		inOrderDisplay(node);
	}
	
	public void inOrderDisplay(Tree node){
		if(node!=null){
			inOrderDisplay(node.getLeft());
			System.out.print(node.getData()+" ");
			inOrderDisplay(node.getRight());
		}
	}
	
	public void preOrder() {
		preOrderDisplay(node);
	}
	
	public void preOrderDisplay(Tree node){
		if(node!=null){
			preOrderDisplay(node.getLeft());
			System.out.print(node.getData()+" ");
			preOrderDisplay(node.getRight());
		}
	}
	
	public void postOrder() {
		postOrderDisplay(node);
	}
	
	public void postOrderDisplay(Tree node){
		if(node!=null){
			postOrderDisplay(node.getLeft());
			System.out.print(node.getData()+" ");
			postOrderDisplay(node.getRight());
		}
	}
	
	public void levelOrder() {
		for(int i=0;i<getSize(node);i++){
			levelOrderDisplay(node,i);
			System.out.println();
		}
	}
	
	public void levelOrderDisplay(Tree node,int level){
		if(node==null || level==0)
			return;
		if(level==1)
			System.out.print(node.getData()+ " ");
		else{
			levelOrderDisplay(node.getLeft(),level-1);
			levelOrderDisplay(node.getRight(),level-1);
		}
	}
	
	public int getSize(Tree root){
		if(root==null)
			return 0;
		else
			return getSize(root.getLeft()) + getSize(root.getRight()) + 1;
	}

	 boolean isBST(Tree root)  {
	        return isBSTUtil(root, Integer.MIN_VALUE,Integer.MAX_VALUE);
	 }
	 
	 boolean isBSTUtil(Tree node, int min, int max)
	 {
		 if (node == null)
			 return true;
	 
	     /* false if this node violates the min/max constraints */
	     if (node.getData() < min || node.getData() > max)
	    	 return false;
	 
	     /* otherwise check the subtrees recursively
	     tightening the min/max constraints */
	     return (isBSTUtil(node.getLeft(), min, node.getData()-1) && isBSTUtil(node.getRight(), node.getData()+1, max));
	 }
	 
	 Tree findLCA(int n1, int n2)
	 {
	        return findLCA(node, n1, n2);
	 }
	 
	    // This function returns pointer to LCA of two given
	    // values n1 and n2. This function assumes that n1 and
	    // n2 are present in Binary Tree
	 Tree findLCA(Tree node, int n1, int n2)
	    {
	        // Base case
	        if (node == null)
	            return null;
	 
	        // If either n1 or n2 matches with root's key, report
	        // the presence by returning root (Note that if a key is
	        // ancestor of other, then the ancestor key becomes LCA
	        if (node.getData() == n1 || node.getData() == n2)
	            return node;
	 
	        // Look for keys in left and right subtrees
	        Tree left_lca = findLCA(node.getLeft(), n1, n2);
	        Tree right_lca = findLCA(node.getRight(), n1, n2);
	 
	        // If both of the above calls return Non-NULL, then one key
	        // is present in once subtree and other is present in other,
	        // So this node is the LCA
	        if (left_lca!=null && right_lca!=null)
	            return node;
	 
	        // Otherwise check if left subtree or right subtree is LCA
	        return (left_lca != null) ? left_lca : right_lca;
	    }
}

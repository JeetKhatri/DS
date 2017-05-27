package Exam.Q3;


public class q3Method {

	Tree node;
	
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
	public void preorder(){
		preorderDisplay(node);
	}
	public void preorderDisplay(Tree node){
		if(node!=null){
			preorderDisplay(node.getLeft());
			System.out.println(node.getData()+" ");
			preorderDisplay(node.getRight());
		}
	}
	public int getSize(Tree root){
		if(root==null)
			return 0;
		else
			return getSize(root.getLeft()) + getSize(root.getRight()) + 1;
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

}

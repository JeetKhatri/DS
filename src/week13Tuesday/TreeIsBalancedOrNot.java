package week13Tuesday;

public class TreeIsBalancedOrNot {

	public static void main(String[] args) {

		TreeIsBalancedOrNotMethods objMethods = new TreeIsBalancedOrNotMethods();
	
/*
        		    10
      			  /   \
     			 5      15
   			   /  \    
 			 3     7  
 			/
		   2
*/	
		
		objMethods.node = new Node(10);
		objMethods.node.setLeft(new Node(5));
		objMethods.node.setRight(new Node(15));
		objMethods.node.getLeft().setLeft(new Node(3));
		objMethods.node.getLeft().setRight(new Node(7));
		objMethods.node.getLeft().getLeft().setLeft(new Node(2));
		
		if(objMethods.isBalanced(objMethods.node))
			System.out.println("Balanced");
		else
			System.out.println(" not Balanced");
			
	}

}

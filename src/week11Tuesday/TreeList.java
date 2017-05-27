package week11Tuesday; 
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.Stack;

class TreeList<T> 
{
	private Tree root;
	
	public Tree getroot(){
		return root;
	}
	
	public void add(int data) {
		root = insertRec(root, data);
	}
	
	public Tree insertRec(Tree root, int key) {
		
		if (root == null) {
			root = new Tree(key);
			return root;
		}

		if (key < root.getData())
		{
			root.setLeft(insertRec(root.getLeft(), key));
			root.getLeft().setParent(root);
		}
		else if (key > root.getData())
		{	root.setRight(insertRec(root.getRight(), key));
			root.getRight().setParent(root);
		}
		return root;
	}
	
	public void deleteKey(int key) {
		root = delete(root, key);
	}
	
	public Tree delete(Tree root, int key) {
		
		if (root == null)
			return root;

		if (key < root.getData())
			root.setLeft(delete(root.getLeft(), key));
		else if (key > root.getData())
			root.setRight(delete(root.getRight(), key));
		else {
			if (root.getLeft() == null)
				return root.getRight();
			else if (root.getRight() == null)
				return root.getLeft();
			root.setData(minValue(root.getRight()));
			root.setRight(delete(root.getRight(), root.getData()));
		}
		return root;
	}
	
	public int minValue(Tree root) {
		int minv = root.getData();
		while (root.getLeft() != null) {
			minv = root.getLeft().getData();
			root = root.getLeft();
		}
		return minv;
	}
	
	public void inOrder() {
		inOrderDisplay(root);
	}

	public void inOrderDisplay(Tree Tree) {
		if (Tree != null) {
			inOrderDisplay(Tree.getLeft());
			System.out.print(Tree.getData() + " ");
			inOrderDisplay(Tree.getRight());
		}
	}

	public void postOrder() {
		postOrderDisplay(root);
	}

	public void postOrderDisplay(Tree Tree) {
		if (Tree != null) {
			postOrderDisplay(Tree.getLeft());
			postOrderDisplay(Tree.getRight());
			System.out.print(Tree.getData() + " ");
		}
	}

	public void preOrder() {
		preOrderDisplay(root);
	}

	public void preOrderDisplay(Tree Tree) {
		if (Tree != null) {
			System.out.print(Tree.getData() + " ");
			preOrderDisplay(Tree.getLeft());
			preOrderDisplay(Tree.getRight());
		}
	}

	
	void BSTToSortedLL(Tree root, Tree head_ref)
	{
	    // Base cases
	    if(root == null)
	        return;
	 
	    // Recursively convert right subtree
	    BSTToSortedLL(root.getRight(), head_ref);
	 
	    // insert root into linked list
	    root.setRight(head_ref);
	 
	    // Change left pointer of previous head
	    // to point to NULL
	    if (head_ref != null)
	        (head_ref).setLeft(null);
	 
	    // Change head of linked list
	    head_ref = root;
	 
	    // Recursively convert left subtree
	    BSTToSortedLL(root.getLeft(), head_ref);
	}
	 
	// Function to convert a sorted Linked
	// List to Min-Heap.
	// root -. Root of Min-Heap
	// head -. Pointer to head Tree of sorted
//	              linked list
	void SortedLLToMinHeap(Tree root, Tree head)
	{
	    // Base Case
	    if (head == null)
	        return;
	 
	    // queue to store the parent Trees
	    Queue q=null;
	 
	    // The first Tree is always the root Tree
	    root = head;
	 
	    // advance the pointer to the next Tree
	    head=head.getRight();
	 
	    // set right child to NULL
	    root.setRight(null);
	 
	    // add first Tree to the queue
	    q.add(root);
	 
	    // run until the end of linked list is reached
	    while (head!=null)
	    {
	        // Take the parent Tree from the q and remove it from q
	        Tree parent = (Tree) q.remove();
	        
	 
	        // Take next two Trees from the linked list and
	        // Add them as children of the current parent Tree
	        // Also in push them into the queue so that
	        // they will be parents to the future Trees
	        Tree leftChild = head;
	        head = head.getRight();        // advance linked list to next Tree
	        leftChild.setRight(null); 
	        q.add(leftChild);
	 
	        // Assign the left child of parent
	        parent.setLeft(leftChild);
	 
	        if (head!=null)
	        {
	            Tree rightChild = head;
	            head = head.getRight(); // advance linked list to next Tree
	            rightChild.setRight(null); // set its right child to NULL
	            q.add(rightChild);
	 
	            // Assign the right child of parent
	            parent.setRight(rightChild); 
	        }
	    }
	}
	 
	// Function to convert BST into a Min-Heap
	// without using any extra space
	public void BSTToMinHeap(Tree root)
	{
	    // head of Linked List
	    Tree head = null;
	 
	    // Convert a given BST to Sorted Linked List
	    BSTToSortedLL(root, head);
	 
	    // set root as NULL
	    root = null;
	 
	    // Convert Sorted Linked List to Min-Heap
	    SortedLLToMinHeap(root, head);
	}

	

		ArrayList a = new ArrayList();

	public ArrayList pre(Tree node) {
		int i = 0;
		if (node != null) {
			pre(node.getLeft());
			a.add(node.getData() + "");
			// System.out.print(node.getData() + " ");
			pre(node.getRight());
		}
		return a;
	}

	public boolean isbst(Tree node1)
	{
		if (node1 == null) {
            return true;
        }
       
        //keep the nodes in the path that are waiting to be visited
        Stack<Tree> stack = new Stack<Tree>();
        Tree node = node1;
        
        //first node to be visited will be the left one
        while (node != null) {
            stack.push(node);
            node = node.getLeft();
        }
        int i=0;
        int a,b;
        a=0;
        b=0;
        // traverse the tree
        while (stack.size() > 0) {
          
            // visit the top node
            node = stack.pop();
        //    System.out.println(node.getData()+"");
            a=Integer.parseInt(node.getData()+"");
            if(i==1)
            {
            if(b>a)
            	return false;
            }
            i=1;
            b=a;
            
            if (node.getRight() != null) {
                node = node.getRight();
                
                // the next node to be visited is the leftmost
                while (node != null) {
                    stack.push(node);
                    node = node.getLeft();
                }
            }
        }
		
		
	
	return true;

	}
	public Tree find(Tree Tree,String data) {
		  if (root == null) {
	            return null;
	        }
	       
	        //keep the nodes in the path that are waiting to be visited
	        Stack<Tree> stack = new Stack<Tree>();
	        Tree node = root;
	        
	        //first node to be visited will be the left one
	        while (node != null) {
	            stack.push(node);
	            node = node.getLeft();
	        }
	        
	        // traverse the tree
	        while (stack.size() > 0) {
	          
	            // visit the top node
	            node = stack.pop();
	        //    System.out.println(node.getData()+"");
	            if(data.equals(node.getData()+""))
				{
					return node;
				}
				
	            if (node.getRight() != null) {
	                node = node.getRight();
	                
	                // the next node to be visited is the leftmost
	                while (node != null) {
	                    stack.push(node);
	                    node = node.getLeft();
	                }
	            }
	        }
			
			
		
		return null;
	}
	
	public Tree LCA(Tree n1, Tree n2) 
    {
        
		HashMap<Tree, Boolean> ancestors = new HashMap<Tree, Boolean>();
 
        
        while (n1 != null) 
        {
            ancestors.put(n1, Boolean.TRUE);
            n1 = n1.getParent();
        }
 
        while (n2 != null) 
        {
        	
            if (ancestors.containsKey(n2) != ancestors.isEmpty())
                return n2;
            n2 = n2.getParent();
        }
 
        return null;
    }

	

	

	public int getSize(Tree tree) {
		if (tree == null)
			return 0;
		else
			return getSize(tree.getLeft()) + getSize(tree.getLeft()) + 1;
	}

	public Tree getRoot() {
		return root;
	}

	public void setRoot(Tree root) {
		this.root = root;
	}

}

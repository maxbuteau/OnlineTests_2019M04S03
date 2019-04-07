package com.acquisio.basic.java.question02;

/**
 * QUESTION 2: TreeNode
 * Using the tree structure define at
 * http://en.wikipedia.org/wiki/File:Binary_tree.svg,
 * add the code necessary to optain the following output.
 * ..2
 * ....7
 * ......2
 * ......6
 * ........5
 * ........11
 * ....5
 * ......9
 * ........4
 *
 * IMPORTANT: Add all missing javadoc and/or unit tests that you think is necessary.
 */
public class TreeNavigation {

    public static void main(String[] args) {
        TreeNavigation main = new TreeNavigation();
        main.treeNode();
    }

    private void treeNode() {
        Node n1 = new Node("6", new Node("5"), new Node("11"));
        Node n2 = new Node("7", new Node("2"), n1);
        Node n3 = new Node("9", new Node("4"));
        Node n4 = new Node("5", null, n3);
        Node n = new Node("2", n2, n4);
        // TODO: Implement code here
        preOrderTraversal(n, 2);
        
    }
    
    private void preOrderTraversal(Node root, int x) {
    	//Base case
    	if (root == null) {
    		return;
    	}
    	
    	for (int i = 0; i < x; i++) {
    		System.out.print(".");
    	}
    	
    	System.out.println(root.name);
    	
    	for (Node child : root.children) {
    		preOrderTraversal(child, x+2); //Every child has 2 more dots in front than its parent
    	}
    }
}


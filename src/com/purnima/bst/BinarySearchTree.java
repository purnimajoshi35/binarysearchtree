package com.purnima.bst;

public class BinarySearchTree {

    Node root;

    public BinarySearchTree(){
        root = null;
    }

    public void insertNode(int key){
        root = insertNode(root, key);
    }

    public Node insertNode(Node node, int value){
        if(node == null){
            node = new Node(value);
        }
        if(value<node.key){
            node.left=insertNode(node.left, value);
        }
        else if(value>node.key){
            node.right=insertNode(node.right, value);
        }

        return node;
    }

    void inorder() {
        inorder(root);

    }

    void inorder(Node root){
        if(root!=null){
            inorder(root.left);
            System.out.println(root.key);
            inorder(root.right);
        }
    }

}

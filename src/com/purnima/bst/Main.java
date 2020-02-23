package com.purnima.bst;

public class Main {
    public static void main(String[] args){
        BinarySearchTree binarySearchTree = new BinarySearchTree();

        binarySearchTree.insertNode(15);
        binarySearchTree.insertNode(16);
        binarySearchTree.insertNode(14);
        binarySearchTree.insertNode(17);
        binarySearchTree.insertNode(13);
        binarySearchTree.insertNode(18);
        binarySearchTree.insertNode(12);
        binarySearchTree.insertNode(19);
        binarySearchTree.insertNode(11);

        binarySearchTree.inorder();
    }
}

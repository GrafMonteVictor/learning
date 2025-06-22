package org.example.examples.trees.binaryTree;

public class Main {
    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.insertNode(10);
        tree.insertNode(-1);
        tree.insertNode(0);
        tree.insertNode(100);
        tree.insertNode(101);
        tree.insertNode(43);
        tree.insertNode(99);
        tree.printTree();
    }
}

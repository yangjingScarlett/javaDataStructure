package com.yang.javadatastructure.h_tree;

/**
 * @author: Jing Yang
 * @date: 11/12/2019
 */
public class BinarySearchTreeApp {

    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        tree.insert(0);
        tree.insert(10);
        tree.insert(15);
        tree.insert(20);
        for (int i = 0; i < 10; i++) {
            int data = (int) (Math.random() * 100);
//            tree.insert(data);
            tree.insertRecursion(tree.root, data);
            if (i == 5) {
                tree.insert(100);
            }
        }

        tree.displayTree(tree.root);
        System.out.println("");

        System.out.println(tree.find(15));

        tree.delete(0);
        tree.displayTree(tree.root);
        System.out.println("");

        tree.root = tree.deleteRecursion(tree.root, 15);
        tree.displayTree(tree.root);
        System.out.println("");

        System.out.println("-------- Depth-First Search: In order --------");
        tree.traverseInOrder(tree.root);
        System.out.println("-------- Depth-First Search: In order --------");

        System.out.println("-------- Depth-First Search: Pre order --------");
        tree.traversePreOrder(tree.root);
        System.out.println("-------- Depth-First Search: Pre order --------");

        System.out.println("-------- Depth-First Search: Post order --------");
        tree.traversePostOrder(tree.root);
        System.out.println("-------- Depth-First Search: Post order --------");

        System.out.println("-------- Breadth-First Search --------");
        tree.traverseBreadthFirst();
        System.out.println("-------- Breadth-First Search --------");

    }
}

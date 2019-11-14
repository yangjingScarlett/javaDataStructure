package com.yang.javadatastructure.h_tree;


import java.util.LinkedList;
import java.util.Queue;

/**
 * @author: Jing Yang
 * @date: 11/12/2019
 */
public class BinarySearchTree {
    Node root;

    public BinarySearchTree() {
        this.root = null;
    }

    // don't use recursion
    public void insert(int data) {
        Node node = new Node(data);
        if (root == null) {
            root = node;
            return;
        }
        Node last = root;
        Node temp = root;
        while (last != null) {
            temp = last;
            if (last.data < data) {
                last = last.right;
            } else {
                last = last.left;
            }
        }
        if (temp.data < data) {
            temp.right = node;
        } else {
            temp.left = node;
        }
    }

    public Node insertRecursion(Node current, int data) {
        Node node = new Node(data);
        if (current == null) {
            return node;
        } else {
            if (data > current.data) {
                current.right = insertRecursion(current.right, data);
            } else {
                current.left = insertRecursion(current.left, data);
            }
        }
        return current;
    }

    public Node find(int data) {
        Node current = root;
        while (current != null) {
            if (current.data == data) {
                return current;
            } else if (current.data < data) {
                current = current.right;
            } else {
                current = current.left;
            }
        }
        System.out.println("Cannot find corresponding data");
        return null;
    }

    // it is a little complex so better to use the recursion to do the deletion
    public Node delete(int data) {
        Node current = root;
        Node parent = root;
        while (current != null) {
            if (current.data == data) {
                break;
            } else if (current.data < data) {
                parent = current;
                current = current.right;
            } else {
                parent = current;
                current = current.left;
            }
        }

        if (current == null) {
            System.out.println("No corresponding Node found.");
            return null;
        }
        if (current == root) {
            if (current.left == null && current.right == null) {
                root = null;
            } else if (current.left == null) {
                root = current.right;
            } else if (current.right == null) {
                root = current.left;
            } else {
                int smallestValueOfRightSubTree = findSmallestValue(current.right);
                delete(smallestValueOfRightSubTree); // the order of line 96 and line 97 is very important, because if the line 97 is before, it will cause dead recursion
                root.data = smallestValueOfRightSubTree;
            }
        }

        if (parent.left == current) {
            // 1. current no child
            // 2. current has just one child
            // 3. current has two children and sub-tree, need to use the smallest node of current node's right sub-tree to instead current. and then delete the smallest node.
            // this is because the smallest node of right sub-tree is still greater than all of the left sub-tree, so no need to update the left sub-tree
            // and the smallest node of right sub-tree is still less than other node sog right sub-tree, so no need to update the other right sub-tree
            if (current.left == null && current.right == null) {
                parent.left = null;
            } else if (current.left == null) {
                parent.left = current.right;
            } else if (current.right == null) {
                parent.left = current.left;
            } else {
                int smallestValueOfRightSubTree = findSmallestValue(current.right);
                current.data = smallestValueOfRightSubTree;
                delete(smallestValueOfRightSubTree);
            }
        } else {
            if (current.left == null && current.right == null) {
                parent.right = null;
            } else if (current.left == null) {
                parent.right = current.right;
            } else if (current.right == null) {
                parent.right = current.left;
            } else {
                int smallestValueOfRightSubTree = findSmallestValue(current.right);
                current.data = smallestValueOfRightSubTree;
                delete(smallestValueOfRightSubTree);
            }
        }

        return current;
    }

    public Node deleteRecursion(Node current, int data) {
        if (current == null) {
            return null;
        } else if (current.data == data) {
            // below code is for deleting the found Node, the node should be deleted has 3 different conditions:
            // a node has no children – this is the simplest case; we just need to replace this node with null in its parent node
            // a node has exactly one child –in the parent node, we replace this node with its only child.
            // a node has two children –this is the most complex case because it requires a tree reorganization
            if (current.right == null && current.left == null) {
                return null;
            } else if (current.left == null) {
                return current.right;
            } else if (current.right == null) {
                return current.left;
            } else {
                int smallestValue = findSmallestValue(current);
                current.right = deleteRecursion(current.right, smallestValue);
                current.data = smallestValue;
                return current;
            }
        } else if (current.data < data) {
            current.right = deleteRecursion(current.right, data);
        } else {
            current.left = deleteRecursion(current.left, data);
        }
        return current;
    }

    private int findSmallestValue(Node current) {
        return current.left == null ? current.data : findSmallestValue(current.left);
    }

    // Depth-First Search: in order search: first visiting the left sub-tree, then the root node, and finally the right sub-tree
    public void traverseInOrder(Node node) {
        if (node != null) {
            traverseInOrder(node.left);
            System.out.print(String.format("%d, ", node.data));
            traverseInOrder(node.right);
        }
    }

    // Depth-First Search: pre order search: first the root node, then the left subtree, and finally the right subtree
    public void traversePreOrder(Node node) {
        if (node != null) {
            System.out.print(String.format("%d, ", node.data));
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }

    // Depth-First Search: post order search: first search the left sub-tree, then search the right sub-tree, finally the node value
    public void traversePostOrder(Node node) {
        if (node != null) {
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            System.out.print(String.format("%d, ", node.data));
        }
    }

    // Breadth-First Search: visits all the nodes of a level before going to the next level.
    // use a Queue to hold the nodes from each level in order. We'll extract each node from the list, print its values, then add its children to the queue
    public void traverseBreadthFirst() {
        if (root == null) {
            return;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            Node node = queue.remove();
            System.out.print(String.format("%d, ", node.data));
            if (node.left != null) {
                queue.add(node.left);
            }
            if (node.right != null) {
                queue.add(node.right);
            }
        }
    }


    // this is a application of Depth-First search: pre order search
    public void displayTree(Node root) {
        if (root != null) {
            System.out.print(String.format("%d, ", root.data));
            displayTree(root.left);
            displayTree(root.right);
        }
    }

    class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }

        @Override
        public String toString() {
            return "{ data:" + data + " }";
        }
    }
}

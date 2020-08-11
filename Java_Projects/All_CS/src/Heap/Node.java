package Heap;

public class Node {
    int value;
    Node left, right;

    public Node(int value) {
        this.value = value;
        left = null;
        right = null;
    }

    public Node getLef() {
        return left;
    }

    public Node getRight() {
        return right;
    }
}

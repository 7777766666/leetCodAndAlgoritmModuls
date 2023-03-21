package org.example.day6;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Node {
    public int val;
    public List<Node> children;

    public Node() {
    }

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }

    public static void main(String[] args) {

        Node root = new Node(1);

        Node node = new Node(2);
        Node node1 = new Node(3);
        Node node2 = new Node(4);
        Node node3 = new Node(5);

        Node node4 = new Node(6);
        Node node5 = new Node(7);
        Node node6 = new Node(8);
        Node node7 = new Node(9);
        Node node8 = new Node(10);

        Node node9 = new Node(11);
        Node node10 = new Node(12);
        Node node11 = new Node(13);

        Node node12 = new Node(14);

        root.children = Arrays.asList(node, node1, node2, node3);

        node1.children = Arrays.asList(node4, node5);
        node2.children = Arrays.asList(node6);
        node3.children = Arrays.asList(node7, node8);

        node5.children = Arrays.asList(node9);
        node6.children = Arrays.asList(node10);
        node7.children = Arrays.asList(node11);

        node9.children = Arrays.asList(node12);

//        System.out.println(Arrays.stream(root.children.stream(). + " !!!"  );

        Node test = new Node();
//        System.out.println(test.preorder(root));












        Node nodeOne7 = new Node(12);
        Node nodeOne6 = new Node(10, Arrays.asList(null));
        Node nodeOne5 = new Node(9, Arrays.asList(null));
        Node nodeOne4 = new Node(5, Arrays.asList(null));
        Node nodeOne3 = new Node(11, Arrays.asList(nodeOne6, nodeOne7, null));
        Node nodeOne2 = new Node(6, Arrays.asList(nodeOne4, nodeOne5, null));
        Node nodeAfterTest = new Node(66, null);
        Node nodeOneTest = new Node(99, Arrays.asList(nodeAfterTest, null));
        Node nodeOne1 = new Node(8, Arrays.asList(nodeOne2, nodeOne3, null));
        Node nodeOne = new Node(23, Arrays.asList(nodeOne1, nodeOneTest, null));

//
//        nodeOne.children = Arrays.asList(nodeOne1, nodeOneTest);
//
//        nodeOne1.children = Arrays.asList(nodeOne2, nodeOne3);
//
//        nodeOne2.children = Arrays.asList(nodeOne4, nodeOne5);
//        nodeOne3.children = Arrays.asList(nodeOne6, nodeOne7);
//
//        System.out.println(nodeOne.children);
//
        System.out.println(preorder(nodeOne));


    }


    public static List<Integer> preorder(Node root) {
        List<Integer> list = new ArrayList<>();

        if (root != null) {
            list.add(root.val);
            System.out.println(root.val);
        }
        if (root.children.size() == 0) {
            return list;
        }
        int z = 0;

        while (root.children.size() != z) {
            list.add(root.children.get(z++).val);
            System.out.println((list.get(list.size() - 1) + "  !!!!!!!!!!!!"));

        }
        List<Node> childrenDown = root.children;
        System.out.println(root.children + "  ####");


        int i = 0;
        while (root.children.size() != i) {


            System.out.println(root.children.get(i).val);
            i++;
        }
        return list;
    }

}
package com.company;

import java.io.IOException;

public class MyLinkedList {
    private Node root;
    private int n;

    public MyLinkedList(){
        root = null;
        n = 0;
    }


    public String get(int n) {
        if (root != null) {
            Node node = root;
            for (int i = 1; i <= n; i++) {
                if (node.node != null) {
                    node = node.node;
                } else {
                    throw new ArrayIndexOutOfBoundsException("no element");
                }
            }
            return node.element;
        }
        throw new ArrayIndexOutOfBoundsException("no element");
    }

    public int size(){
        return n;
    }

    public void delete(int n) {

        if (root==null) {
            throw new ArrayIndexOutOfBoundsException("no element");
        }
        if (root != null) {
            if (n == 0) {
                if (root.node != null) {
                    root = root.node;
                } else {
                    root = null;
                }
                this.n--;
                return;
            }

            Node node = root;
            for (int i = 1; i < n; i++) {
                if (node.node != null) {
                    node = node.node;
                } else {
                    throw new ArrayIndexOutOfBoundsException("no element");
                }
            }
            if (node.node != null){
                if (node.node.node != null) {
                    node.node = node.node.node;
                } else {
                    node.node = null;
                }
            }
            this.n--;
        }
    }

    public void add(String str){
        if(root == null) {
            Node node = new Node();
            node.element = str;
            root = node;
        } else {
            Node node = root;
            while (node.node != null){
                node = node.node;
            }
            Node node2 = new Node();
            node2.element = str;
            node.node = node2;

            node.node.node = null;
            node2.node = null;

        }
        n++;
    }


    private class Node{
        String element;
        Node node;
    }
}
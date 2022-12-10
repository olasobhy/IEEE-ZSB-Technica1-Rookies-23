/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package binarysearchtree;

import java.util.Scanner;

/**
 *
 * @author olaso
 */

//https://bald-saffron-f6a.notion.site/Task-6-eba60ae6e95849eca365f5dfa900b41d

public class BinarySearchTree {

    public static class Node {

        int value;
        Node leftNode;
        Node rightNode;
    }

     public static class  BinaryTree {

        static Node rooot;

    
    public static void insertNode(Node newNode , Node root){
        if (newNode.value > root.value){
         if(root.rightNode == null)
             root.rightNode = newNode;
        
         else 
             insertNode( newNode ,  root.rightNode);         
    }
        else {
            if (root.leftNode == null)
                newNode = root.leftNode;
            else 
                insertNode( newNode ,  root);
        }
            
        
    }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        Node node = new Node();
        node.value=s.nextInt();
        node.leftNode = null;
        node.rightNode = null;
        BinaryTree.insertNode(node, BinaryTree.rooot);    

}
}
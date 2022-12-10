/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arrayrotation;

import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author olaso
 */
public class ArrayRotation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int k = s.nextInt();
        int q = s.nextInt();
        LinkedList<Integer> list = new LinkedList<Integer>();
        int index;
        
        for(int i = 0; i < n; i++)
        {
            list.add(s.nextInt()); 
        }
        
        while(k > 0)
        {
            int j = list.removeLast();
            list.push(j);
            k--;
        }
        
        while(q > 0)
        {
            index = s.nextInt();
            System.out.println(list.get(index));
            q--;
        }
        s.close();
    }

    }
    


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package removefriends;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author olaso
 */
public class RemoveFriends {
            
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int k = s.nextInt();

        Stack sc = new Stack();

        for (int i = 0; i < n; i++) {
            int x = s.nextInt();

            while (!(sc.empty()) && x >0 && k > 0) {
                sc.pop();
                k--;
            }
            sc.push(x);
        }
       
        for (int i = 0; i < sc.size(); i++) {
            System.out.println(sc.get(i));
        }
        
    }

}


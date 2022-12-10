/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package game2;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author olaso
 */
public class Game2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Stack<Integer> scores = new Stack<>();
        scores.push(in.nextInt());
        for (int i = 1; i < n; i++) {
            int cur = in.nextInt();
            if (!scores.peek().equals(cur)) scores.push(cur);
        }
        int m = in.nextInt();
        for (int i = 0; i < m; i++) {
            int cur = in.nextInt();
            while (scores.size() > 0 && cur > scores.peek()) scores.pop();
            System.out.println(scores.size() +(scores.size() > 0 && scores.peek().equals(cur) ? 0 : 1));
        }
    }
}
    
    


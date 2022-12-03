/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package spacestation;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author olaso
 */
public class SpaceStation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int M = s.nextInt();
        int[] list = new int[M];
        for (int i = 0; i < M; i++) {
            list[i] = s.nextInt();
        }
        Arrays.sort(list);

        int first = Math.abs(0 - list[0]);
        int last = Math.abs((N - 1) - list[M - 1]);
        int max = Math.max(first, last);
        int maxSpace = 0;
        for (int i = 0; i < M - 1; i++) {
            maxSpace = Math.max(Math.abs(list[i] - list[i + 1]), maxSpace);
        }
        max = Math.max(max, maxSpace / 2);
        System.out.println(max);
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package matatrixrotat;

import java.util.Scanner;

/**
 *
 * @author olaso
 */
public class MatatrixRotat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner s = new Scanner (System.in);
       int n = s.nextInt();
       int arr[][] = new int[n][n];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = s.nextInt();
                
            }   
        }
         for (int i = 0; i <arr.length; i++) {
            for (int j = 2; j >=0; j--) {
                System.out.print(arr[j][i]+" ");
            }
             System.out.println();
    }
    
}
}
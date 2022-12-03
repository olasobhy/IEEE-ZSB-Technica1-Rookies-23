/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package squarematrix;

import java.util.Scanner;

/**
 *
 * @author olaso
 */
public class SquareMatrix {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[][] = new int[n][n];
        int sum1 = 0;
        int sum2 = 0;
        for (int j = 0; j < arr.length; j++) {
            for (int i = 0; i < arr.length; i++) {
                arr[j][i] = s.nextInt();

            }}
            int k=0;
            for (int i = 0; i< arr.length; i++) {
               sum1 += arr[k++][i];
               // System.out.println("v = "+ arr[k++][i]);
            }
             int j =0;
            for (int m= 2; m >= 0; m--) {
             sum2 += arr[j++][m];
                
            }

        
        System.out.println(Math.abs(sum1-sum2));

    }}

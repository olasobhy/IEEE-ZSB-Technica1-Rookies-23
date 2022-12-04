/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problem.pkg4increment;

import java.util.Scanner;

/**
 *
 * @author olaso
 */
public class Problem4Increment {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }
        if (arr[arr.length - 1] < 9) {
            arr[arr.length - 1]++;
        } else {
            arr[arr.length - 1] = 0;
            arr[arr.length - 2]++;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            
        }

    }}

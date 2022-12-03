/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package insertionsort;

import java.util.Scanner;

/**
 *
 * @author olaso
 */
public class InsertionSort {

    /* public static void swap (int arr[] , int n , int m){
        int temp = n; 
         n =m ;
         m =temp;
    }*/
    public static void main(String[] args) {
        // best case => n
        // avg  case => n^2
        //worst case => n^2
        Scanner s = new Scanner(System.in);
        int arr[] = {8, 7, 6, 5, 4, 3, 2, 1};
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                }
                arr[i] = arr[j];
                arr[j] = temp;

            }

        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }
    }

}

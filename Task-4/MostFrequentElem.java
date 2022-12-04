/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mostfrequentelem;

import java.util.Scanner;

/**
 *
 * @author olaso
 */
public class MostFrequentElem {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int k = s.nextInt();
        int arr[] = new int[n];
        int temp[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }
        int m = -1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    temp[++m] = arr[i];
                }

            }
        }
        System.out.print(arr[0] + " ");
        for (int i = 0; i < m + 1; i++) {
            if (arr[0] != arr[i]) {
                System.out.print(arr[i] + " ");

            }
        }

    }
}

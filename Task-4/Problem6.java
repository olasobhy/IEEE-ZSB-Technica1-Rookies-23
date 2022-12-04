/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problem.pkg6;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author olaso
 */
public class Problem6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int counter = 0;
        int sec_n = n;
        int arr[] = new int[4];
        int mod = 0;
        while (n != 6174) {
            int i = -1;
            int sumdes = 0;
            int sumas = 0;
            while (sec_n != 0) {
                mod = sec_n % 10;
                arr[++i] = mod;
                sec_n = sec_n / 10;
            }
            Arrays.sort(arr);

            for (int j = 0; j < arr.length; j++) {
                sumdes = sumdes * 10 + arr[j];
            }
            for (int k = arr.length - 1; k >= 0; k--) {
                sumas = sumas * 10 + arr[k];

            }

            n = (Math.abs(sumdes - sumas));
            sec_n = n;
            counter++;

        }
        System.out.println(counter);
    }
}

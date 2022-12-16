/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lightsout;

import java.util.Scanner;

/**
 *
 * @author olaso
 */
public class LightsOut {

    static int arr[][] = new int[3][3];

    public static void modify(int i, int j, int counter) {
        arr[i][j] += counter;
        if (j + 1 < 3) {
            arr[i][j + 1] += counter;
        }
        if (j - 1 > -1) {
            arr[i][j - 1] += counter;
        }
        if (i + 1 < 3) {
            arr[i + 1][j] += counter;
        }
        if (i - 1 > -1) {
            arr[i - 1][j] += counter;
        }

    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int arr[][] = new int[5][5];
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                arr[i][j] = s.nextInt();
                int c = arr[i][j];
               // modify(i, j, c);

            }
        }

        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
           int n = 1 + arr[i][j] + arr[i + 1][j] + arr[i - 1][j] + arr[i][j + 1] + arr[i][j - 1];
            //  if (n %2 ==0)
            
            System.out.print(n%2 );

        }
            System.out.println();
    }
    }}

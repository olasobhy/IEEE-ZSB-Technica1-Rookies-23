/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication176;

import java.util.Scanner;

/**
 *
 * @author olaso
 */
public class Library {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int d1 = s.nextInt();
        int m1 = s.nextInt();
        int y1 = s.nextInt();
        int d2 = s.nextInt();
        int m2 = s.nextInt();
        int y2 = s.nextInt();

          if (y1 > y2) {
            System.out.println(10000);
        } else if (y1 < y2 || m1 < m2 || m1 == m2 && d1 <= d2) {
            System.out.println(0);
        } else if (m1 == m2) {
            System.out.println(15 * (d1 - d2));
        } else {
            System.out.println(500 * (m1 - m2));
        }
    }

            /* } else if (d2 > d1 && m2 > m1 && y2 == y1) {
            System.out.println((d2 - d1) * 15 + (m2 - m1) * 500);
        } else if (d2 > d1 && m2 > m1 && y2 > y1) {
            System.out.println((d2 - d1) * 15 + (m2 - m1) * 500 + (y2 - y1) * 10000);
        } else if (d2 > d1 && m2 == m1 && y2 > y1) {
            System.out.println((d2 - d1) * 15 + (y2 - y1) * 10000);
        }*/
        }
    

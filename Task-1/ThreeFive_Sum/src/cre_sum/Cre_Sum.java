/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cre_sum;

import java.util.Scanner;

/**
 *
 * @author olaso
 */
public class Cre_Sum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        long n = s.nextLong();
        long sum = 0;
        for (int i = 3; i <= n; i++) {
            if (i % 3 == 0 || i % 5 == 0){
                sum += i;
            }
        }
            System.out.println(sum);
        }
    }
    


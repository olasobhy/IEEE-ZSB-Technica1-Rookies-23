/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package game;

import java.util.Scanner;

/**
 *
 * @author olaso
 */
public class Game {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int sum = 0 , n2 =1;
        while (sum != 1 && n >9 ) {
             sum = 0;
           
            while (n != 0) {
                int mod = n % 10;
                sum += Math.pow(mod, 2);
                n = n / 10;
            }
           if ( n == sum)
               break;
           else
               n=sum;
           
        }
        if (sum == 1) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

    }
}

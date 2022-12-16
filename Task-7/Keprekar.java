/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package keprekar;

import java.util.Scanner;

/**
 *
 * @author olaso
 */
public class Keprekar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
        int p = s.nextInt();
        int q = s.nextInt();
        
        boolean one = false;
        for (int i = p; i <= q; i++) {
            if (isKaprekar(i)) {
                if (one) {
                    System.out.print(" ");
                }
                System.out.print(i);
                one = true;
            }
        }
        if (!one) {
            System.out.println("INVALID RANGE");
        }
    }
    
    static boolean isKaprekar(long n) {
        long t = n;
        int d = 0; // Digits
        long div = 1;
        while (t > 0) {
            t = t / 10;
            d++;
            div *= 10;
        }
        
        long sq = n * n;
        long left = sq / div;
        long right = sq % div;
        
        //System.out.println(n + " " + left + " " + right);
        
        return left + right == n;
    
    }
    
}

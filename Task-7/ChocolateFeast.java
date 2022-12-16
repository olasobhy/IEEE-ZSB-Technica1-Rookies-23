/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package chocolate.feast;

import java.util.Scanner;

/**
 *
 * @author olaso
 */
public class ChocolateFeast {
    public static int chocolateFeast(int n, int c, int m) {
   
    
    int initialBars = n / c;
    int wrappers = initialBars;
    while (wrappers >= m) {
        initialBars += wrappers / m;
        wrappers = (wrappers / m) + (wrappers % m);
    }
    return initialBars;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        int t = s.nextInt();
        while (t-- >0){
            int n = s.nextInt();
            int c = s.nextInt();
            int m = s.nextInt();
            System.out.println(chocolateFeast(n, c, m));
        }
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package numberfactorial;

import java.util.Scanner;

public class NumberFactorial {
    
   // 5 => 5*4*3*2*1
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        long n = s.nextLong();
        long fac =1;
        for (int i = 1; i <= n; i++) {
            fac=fac*i;
        }
        System.out.println(fac);
        
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sum1ton;

import java.util.Scanner;

/**
 *
 * @author olaso
 */
public class Sum1TON {
    
    public static void main(String[] args) {
        Scanner s =  new Scanner (System.in);
        long n = s.nextLong();
        long sum = 0;
        for (int i = 1; i <= n; i++) {
            sum+=i;
        }
        System.out.println(sum);
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication135;

import java.util.Scanner;

public class PalindromeNumber {

    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        long n = s.nextLong();
        long n_copy = n ;
        long revNum =0;
        long mod = 0;
        while( n != 0){
            mod = n % 10;
            revNum = revNum*10 + mod;
            n = n / 10;
        }
        System.out.println(revNum);
        System.out.println(n_copy == revNum?"YES":"NO");
            
    }
    
}
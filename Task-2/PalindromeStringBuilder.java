/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package PalindromeStringBuilder;

import java.util.Scanner;

/**
 *
 * @author olaso
 */
public class PalindromeStringBuilder {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
       String str = s.next();
       StringBuilder SB = new StringBuilder();
        SB.append(str);
        SB.reverse();
     if(SB.toString().equals(str))
            System.out.println("yes");
     else
            System.out.println("no");
    }
    
}

        
    


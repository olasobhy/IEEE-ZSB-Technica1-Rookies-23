/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package SubSequence2;

import java.util.Scanner;

/**
 *
 * @author olaso
 */
public class HackeRankString {
    public static void subSequence(String s, String t) {
        if (s.length() > t.length()) 
            System.out.println("NO");
        int i = 0, j = 0;
        int n1 = s.length(), n2 = t.length();
        while ((i < n1) && (j < n2)) {
            if (s.charAt(i) == t.charAt(j)) {
                i ++;
                j ++;
            } else {
                j ++;
            }
        }
        if(i == n1)
            System.out.println("YES");
        else
            System.out.println("NO");
    }


    public static void main(String[] args) {
      Scanner S = new Scanner (System.in);
      int n = S.nextInt();
      String s ="hackerrank";
      while ( n-- !=0){
      String t = S.next();
       subSequence(s,t);

 }
    
}}

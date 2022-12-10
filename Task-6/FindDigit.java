/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication175;

import java.util.Scanner;

/**
 *
 * @author olaso
 */
public class FindDigit {
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int test_cases_numb = s.nextInt();
        while (test_cases_numb-- != 0) {
            int n = s.nextInt();
            int counter = 0;
            int n2 = n;
            while (n != 0) {
                int mod = 0;
                mod = n % 10;

                if (mod != 0 && n2 % mod == 0) {
                    counter++;
                }
                n = n / 10;

            }
            System.out.println(counter);

        }
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package greatestcommondivisor;

import java.util.Scanner;

public class GreatestCommonDivisor {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        long a = s.nextLong();
        Long b = s.nextLong();
        long c = 1;
        //8,12
        for (long i = 1; i <= Math.min(a, b); i++) {
            if (a % i == 0 && b % i == 0) {
                c = i;
            }
        }

        System.out.println(c);
    }

}

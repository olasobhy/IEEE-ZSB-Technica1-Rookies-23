/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package primefactors;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author olaso
 */
public class PrimeFactors {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n1 = s.nextInt();
        boolean b = true;
        int mod = 0;
        int counter = 0;
        ArrayList list = new ArrayList();

        for (int i = 2; i <= n1; i++) {
            if ((n1) % i == 0) {
                mod = i;
                list.add(mod);
                counter++;
                n1 = n1 / i;
                i = 2;
            }
        }

        for (int i = 0, j = 2; j < list.indexOf(i); j++) {
            if ((list.indexOf(i)) % j == 0) {
                b = false;
                list.remove(i);
                counter--;
            }
        }
        if (b) {
            for (int i = 0; i < counter; i++) {
                System.out.print(list.get(i) + " ");
            }

        }

    }
}

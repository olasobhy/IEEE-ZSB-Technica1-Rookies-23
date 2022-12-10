/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package beautifultriplets;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author olaso
 */
public class BeautifulTriplets {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
          Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int d = s.nextInt();
        int[] a = new int[n];
        ArrayList set = new ArrayList ();
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
            set.add(a[i]);
        }
        
        int counter = 0;
        
        for (int i = 0; i < n; i++) {
            if (set.contains(a[i]+d)&&set.contains(a[i]+2*d))
                counter++;
        }
        
        System.out.println(counter);
    }
}
        
        
        
        
        
        
        
        
   
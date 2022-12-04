/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problem.pkg3;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author olaso
 */
public class Problem3 {
     static int minimumDistance(int[] a)
    {
        HashMap<Integer, Integer> hmap
            = new HashMap<>();
        int minDistance = Integer.MAX_VALUE;
 
        int previousIndex = 0, currentIndex = 0;
 
        for (int i = 0; i < a.length; i++) {
 
            if (hmap.containsKey(a[i])) {
                currentIndex = i;
 
                previousIndex = hmap.get(a[i]);
 
                minDistance
                    = Math.min(
                        (currentIndex - previousIndex),
                        minDistance);
            }
 
            hmap.put(a[i], i);
        }
 
        return (
            minDistance == Integer.MAX_VALUE
                ? -1
                : minDistance);
    }
 
    public static void main(String[] args) {
        int arr[] = new int[]{2,5,3,4,5,2};
        System.out.println( minimumDistance(arr));
        
    }
    
}

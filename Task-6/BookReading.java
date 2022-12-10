/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bookreading;

import java.util.Scanner;


public class BookReading {

       
    public static void main(String[] args) {
     Scanner s = new Scanner (System.in);
     int n = s.nextInt();
     int t = s.nextInt();
     int sum = 0;
     int counter = 0;
     int arr[] = new int [n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        for (int i = 0; i < n && sum < t;  i++) {
            counter ++;
            sum += 86400 - arr[i];
            
        }
        System.out.println(counter);
    }
    
}

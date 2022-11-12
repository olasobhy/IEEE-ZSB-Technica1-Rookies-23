/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package list_sum;

import java.util.Scanner;

/**
 *
 * @author olaso
 */
public class List_Sum {
    
    public static int sumFor(int arr[]) {
      
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
         
            sum += arr[i];
        }
        return sum;
    }
    
    public static int sumWhile(int arr[]) {
       
        int sum = 0;
        int i = 0;
        while (arr.length > i) {
           
            sum += arr[i];
            i++;
        }
        return sum;
    }
    
    public static int sumRecursion( int arr[] ,int i){
        if (arr.length == i){
            return 0;
        }
       return arr[i] + sumRecursion(arr ,++i);
               
    }
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }
        System.out.println(sumFor(arr));
        System.out.println(sumWhile(arr));
        System.out.println(sumRecursion(arr , 0));
    }
    
}

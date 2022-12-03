 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dublicateremoving;

import java.util.Scanner;


/**
 *
 * @author olaso
 */
public class DublicateRemoving {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //  Random R = new Random ();
       // int RandNum = (int)(Math.random()*1000);
           int n = 5;
           int i=0;
          boolean b = false;
         int arr[] = {1,1,2,3,4,4,5,6,7,7,8,9};
         int temp[] =new int[arr.length];
         int j=0;
          for ( i = 0; i < arr.length -1; i++) {
              
                 if (arr[i] != arr[i+1]){
                   temp[j] = arr[i];
                    j++;    }
                  
          }
          temp[j++] = arr[arr.length-1];
          for ( i = 0; i <j; i++) {
            System.out.println(temp[i]);
          }
    

    }
}
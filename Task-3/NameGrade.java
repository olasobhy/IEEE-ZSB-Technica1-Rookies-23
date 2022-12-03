/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package namegrade;

import java.util.Arrays;
import java.util.Scanner;

  /*class Student {
    String name ; 
      double grade;
  
  }*/
    public class NameGrade {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        double minIndex = 0;
        int min = 0;
        String nameArr[] = new String[n];
        double gradeArr[] = new double[n];
        
        
        
        for (int i = 0; i < n; i++) {
            nameArr[i] = s.next();    
            gradeArr[i] = s.nextDouble(); 
              
        }
          Arrays.sort(gradeArr);
          Arrays.sort(nameArr);
        
        for (int i = 0; i < n; i++) {
         if (gradeArr[min] > gradeArr[i])
             min = i;
        
        }
            
           System.out.println(nameArr[min]);

        for (int i = 2; i < n; i++) {
            if (gradeArr[1] == gradeArr[i]) {
                System.out.println(nameArr[i]);
            }

        }

    }
}

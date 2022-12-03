/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package volumecapacity;

import java.util.Scanner;

/**
 *
 * @author olaso
 */
public class VolumeCapacity {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           Scanner s = new Scanner (System.in);
       
            int n = s .nextInt();
            int Varr[]=new int [n];
            int Carr[] =new int [n];
            int sumV =0;
            int sumC =0;
            for (int i = 0; i < n; i++)
            {     Varr[i] = s.nextInt();
                  Carr[i] = s.nextInt();
                   sumV += Varr[i];
                   sumC += Carr[i];
            }
            

            if(sumC >= sumV)
                System.out.println("yes");
            else 
               System.out.println("no");
            }

        }

    
    


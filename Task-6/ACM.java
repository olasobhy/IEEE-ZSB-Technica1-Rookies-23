/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication185;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author olaso
 */
public class ACM {
    


 public static void main(String[] args) throws IOException{
     
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        String[] bin = new String[N];
        boolean[][] b = new boolean[N][M];
        for (int i=0; i < N; i++){
            bin[i] = br.readLine();
            for (int k=0; k < M; k++){
                if (bin[i].charAt(k) == '1')
                    b[i][k] = true;
                else
                    b[i][k] = false;
            }
        }
        int max = 0;
        for (int i=0; i < N; i++){
            for(int j=0; j < N; j++){
              
                int cnt = 0;
                if (i != j){
                    for (int k=0; k < M; k++){
                        if ((b[i][k] == true) || (b[j][k] == true)){
                            cnt++;
                        }
                    }
                    if (cnt > max){
                        max = cnt;
                    }
                }
                
            }
        }
        int res = 0;
        for (int i=0; i < N; i++){
            for(int j=0; j < N; j++){
               
                int cnt = 0;
                if (i != j){
                    for (int k=0; k < M; k++){
                        if ((b[i][k] == true) || (b[j][k] == true)){
                            cnt++;
                        }
                    }
                    if (cnt == max){
                        res++;
                    }
                }
                
            }
        }
        
        System.out.println(max);
        System.out.println(res/2);
        
    }
}
        
    

    
    


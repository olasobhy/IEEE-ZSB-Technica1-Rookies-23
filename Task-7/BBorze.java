/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package b.borze;

import java.util.Scanner;

/**
 *
 * @author olaso
 */
public class BBorze {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        String str = s.next();
        String replace = str.replace("--", "2").replace("-.", "1").replace(".", "0");
        System.out.println(replace);
    }
    
}

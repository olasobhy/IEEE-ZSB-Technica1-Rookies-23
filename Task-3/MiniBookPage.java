/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package minibookpage;

import java.util.Scanner;

/**
 *
 * @author olaso
 */
public class MiniBookPage {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        long page_num = s.nextLong();
        long tPage = s.nextLong();
        System.out.println(Math.min((page_num - tPage) / 2, (tPage - 0) / 2));

    }

}

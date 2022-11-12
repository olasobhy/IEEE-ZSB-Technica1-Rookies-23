/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package rectangleareaperimeter;

import java.util.Scanner;

public class RectangleAreaPerimeter {

    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        int length = s.nextInt();
        int width = s.nextInt();
        System.out.println(length*width);
        System.out.println((length+width)*2);
    }
    
}

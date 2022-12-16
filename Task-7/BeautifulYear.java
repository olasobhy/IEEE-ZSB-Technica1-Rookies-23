/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package beautifulyear;

import java.util.Scanner;

/**
 *
 * @author olaso
 */
public class BeautifulYear {

    static boolean check(int num) {
        String str = Integer.toString(num);
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        n++;
        while (true) {
            if (check(n)) {
                System.out.println(n);
                break;
            } else {
                n++;
            }
        }

    }

}

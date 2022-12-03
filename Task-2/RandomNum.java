/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package randomnum;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author olaso
 */
public class RandomNum {

    /**
     * public static void main(String[] args) {
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Random R = new Random();
        int hit = 0, miss = 0;
        int n = ((int) (Math.random() * 1000));
        System.out.println(n);
        //int n = R.nextInt(100, 999);
        int arr2[] = new int[3];
        arr2[0] = n % 10;
        n = n / 10;
        arr2[1] = n % 10;
        n = n / 10;
        arr2[2] = n % 10;

        int user_num = -1;
        if (n == user_num) {
            System.out.println("u guessed correct");
        } else {
            while (true) {

                user_num = s.nextInt();

                int arr1[] = new int[3];
                arr1[0] = user_num % 10;
                user_num = user_num / 10;
                arr1[1] = user_num % 10;
                user_num = user_num / 10;
                arr1[2] = user_num % 10;

                for (int i = 0; i < 3; i++) {
                    if (arr1[i] == arr2[i]) {
                        hit++;
                    }
                }

                for (int j = 0; j < 2; j++) {
                    if (arr1[j] == arr2[j + 1]) {
                        miss++;
                    }
                }

                System.out.println(hit + " hit " + miss + " miss ");

            }

        }
    }
}

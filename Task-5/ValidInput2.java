/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package validinput2;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author olaso
 */
public class ValidInput2 {
   public static boolean isValid(String s) {
        Stack<Character> stack= new Stack<>();
        for(char ch: s.toCharArray()){
            if(ch=='(')
                stack.push(')');
            else if(ch=='{')
                stack.push('}');
            else if(ch=='[')
                stack.push(']');
            else if(stack.isEmpty() || stack.pop()!=ch)
                return false;
        }
        return stack.isEmpty();
}
    public static void main(String[] args) {
         Scanner s = new Scanner(System.in);
        String str = s.next();
        
            System.out.println(isValid(str));
    }
    
}

/*
Demo of palindrome


Date: 23/03/2020/
 */

import java.util.Scanner;
/**
 *
 * @author Zaheen Kenji
 */
public class PalindromeCheker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int sum, num, tmp, r;
        
        System.out.print("Enter any number: ");
        num = input.nextInt();
        
        sum = 0;
        tmp = num;
        
        while(tmp!=0){
            
            r = tmp % 10;
            sum = sum * 10 + r;
            tmp = tmp/10;
        }
        
        if(sum==num){
        
            System.out.println("Palindrome");
        }
        else{
        
            System.out.println("Not a palindrome");
        }
    }
}

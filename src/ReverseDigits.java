/*
How to reverse a number

Date: 23/03/2020;
 */

import  java.util.Scanner;


/**
 *
 * @author Zaheen Kenji
 */
public class ReverseDigits {
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        
        int num, sum, tmp, r;
        
        sum = 0;
        
        System.out.print("Enter any number: ");
        
        num = input.nextInt();
        
        tmp = num;
        while(tmp!=0){
            
            r = tmp%10;
            sum = sum *10 + r;
            tmp = tmp/10;
            
        }
        
        System.out.println("Reversed: "+sum);
        
        
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *Fibonacci Demo
 * Date: 27/06/2022
 * @author Zahin
 */
import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        long a = 0, b = 1, sum = 0;
        int i, n;

        System.out.print("Enter N: ");
        n = input.nextInt();
        
        for(i = 1; i <= n; i++ ){
            
            sum = a+b;
            System.out.println(i + ". "+sum);
            
            a = b;
            b = sum;

        }
        
        
        
    }
}

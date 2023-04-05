/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * takes the value of N and
 * calculate the sum of following series 1^2*2 + 2^2*3 + 3^2*4 + 4^2*5 + ..... + to the n
 * @author Zahin
 */


import java.util.Scanner;

public class SumofSeries {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter N: ");
        int n = sc.nextInt();
        int k = 2, s = 0, sum = 0;
        for (int i = 1; i <= n; i++, k++) {
            
            //System.out.println(i+"^2*"+k);
            s = (i*i)*k;
            sum += s; 
            
        }
        System.out.println(sum);
        
    }
}

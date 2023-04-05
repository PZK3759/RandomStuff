/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * this program calculates the value of Sin(x) series given the X
 * @author Zahin
 */

import java.util.Scanner;
import java.lang.Math;

public class SinX {
    
    static double fact(double f){
        
        double fact=1;
        
        for (double i = f; i > 0; i--) {
            fact = fact*i;
        }
        
        return fact;
        
    }
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("X = ");
        double x = sc.nextFloat();
        
        double j = 1, sum = 0;
        
        System.out.println("Select Mode\nType 'R' for radian.\nType 'D' for degree");
        
        System.out.print("Mode = ");
        char mode = sc.next().charAt(0);
                
        if(mode == 'd' || mode == 'D'){
            x = x*(Math.PI/180);
            System.out.println("You've selected degree");
        }else{
            System.out.println("You've selected radian");
        }
        
        System.out.print("N = ");
        int n= sc.nextInt();
        
        for (int i = 0; i < n; i++, j+=2) {
            
            if(i%2 ==0){
                sum = sum+Math.pow(x, j)/fact(j);
            }
            else if(i%2 != 0){
                sum = sum-Math.pow(x, j)/fact(j);
            }
        }
        System.out.printf("Sin(%.0f)= %.5f\n",x, sum);
            
        
        
        
    }
}

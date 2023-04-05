/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * This programm will run and show keyboard inputs until the user types '0' (zero)
 * @author Zahin
 */

import java.util.Scanner;

public class Keyboard_Inputs {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int i = 1;
        
        
        while (true) {
            
            String s = sc.nextLine();
            
            if(s.equals("0")){
                break;
            }
            else{
                System.out.println("Input "+i+": "+s);
                i++;
            }
            
        }
        
        
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/* write a program for the described scenario
* Player 1 picks a number X and player 2 has to guess that number within X tries.
* for each wrong guess by player 2 the program prints "Wrong, N choices left!"
* if player 2 successfully guesses the number, the program outputs "Right, Player 2 wins"
* Otherwise after N wrong tries the program prints "Player 1 wins" */

/**
 *
 * @author Zahin
 */

import java.util.Scanner;

public class GuessGame {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int x, n, ni;

        System.out.print("Enter a number to be guessed: ");
        x = sc.nextInt();
        System.out.print("Enter how many tries player-2 gets: ");
        n = sc.nextInt();
        
        for (int i = n; i > 0; i--) {
            n--;
            System.out.print("Guess the number: ");
            ni = sc.nextInt(); // Player 2 guessed
            if (ni == x) {
                System.out.println("Right, Player-2 wins!");
                break;
            }
            else{
                System.out.println("Wrong,"+n+" Choices(s) left!");
            }
            if(n==0){
                System.out.println("Player-1 Wins!");
            }
        }
        
    }
}

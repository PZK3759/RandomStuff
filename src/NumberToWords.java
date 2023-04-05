/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * this program was generated by ChatGPT
 * @author Zahin
 */
        
import java.util.Scanner;
        
public class NumberToWords {
    
    private static final String[] units = {
        "", "one", "two", "three", "four", "five", "six", "seven",
        "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen",
        "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"
    };
    private static final String[] tens = {
        "",        // 0
        "",        // 1
        "twenty",  // 2
        "thirty",  // 3
        "forty",   // 4
        "fifty",   // 5
        "sixty",   // 6
        "seventy", // 7
        "eighty",  // 8
        "ninety"   // 9
    };

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Number of Test Cases: ");
        int k = scanner.nextInt();

        for (int i =0; i<k; i++){
            System.out.print("Enter a number: ");
            int n = scanner.nextInt();

            if (n < 0) {
                System.out.println("Number must be positive.");
            } else if (n == 0) {
                System.out.println("zero");
            } else {
                System.out.println(convertNumberToWords(n));
            }
        }

    }

    private static String convertNumberToWords(int n) {
        if (n < 0) {
            return "minus " + convertNumberToWords(-n);
        }

        if (n < 20) {
            return units[n];
        }

        if (n < 100) {
            return tens[n / 10] + ((n % 10 != 0) ? " " : "") + units[n % 10];
        }

        if (n < 1000) {
            return units[n / 100] + " hundred" + ((n % 100 != 0) ? " " : "") + convertNumberToWords(n % 100);
        }

        if (n < 1000000) {
            return convertNumberToWords(n / 1000) + " thousand" + ((n % 1000 != 0) ? " " : "") + convertNumberToWords(n % 1000);
        }

        if (n < 1000000000) {
            return convertNumberToWords(n / 1000000) + " million" + ((n % 1000000 != 0) ? " " : "") + convertNumberToWords(n % 1000000);
        }

        return convertNumberToWords(n / 1000000000) + " billion" + ((n % 1000000000 != 0) ? " " : "") + convertNumberToWords(n % 1000000000);
    }
}
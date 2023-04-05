/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Zahin
 */

import java.util.Scanner;

public class ExamGrade {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        for (int i = 1; i<=n; i++){

            double a, hw, ct, mt, tf, mt_p, tf_p, tm;

            System.out.print("Enter marks on Attendance: ");
            a = sc.nextDouble();
            System.out.print("Enter marks on Assignments: ");
            hw = sc.nextDouble();
            System.out.print("Enter marks on Class Tests: ");
            ct = sc.nextDouble();
            System.out.print("Enter marks on Midterms: ");
            mt = sc.nextDouble();
            System.out.print("Enter marks on Final Exam: ");
            tf = sc.nextDouble();

            System.out.println();

            mt_p = mt*0.6;
            tf_p = tf*0.4;

            tm = a+hw+ct+mt_p+tf_p;

            System.out.println("Student "+i+"'s Average is "+tm);

            if(tm > 90){
                System.out.println("Student "+i+" got A");
            }
            else if(86<=tm && tm <= 89){
                System.out.println("Student "+i+" got A-");
            }
            else if(82<= tm && tm <= 85){
                System.out.println("Student "+i+" got B+");
            }
            else if(78<=tm && tm<= 81){
                System.out.println("Student "+i+" got B+");
            }
            else if(74<=tm && tm<=77){
                System.out.println("Student "+i+" got B-");
            }
            else if(70<=tm && tm<=73){
                System.out.println("Student "+i+" got C+");
            }
            else if(66<=tm && tm<=69){
                System.out.println("Student "+i+" got C");
            }
            else if(62<=tm && tm<=65){
                System.out.println("Student "+i+" got C-");
            }
            else if(58<=tm && tm<=61){
                System.out.println("Student "+i+" got D+");
            }
            else if(55<=tm && tm<=57){
                System.out.println("Student "+i+" got D");
            }
            else if(tm<55){
                System.out.println("Student "+i+" has Failed the term");
            }
            System.out.println("\n");

        }
        
    }
}

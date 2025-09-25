package rvt;

import java.util.Scanner;

public class grade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write your grade: ");
        int grade = scanner.nextInt();

        if (grade < 0) {
            System.out.println("imposible!");
        }
        
        else if (grade < 50){
            System.out.println("Grade: failed");
        }

        else if (grade < 60){
            System.out.println("Grade: 1");
        }

        else if (grade < 70){
            System.out.println("Grade: 2");
        }

        else if (grade < 80){
            System.out.println("Grade: 3");
        }

        else if (grade < 90){
            System.out.println("Grade: 4");
        }

        else if (grade < 100){
            System.out.println("Grade: 5");
        }

        else if (grade > 100){
            System.out.println("Grade: incredible!");
        }
    }
    
}

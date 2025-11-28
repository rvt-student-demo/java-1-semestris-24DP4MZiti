package rvt;

import java.util.Scanner;

public class Average_of_three_numbers {
    public static void main(String[] ags){ 

        Scanner scanner = new Scanner(System.in);
        
        int summa;
    
        System.out.println("Give the first number:");
        int x = Integer.valueOf(scanner.nextLine());
        
        System.out.println("Give the second number:");
        int y = Integer.valueOf(scanner.nextLine());
        
        System.out.println("Give the third number:");
        int z = Integer.valueOf(scanner.nextLine());

        summa = x + y + z;
        double videjais = 1.0 * summa / 3;

        System.out.println("The average is " + videjais);

    }
}

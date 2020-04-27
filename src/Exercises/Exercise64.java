package Exercises;

import java.util.Scanner;

public class Exercise64 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter first number: ");
        int x = scanner.nextInt();
        System.out.println("Please enter first number: ");
        int y = scanner.nextInt();
        if ((25 < x) && (x < 75) && (25 < y) && (y < 75)) {
            if ((x / 10) == (y / 10)||(x % 10) == (y % 10)||(x / 10) == (y % 10)||(x % 10) == (y / 10)){
                System.out.println(true);
            }
            else System.out.println(false);
        }else  System.out.println("Please enter numbers from 25 to 75!");

    }
}

package Exercises;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Exercise65 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter first number:");
        int x = scanner.nextInt();
        System.out.println("Please enter first number:");
        int y = scanner.nextInt();
        if (x > y){ //int z = x / y;
            System.out.println("Remainder: " + (x - ((x / y) * y)));


        }else  if (x < y){ //int z = y / x;
            System.out.println("Remainder: " + (y - ((y / x) * x)));

        } else {
            System.out.println("Numbers are equal");
        }




    }
}

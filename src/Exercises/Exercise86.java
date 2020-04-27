package Exercises;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Exercise86 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter number: ");
        int count = 0;
        int n = scanner.nextInt();

       do {
           if (n % 2 == 0) {
               n = n / 2;
           } else n = (n * 3) + 1;
           count++;
           System.out.println(n + " " + count);
       } while (n != 1);
    }
}

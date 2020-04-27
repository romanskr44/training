package Exercises;

import java.sql.SQLOutput;

public class Exercise66 {
    public static void main(String[] args) {
        int sum = 0;
        int count = 0;
        for (int num = 2; num < 100000; num++) {
            boolean isPrime = true;
            for (int div = 2; div < num; div++) {
                if (num % div == 0) {
                    isPrime = false;
                    break;
                }
                if (isPrime) {
                    sum = sum + num;
                    count++;
                }
                 if (count == 100) {
                    System.out.println(sum + " " + count);
                    break;
                 }


            }

        }

    }
}










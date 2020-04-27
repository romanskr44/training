package Exercises;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ExerciseMethod2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input first number: ");
        double x = scanner.nextDouble();
        System.out.println("Please input second number: ");
        double y = scanner.nextDouble();
        System.out.println("Please input third number: ");
        double z = scanner.nextDouble();
        averNumber(x, y, z);
    }
    public static void averNumber(double x, double y, double z){
        double ave = 0;
        ave = (x + y + z)/3;
        System.out.println(ave);





    }

}

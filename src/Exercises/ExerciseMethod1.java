package Exercises;

import java.util.Scanner;

public class ExerciseMethod1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input first number: ");
        int x = scanner.nextInt();
        System.out.println("Please input second number: ");
        int y = scanner.nextInt();
        System.out.println("Please input third number: ");
        int z = scanner.nextInt();
        smallNumber(x, y, z);
    }



    private static void smallNumber(int x, int y, int z){
        if ((x < y)&&(x < z)){
            System.out.println( x + " is smallest number");
        }
        else if ((y < x)&&(y < z)) {
            System.out.println(y + " is smallest number");
        }
        else if ((z < x)&&(z < y)) {
            System.out.println(z + " is smallest number");
        } else{
            System.out.println("Please enter not equal numbers!");
        }


    }



}

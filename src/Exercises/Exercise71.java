package Exercises;

import java.util.Scanner;

public class Exercise71 {
    public static void main(String[] args){

        Scanner scanner= new Scanner(System.in);
        System.out.println("Please enter first string:");
        String str1 = scanner.nextLine();
        System.out.println("Please enter second string:");
        String str2 = scanner.nextLine();
        System.out.println(str1.substring(1) + str2.substring(1));




    }
}

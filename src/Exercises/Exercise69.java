package Exercises;

import java.util.Scanner;

public class Exercise69 {
    public static void main(String[] args){

        int number = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input string with even count letters: ");
        String init = scanner.nextLine();
        number =  init.length()/2;
        System.out.println(init.substring(0,number));



    }
}

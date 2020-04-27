package Exercises;

import java.util.Scanner;

public class Exercise61 {
    public static void main(String[] args){
        System.out.println("Please enter word for reverse");
        Scanner scanner = new Scanner(System.in);

        char[] input = scanner.nextLine().toCharArray();
        for(int i = input.length - 1; i >= 0;i-- ){
            System.out.print(input[i]);
        }
    }

}

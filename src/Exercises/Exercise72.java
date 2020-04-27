package Exercises;

import java.util.Scanner;

public class Exercise72 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter string: ");
        String str1 = scanner.nextLine();
        if (str1.length() < 3){
            System.out.println("###"); }
        else {System.out.println(str1.substring(0,3));
        }




    }
}

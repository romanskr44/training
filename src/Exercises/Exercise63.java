package Exercises;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Exercise63 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter first number: ");
        int x = scanner.nextInt();
        System.out.println("Please enter second number: ");
        int y = scanner.nextInt();
        if((x % 6) == (y % 6)) {
            if(x > y) {System.out.println(y);}
            else System.out.println(x);
        }
         else if (x > y){
            System.out.println("Bigger number " + x);
        }else if (x < y) {
            System.out.println("Bigger number " + y);
        }else  {
            System.out.println("Values are the same");
        }

            }

        }






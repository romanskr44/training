package Exercises;

import java.util.Scanner;

public class Exercise87 {
    public static void main(String[] args){
        int sum = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter you number: ");
        String  str = scanner.nextLine();
        char[] numStr = str.toCharArray();
        for(int i = 0; i < numStr.length; i++){
        sum += numStr[i] -'0' ;
        }
        System.out.println(sum);
        print_number(sum);
    }
    public static void print_number(int n){
        int x; int y; int z;
        String[] number = {"zero","one","two","three","four","five","six","seven","eight","nine"};
        if (n < 10){
            System.out.println(number[n]);
        }
        else if (n < 100){
            x = n / 10;
            y = n - x * 10;
            System.out.println(number[x] + " " + number[y]);
        }
        else{
            x = n / 100;
            y = (n - x * 100)/10;
            z = n - x * 100 - y * 10;
            System.out.println(number[x] + " " + number[y] + " " + number[z]);




        }



    }

}

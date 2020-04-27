package basics;


import java.util.Scanner;

public class Lab1 {
    public static void main(String[] arg){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter number: ");
        int n = scanner.nextInt();
        System.out.println(sum(n));
    }

    public static int sum(int n) {
        int sumury = 0;
        for(int i = 1; i <= n; i++){
           sumury = sumury + i;
        }

        return sumury;
    }
}

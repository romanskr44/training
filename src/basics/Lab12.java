package basics;

import java.sql.SQLOutput;

public class Lab12 {
    public static void main(String[] arg){

        System.out.println(fact(5));
    }

    public static int fact(int n){
        if (n == 0){
            return 1;
        }
        System.out.println(n);
        return (n*fact(n - 1));
    }
}

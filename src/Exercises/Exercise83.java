package Exercises;

public class Exercise83 {
    public static void main(String[] args){
        int[] array1 = {1, 3, -5, 4};
        int[] array2 = {1, 4, -5, -2};
        int[] array3 = new int[4];
        for(int i = 0; i < array1.length; i++){
            array3[i] =  (array1[i])*(array2[i]);
            System.out.print(" " + array3[i]);
    }}
}

package basics;

public class Lab123 {
    public static void main(String[] arg){

        int i = 0;
    int array[] = new int[6];
    array[0] = -5002;
    array[1] = 543;
    array[2] = -53;
    array[3] = 345;
    array[4] = -143;
    array[5] = 353;

       System.out.println("Min: " + minimum(array));
       System.out.println("Average: "+ average(array));
       System.out.println ("Max: " + maximum(array));

    }

    public static int minimum(int []array) {
        int minVal = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] <= minVal) {
                minVal = array[i];
            }
        }
        return minVal;
    }

    public static int maximum(int []array) {
        int maxVal = array[0];
        for (int i = 0; i < array.length;i++) {

            if (array[i] >= maxVal) {
                maxVal = array[i];
            }

        }
        return maxVal;
    }

    public static int average(int []array) {
        int sum = 0;

        int aveVal = 0;
        for(int i = 0; i < array.length; i++){
          sum = sum + array[i];

        }

        aveVal = sum / array.length;


        return aveVal;
    }
}
import java.util.Scanner;

public class arrayUtilities {

    public static void main(String[] args) {
    }
    public static void printArray(double[]  array){

    
    for (int i = 0; i<array.length; i++){
    Utilities.prn(array[i]);
    }
}
public static void printArray(char[]  array){

    
    for (int i = 0; i<array.length; i++){
    Utilities.prn(array[i]);
} 

} 

    public static void printArray(boolean[]  array){

    
    for (int i = 0; i<array.length; i++){
        Utilities.prn(array[i]);
}
    }

public static void printArray(int[]  array){

    
    for (int i = 0; i<array.length; i++){
        System.out.print(array[i] + " ");
}
}
public static void printArray(String[]  array){

    
    for (int i = 0; i<array.length; i++){
    Utilities.prn(array[i]);
}
}
public static void print2DArray(int[] array){
    for (int i=0; i<array.length; i++){
         Utilities.prn(array[i]);
    }
}

public static double[] createFilledArray(int size, double value){
    double[]array = new double[size];
    for (int i = 0;i <size; i++){
        array[i] = value;
    }
    return array;
}

public static float[] createFilledArray(int size, float value){
    float[]array = new float[size];
    for (int i = 0;i <size; i++){
        array[i] = value;
    }
    return array;
}

public static int[] createFilledArray(int size, int value){
    int[]array = new int[size];
    for (int i = 0;i <size; i++){
        array[i] = value;
    }
    return array;
}

public static long[] createFilledArray(int size, long value){
    long[]array = new long[size];
    for (int i = 0;i <size; i++){
        array[i] = value;
    }
    return array;
}

public static char[] createFilledArray(int size, char value){
    char[]array = new char[size];
    for (int i = 0;i <size; i++){
        array[i] = value;
    }
    return array;
}


public static boolean[] createFilledArray(int size, boolean value){
    boolean[]array = new boolean[size];
    for (int i = 0;i <size; i++){
        array[i] = value;
    }
    return array;
}

public static void swap(int[] array, int i, int j) {
    // Doesn't need to return anything. The swap will not reversed once the method exits.
    int temp = array[i];
    array[i] = array[j];
    array[j] = temp;
}

public static void swap(double[] array, int i, int j) {
    
}


/**
 * 
 * @param array
 * @param shift Negative is right shift, positive is left shift.
 */
public static void shift(int[] array, int shift) {
    if (shift > 0) {
        for (int i = 0; i < -shift; i++) {
            shiftLeft(array);
        }
    } else {
        for (int i = 0; i < shift; i++) {
            shiftRight(array);
        }
    }
}

private static void shiftLeft(int[] array) {
    if (array == null || array.length == 0) {
        return;
    }

    int temp = array[0];
    
    for (int i = 0; i < array.length - 1; i++) {
        array[i] = array[i + 1];
    }

    array[array.length - 1] = temp;
}

private static void shiftRight(int[] array) {
    if (array == null || array.length == 0) {
        return;
    }

    int temp = array[array.length - 1];
    
    for (int i = array.length - 1; i >= 1; i--) {
        array[i - 1] = array[i];
    }

    array[array.length - 1] = temp;
}

public static boolean isSorted(int[] array) {
    for (int i = 0; i < array.length - 1; i++) {
        if (array[i] > array[i + 1]) {
            return false;
        }
    }

    return true;
}

/**
 * Randomly permutes elements of given array.
 * 
 * @param <T>   Type of array.
 * @param array Array to be permuted.
 */
public static <T> void permute(T[] array) {

}

/**
 * Creates and returns array of consecutive numbers.
 * 
 * @param low  Lowest number in the array.
 * @param high Highest number in the array.
 * @return Array of consecutive numbers from low to high.
 */
public static int[] consecutiveIntsArray(int low, int high) {
    int num = high - low + 1;
    int[] array = new int[num];

    for (int i = 0; i < num; i++) {
        array[i] = i + low;
    }

    return array;
}

public static String[] toStringArray(int[] array) {
    String[] strings = new String[array.length];
    for (int i = 0; i < array.length; i++) {
        strings[i] = String.valueOf(array[i]);
    }

    return strings;
}



}

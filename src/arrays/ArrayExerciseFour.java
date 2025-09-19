package arrays;

import java.util.Arrays;
// Array must be execute using copy method
public class ArrayExerciseFour {

    public static void main(String[] args) {

        int [] numbers = {1,2,3,4,5,6}; // original Arrays

        int [] copyNumbers = new int [6]; // determine copy array for original

   //                         numbers       ,       index 0             ,    copyNumbers    ,       index 0               , 6
 //     System.arraycopy(name of original array, start to original index, name of copy array, start of copy array position, length)
        System.arraycopy(numbers, 0, copyNumbers, 0, 6);

        System.out.println(Arrays.toString(copyNumbers)); // Arrays.toString


    }
}

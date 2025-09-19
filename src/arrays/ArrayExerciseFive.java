package arrays;

import java.util.Arrays;

public class ArrayExerciseFive {

    public static void main(String[] args) {

        String[] cars = {"BMW","Mercedes","Supra","Mistubishi","Land Cruiser","Honda"};
//
//        String[] copyCars = new String[5];
//
//        System.arraycopy(cars, 1, copyCars , 1, 4);
//
//        System.out.println(Arrays.toString(copyCars));

        // direct copy -> Arrays.copyOfRange (original arrays, start of index, end of index + 1)
        String[] copyCars = Arrays.copyOfRange(cars,4,6);
        System.out.println(Arrays.toString(copyCars));
    }
}

package arrays;

public class ArrayExerciseThree {

    public static void main(String[] args) {
        // Initialize
        // first way
        String [] men = new String [5];
        men [0]= "Iron Men";
        men [1]= "Batman";
        men [2]= "Spiderman";
        men [3]= "Antman";
        men [4]= "Superman";
        // second way
        // infinity array
        // index ->           0        1          2            3       4
        // length ->          1        2          3            4       5
        String [] fruits = {"Apple","Orange","Watermelon","Coconut","Mango"};

        int [] numbers = {1,2,3,4,5,6,7,8};

        System.out.println(fruits[0]);
        System.out.println(numbers[0]);
    }
}

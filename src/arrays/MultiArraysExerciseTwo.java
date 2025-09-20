package arrays;
// Three dimension
public class MultiArraysExerciseTwo {

    public static void main(String[] args) {
        String [][][] names = { // array 1
                {   // array 2 of 1
                        {"Aung Aung","Mg Mg","Kyaw Kyaw"}, // array 3,1
                        {"Moe Moe","Su Su","Lin Lin"}// array 3,2
                },
                { // array 2 of 2
                        {"Zaw Zaw","Khin Khin"},
                        {"Soe Soe","Ko Ko"}
                },
                { // array 2 of 3
                        {"Pa Pa","Phoo Phoo"},
                        {"Zin Zin","Aye Aye"}
                }
        };
        System.out.println(names[1][0][0]);
    }
}

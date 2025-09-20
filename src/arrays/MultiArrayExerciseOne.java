package arrays;
// two dimension array
public class MultiArrayExerciseOne {

    public static void main(String[] args) {
        // multi dimension array [] []
        String[] person = {};

        // Multi
        String [][] people = {
                {"Mg Mg","Su Su"},
                {"Aung Aung","Kyaw Kyaw"},
                {"Ko Ko","Oo Oo","Daw Daw"}  // row
        };
        /*
        mg mg -> row 0,0
        aung aung -> row 1,0
        daw daw -> row 2,2
         */

        System.out.println(people[0][0]);
        System.out.println(people[1][1]);
        System.out.println(people[2][2]);
    }
}

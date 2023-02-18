import java.util.HashSet;
import java.util.Set;

public class SetReview {

    public static void main(String[] args) {

        // 1. Create a set
        Set<Student> mySet = new HashSet<>();

        // 2. add elements
        mySet.add(new Student(7, "Johnny"));
        mySet.add(new Student(8, "Freddy"));
        mySet.add(new Student(9, "Moe"));
        //added equals and hashcode method in Student class to prevent this object from being added
        mySet.add(new Student(9, "Moe"));

        System.out.println(mySet);

        Set<Integer> numSet = new HashSet<>();

        numSet.add(1);
        numSet.add(2);
        System.out.println("numSet = " + numSet);
        // boolean false because 2 already exists in numSet
        System.out.println(numSet.add(2));

        /**
         * Algorithm problem:
         * Find the first repeating char in a string
         * example string: "Java Developer"
         * output should be "a" because it is the first repeating char
         */

        System.out.println("first repeating char: " + firstRepeatingChar("Java Developer"));

    }

    public static Character firstRepeatingChar(String str){
        // 1. Create a HashMap
        Set<Character> chars = new HashSet<>();
        // 2. iteration
        for (Character ch : str.toCharArray()) {
            if (!chars.add(ch)){
                // 3. return char if add returns false
                return ch;
            }
        }
        return null;
    }




}

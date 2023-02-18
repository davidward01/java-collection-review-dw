import java.util.*;

public class ArrayListReview {

    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();

        students.add(new Student(1, "Jose"));
        students.add(new Student(2, "Sayed"));
        students.add(new Student(3, "Nick"));
        students.add(new Student(4, "Ronnie"));

        System.out.println(students);

        System.out.println("Printing with for i loop");

        // iteration on ArrayLists

        // 1. legacy for loop with get(index)
        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i));
        }

        // 2. iterator
        Iterator iter = students.listIterator();

        // forward iteration
        System.out.println("Printing with forward Iterator");

        while (iter.hasNext()) {
            System.out.println(iter.next());
        }

        // backwards iteration
        System.out.println("Printing with backwards Iterator");

        while (((ListIterator<?>) iter).hasPrevious()) {
            System.out.println(((ListIterator<?>) iter).previous());
        }


        // 3. for each loop (enhanced for loop)
        System.out.println("Printing with for each loop");

        for (Student student : students) {
            System.out.println(student);
        }

        // 4. lambda expression
        System.out.println("Printing with lambda expression");
        students.forEach(student -> System.out.println(student));
//        students.forEach(System.out::println);


    }

}

import java.util.LinkedList;

public class day10_ex {

    static class Student {
        String name;
        int regNo;
        int marks;

        Student(String name, int regNo, int marks) {
            this.name = name;
            this.regNo = regNo;
            this.marks = marks;
        }
    }

    static void removeStudent(LinkedList<Student> students) {
        System.out.println("Removed : " + students.removeFirst().name);
    }

    static void updateStudent(LinkedList<Student> students) {
        for (Student s : students) {
            if (s.name.equals("Raja")) {
                s.marks = 85 ;
            }
        }
    }

    public static void main(String[] args) {

        LinkedList<Student> students = new LinkedList<>();


        students.add(new Student("Ram", 852, 96));
        students.add(new Student("Raja", 853, 65));
        students.add(new Student("Raji", 854, 82 ));
        students.add(new Student("Rekka", 855, 63));
        students.add(new Student("Ravi", 856, 91));


        removeStudent(students);


        updateStudent(students);


        System.out.println("\nStudent Details");
        for (Student s : students) {
            System.out.println(
                    s.name + " " +
                            s.regNo + " " +
                            s.marks + " "
            );
        }
    }
}

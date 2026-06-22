public class Day14 {
    static class Student {
        String name;
        int age;
        String dob;
        int regNo;

        Student(Builder builder) {
            this.name = builder.name;
            this.age = builder.age;
            this.dob = builder.dob;
            this.regNo = builder.regNo;
        }

            static class Builder {
                private String name;
                private int age;
                private String dob;
                private int regNo;

                public Builder name(String nameValue) {
                    this.name = nameValue;
                    return this;
                }

                public Builder age(int ageValue) {
                    this.age = ageValue;
                    return this;
                }

                public Builder dob(String dobValue) {
                    this.dob = dobValue;
                    return this;
                }

                public Builder regNo(int regNoValue) {
                    this.regNo = regNoValue;
                    return this;
                }

                public Student build() {
                    return new Student(this);
                }
            }
        }

        static void main() {
            Student student = new Student.Builder()
                    .name("Sajitha")
                    .age(18)
                    .dob("31/05/2008")
                    .regNo(789456)
                    .build();
            System.out.println(student.name);
            System.out.println(student.age);
            System.out.println(student.dob);
            System.out.println(student.regNo);

        }
    }


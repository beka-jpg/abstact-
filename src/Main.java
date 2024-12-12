import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        University university = new University();
        College college = new College();
        School school = new School();

        Student[] students = new Student[10];

        students[0] = new Student(
            "student00",
                "surnameStudent00",
                true,
                LocalDate.of(2015, 9, 1),
                school
        );

        students[1] = new Student(
                "student01",
                "surnameStudent01",
                false,
                LocalDate.of(2020, 9, 01),
                college
        );
        students[2] = new Student(
                "student02",
                "surnameStudent02",
                false,
                LocalDate.of(2018, 01, 30),
                university
        );
        students[3] = new Student(
                "student03",
                "surnameStudent03",
                true,
                LocalDate.of(2020, 12, 30),
                university
        );
        students[4] = new Student(
                "student04",
                "surnameStudent04",
                true,
                LocalDate.of(2023, 9, 7),
                university
        );
        students[5] = new Student(
                "student05",
                "surnameStudent05",
                false,
                LocalDate.of(2024, 9, 10),
                university
        );
        students[6] = new Student(
                "student06",
                "surnameStudent06",
                true,
                LocalDate.of(2016, 9, 1),
                school
        );
        students[7] = new Student(
                "student07",
                "surnameStudent07",
                false,
                LocalDate.of(2019, 9, 01),
                school
        );
        students[8] = new Student(
                "student08",
                "surnameStudent08",
                false,
                LocalDate.of(2023, 01, 15),
                college
        );

        students[9] = new Student(
                "student09",
                "surnameStudent09",
                false,
                LocalDate.of(2014, 9, 01),
                school
        );



    }
}

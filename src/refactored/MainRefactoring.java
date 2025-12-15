package refactored;

public class MainRefactoring {

    public static void main(String[] args) {

        double[] grades = {12.5, 9.0, 14.0};

        Student student = new Student(
                1,
                "Imene Amirat",
                "imene@etu.umontpellier.fr",
                grades
        );

        StudentManager manager = new StudentManager();

        manager.printReport(student);
        manager.save(student);
    }
}


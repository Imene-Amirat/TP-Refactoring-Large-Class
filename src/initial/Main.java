package initial;

public class Main {
    // Test method
    public static void main(String[] args) {
        double[] grades = {12.5, 9.0, 14.0};
        StudentManager student =
                new StudentManager(1, "Imene", "imene@test.com", grades);

        student.printReport();
    }
}

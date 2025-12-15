package refactored;

public class StudentService {

    public double calculateAverage(Student student) {
        double sum = 0;
        for (double g : student.getGrades()) {
            sum += g;
        }
        return sum / student.getGrades().length;
    }

    public boolean hasPassed(Student student) {
        return calculateAverage(student) >= 10;
    }

    public boolean validateEmail(Student student) {
        return student.getEmail() != null && student.getEmail().contains("@");
    }
}


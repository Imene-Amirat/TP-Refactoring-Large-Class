package refactored;

public class StudentManager {

    private StudentService service = new StudentService();

    public void printReport(Student student) {
        System.out.println("===== Student Report =====");
        System.out.println("ID: " + student.getId());
        System.out.println("Name: " + student.getName());
        System.out.println("Email valid: " + service.validateEmail(student));
        System.out.println("Average: " + service.calculateAverage(student));
        System.out.println("Status: " + (service.hasPassed(student) ? "Passed" : "Failed"));
    }

    public void save(Student student) {
        System.out.println("Saving student '" + student.getName() + "' to file...");
    }
}


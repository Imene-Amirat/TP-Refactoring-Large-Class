package initial;

/*
 * Code smell: Large Class
 *
 * This class handles multiple responsibilities:
 *  - student data management
 *  - business logic (average calculation)
 *  - validation
 *  - presentation (printing)
 *
 * This violates the Single Responsibility Principle (SRP).
 *
 * Expected refactoring:
 *  - Extract Class
 */

public class StudentManager {

    private int id;
    private String name;
    private String email;
    private double[] grades;

    public StudentManager(int id, String name, String email, double[] grades) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.grades = grades;
    }

    // Business logic
    public double calculateAverage() {
        double sum = 0;
        for (double g : grades) {
            sum += g;
        }
        return sum / grades.length;
    }

    public boolean hasPassed() {
        return calculateAverage() >= 10;
    }

    // Validation
    public boolean validateEmail() {
        return email != null && email.contains("@");
    }

    // Presentation
    public void printReport() {
        System.out.println("===== Student Report =====");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Email valid: " + validateEmail());
        System.out.println("Average: " + calculateAverage());
        System.out.println("Status: " + (hasPassed() ? "Passed" : "Failed"));
    }


}


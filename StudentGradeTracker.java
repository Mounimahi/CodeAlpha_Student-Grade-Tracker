import java.util.ArrayList;
import java.util.Scanner;

public class StudentGradeTracker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // ArrayLists to store student names and grades
        ArrayList<String> studentNames = new ArrayList<>();
        ArrayList<Integer> grades = new ArrayList<>();

        // Input student data
        System.out.println("Enter the number of students:");
        int numberOfStudents = scanner.nextInt();
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("Enter the name of student " + (i + 1) + ":");
            String name = scanner.next();
            studentNames.add(name);

            System.out.println("Enter the grade for " + name + ":");
            int grade = scanner.nextInt();
            grades.add(grade);
        }

        // Calculate average, highest, and lowest grades
        int total = 0;
        int highest = grades.get(0);
        int lowest = grades.get(0);

        for (int grade : grades) {
            total += grade;
            if (grade > highest) highest = grade;
            if (grade < lowest) lowest = grade;
        }

        double average = (double) total / grades.size();

        // Display results
        System.out.println("\nGrade Summary:");
        System.out.println("Students and their grades:");
        for (int i = 0; i < studentNames.size(); i++) {
            System.out.println(studentNames.get(i) + ": " + grades.get(i));
        }

        System.out.println("\nAverage grade: " + average);
        System.out.println("Highest grade: " + highest);
        System.out.println("Lowest grade: " + lowest);

        scanner.close();
    }
}
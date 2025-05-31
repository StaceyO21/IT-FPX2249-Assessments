package org.example.assessment10;

import org.example.assessment9.Course;

import java.util.Scanner;

public class U10A1_OOConsoleRegisterForCourse {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        Course[] courses = {
                new Course("IT1006", 6),
                new Course("IT4782", 3),
                new Course("IT4789", 3),
                new Course("IT4079", 6),
                new Course("IT2230", 3),
                new Course("IT3345", 3),
                new Course("IT2249", 6)
        };

        Course[] registeredCourses = new Course[3];
        int totalCredit = 0;
        String yesOrNo = "";
        int registeredCount = 0;

        do {
            int choice = getChoice(courses);

            // Validation
            if (choice < 1 || choice > courses.length) {
                System.out.println("**Invalid** - Not a valid course choice.");
                continue;
            }

            Course selectedCourse = courses[choice - 1];

            if (alreadyRegistered(selectedCourse, registeredCourses)) {
                System.out.println("**Invalid** - You have already registered for " + selectedCourse.getCourseCode());
                continue;
            }

            if (totalCredit + selectedCourse.getCreditHours() > 9) {
                System.out.println("**Invalid** - You cannot register for more than 9 credit hours.");
                continue;
            }

            // Register course
            registeredCourses[registeredCount++] = selectedCourse;
            totalCredit += selectedCourse.getCreditHours();
            System.out.println("Registration Confirmed for course " + selectedCourse.getCourseCode());

            // Display summary
            WriteCurrentRegistration(registeredCourses, totalCredit);

            // Ask to try again
            if (registeredCount < 3 && totalCredit < 9) {
                System.out.print("\nDo you want to try again? (Y/N): ");
                yesOrNo = input.next().toUpperCase();
            } else {
                System.out.println("You have reached the course or credit limit.");
                break;
            }

        } while (yesOrNo.equals("Y"));

        System.out.println("Thank you for registering with us.");
    }

    public static int getChoice(Course[] courses) {
        System.out.println("\nType the number inside the [] to register for a course:");
        for (int i = 0; i < courses.length; i++) {
            System.out.println("[" + (i + 1) + "] " + courses[i].getCourseCode() +
                    " (" + courses[i].getCreditHours() + " credit hours)");
        }
        System.out.print("Enter your choice: ");
        return input.nextInt();
    }

    public static boolean alreadyRegistered(Course course, Course[] registeredCourses) {
        for (Course c : registeredCourses) {
            if (c != null && c.getCourseCode().equals(course.getCourseCode())) {
                return true;
            }
        }
        return false;
    }

    public static void WriteCurrentRegistration(Course[] registeredCourses, int creditHours) {
        System.out.print("Current course registration: { ");
        boolean first = true;
        for (Course c : registeredCourses) {
            if (c != null) {
                if (!first) System.out.print(", ");
                System.out.print(c.getCourseCode());
                first = false;
            }
        }
        if (first) System.out.print("none");
        System.out.println(" }");
        System.out.println("Total registered credit hours: " + creditHours);
    }
}

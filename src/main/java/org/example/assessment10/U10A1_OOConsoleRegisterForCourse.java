package org.example.assessment10;

import org.example.assessment9.Course;

import java.util.Scanner;

public class U10A1_OOConsoleRegisterForCourse {

    public static void main(String[] args) {
        // creating the courses array that holds the course objects
        Course[] courses = {
                new Course("IT1006", 6),
                new Course("IT4782", 3),
                new Course("IT4789", 3),
                new Course("IT4079", 6),
                new Course("IT2230", 3),
                new Course("IT3345", 3),
                new Course("IT2249", 6),
        };

        // user selects a course
        int choice = getChoice(courses);

        // get the selected course and credit
        Course[] registeredCourses = { courses[choice - 1] };
        int totalCredits = registeredCourses[0].getCreditHours();

        // registration summary
        WriteCurrentRegistration(registeredCourses, totalCredits);
    }

    // loops through the courses array to display the objects
    public static int getChoice(Course[] courses) {
        Scanner input = new Scanner(System.in);
        System.out.println("Type the number inside the [] to register for a course");

        for (int i = 0; i < 7; i++) {
            System.out.println("[" + (i + 1) + "]" + courses[i].getCourseCode() + "(" + courses[i].getCreditHours() + ")");
        }
        System.out.println("Enter your course choice: ");

        return input.nextInt();
    }

    // prints the list of courses that are registered in the specified format requested
    // also prints the total credit hours
    public static void WriteCurrentRegistration(Course[] registeredCourses, int creditHours) {

        System.out.println("Current course registration: { ");
        for (int i = 0; i < registeredCourses.length; i++) {
            System.out.println(registeredCourses[i].getCourseCode());
            if (i < registeredCourses.length - 1) {
                System.out.println(" , ");
            }
        }
        System.out.println(" } ");
        System.out.println("Total registered credit hours: " + creditHours);
    }
}



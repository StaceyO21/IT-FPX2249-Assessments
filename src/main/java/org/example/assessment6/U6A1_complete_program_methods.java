package org.example.assessment6;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class U6A1_complete_program_methods {

    public static String courseChoice;
    public static Set<String> registeredCourses = new HashSet<>();

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Teacher's Copy");

        String tryAgain;

        int choice;
        do {
            // print course information
            System.out.println("Type the number inside the [] to register for the course\n" +
                    "[1] IT4782\n" +
                    "[2] IT4784\n" +
                    "[3] IT4786\n" +
                    "[4] IT4789\n" +
                    "[5] IT2230\n" +
                    "[6] IT3345\n" +
                    "[7] IT3349\n" +
                    "Enter your choice: ");


            // get user input
            choice = input.nextInt();

            String courseChoice = getCourseCode(choice);
            // validate user choice
            if (registeredCourses.size() >= 3){
                System.out.println("You can not register for more than 9 credit hours."); // no more than 3 courses registered
            } else if (registeredCourses.contains(courseChoice)){
                System.out.println("You have already registered for this " + courseChoice + " course."); // can not register for the same course more than once
            } else if (choice < 1 || choice > 7) {
                System.out.println("**Invalid** - Your selection of is not a recognized course."); // user choice has to be an available course selection
            } else {
                registeredCourses.add(courseChoice); // if all choices pass then they get added to course registration set
            }

            System.out.println("Current course registration: { " + String.join(", ", registeredCourses) + " }");

            // ask if user would like to try again
            System.out.println("Do you want to try again? (Y|N)? : ");
            tryAgain = input.next();

        } while (tryAgain.equalsIgnoreCase("y"));
        System.out.println("Thank you for using course registration.");

    }


    public static String getCourseCode(int choice) {
        // switch statement to determine users choice to the course number
        switch (choice) {
            case 1: return "IT4782";
            case 2: return "IT4784";
            case 3: return "IT4786";
            case 4: return "IT4789";
            case 5: return "IT2230";
            case 6: return "IT3345";
            case 7: return "IT3349";
            default: return "Unknown"; // this shouldn't happen if validated
        }
    }
}
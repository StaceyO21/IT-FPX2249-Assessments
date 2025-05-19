package org.example.assessment6;

import java.util.Scanner;

public class U6A1_complete_program_methods {

    public static void printCourseNumber() {
        System.out.println("Teacher's Copy");
        Scanner input = new Scanner(System.in);

        String courseChoice;
        int choice = input.nextInt();
        System.out.println("Type the number inside the [] to register for the coure" +
                "[1] IT4782" +
                "[2] IT4784" +
                "[3] IT4786" +
                "[4] IT4789" +
                "[5] IT2230" +
                "[6] IT3345" +
                "[7] IT3349" +
                "Enter your choice: " + choice);


        if (choice == 1) {
            courseChoice = "IT4782";
        } else if (choice == 2) {
            courseChoice = "IT4784";
        } else if (choice == 3) {
            courseChoice = "IT4786";
        } else if (choice == 4) {
            courseChoice = "IT4789";
        } else if (choice == 5) {
            courseChoice = "IT2230";
        } else if (choice == 6) {
            courseChoice = "IT3345";
        } else {
            courseChoice = "IT3349";
        }
        System.out.println("Registration Confirmed for course " + courseChoice);
        System.out.println("Current course registration: {" + courseChoice + "}" );
    }
}
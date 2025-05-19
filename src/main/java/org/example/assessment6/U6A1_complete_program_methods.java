package org.example.assessment6;

import java.util.Scanner;

public class U6A1_complete_program_methods {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Teacher's Copy");

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
        int choice = input.nextInt();

        //validate choice
        if(choice < 1 || choice > 7){
            System.out.println("**Invalid** - Your selection of is not a recognized course.");
            return;
        }

        String courseChoice = getCourseCode(choice);

        System.out.println("Registration Confirmed for course " + courseChoice);
        System.out.println("Current course registration: {" + courseChoice + "}" );
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
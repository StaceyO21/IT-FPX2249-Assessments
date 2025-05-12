package org.example.assessment4;

import java.util.Random;
import java.lang.System;
import java.util.Scanner;

public class U4A1_ValidateCourseCode {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a course code: ");
        String courseCode = scanner.nextLine();

        validateCoursecode(courseCode);

    }


    private static void validateCoursecode(String code) {
        if (code.length() != 6) {
            System.out.println("Invalid course code: Must be 6 characters long");
            return;
        }

        char firstChar = code.charAt(0);
        if (!(firstChar == 'I' || firstChar == 'i')) {
            System.out.println("Invalid course code: First character must be the letter I");
            return;
        }

        char secondChar = code.charAt(1);
        if (!(secondChar == 'T' || secondChar == 't')) {
            System.out.println("Invalid course code: Second character must be the letter T");
            return;
        }

        for (int i = 2; i < 6; i++) {
            char digit = code.charAt(i);
            if(!Character.isDigit(digit)) {
                System.out.println("Invalid course code: Characters 3-6 must be digits (0-9)");
                return;
            }

        }

            System.out.println("Course code is valid");
    }
}

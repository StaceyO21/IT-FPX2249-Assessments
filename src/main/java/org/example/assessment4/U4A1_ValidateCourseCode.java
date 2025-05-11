package org.example.assessment4;

import java.util.Random;
import java.lang.System;
import java.util.Scanner;

public class U4A1_ValidateCourseCode {

    public static void main(String[] args) {
        System.out.println("Enter a course code: ");

        Random random = new Random();

        String courseLetter = "IT";
        String courseCode = courseLetter.toUpperCase();

        for (int i = 0; i < 4; i++) {
            int digit = random.nextInt(10);
            courseCode += digit;
        }
        System.out.println("Course Code: " + courseCode);


        validateCoursecode(courseCode);

    }


    private static void validateCoursecode(String code) {
        if (code.length() != 6) {
            System.out.println("Invalid course code: Must be 6 characters long");
        }
    }
}

package org.example.assessment10;

import org.example.assessment9.Course;

public class U10A1_OOConsoleRegisterForCourse {

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

        for (int i = 0; i < 7; i++) {
            System.out.println("[" + (i + 1) + "]" + courses[i].getCourseCode + "(" + courses[i].getCreditHours + ")");
        }

        public static String currentRegistration(Course[] courses, int creditHours){


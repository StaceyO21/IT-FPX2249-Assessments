package org.example.assessment9;

public class U9A1_DefineClassInstantiateObj {

    public static void main(String[] args) {
        System.out.println("Teacher's Copy");
        System.out.println("Course objects each have a code (e.g. IT1004) and credit hours (e.g. 6)");
        System.out.println("the number inside the [] is the display number order");
        System.out.println("The number inside the [] is the credit hours for the courses");

        Course[] courses = {
                new Course ("IT1006", 6),
                new Course ("IT4782", 3),
                new Course ("IT4789", 3),
                new Course ("IT4079", 6),
                new Course ("IT2230", 3),
                new Course ("IT3345", 3),
                new Course ("IT2249", 6),
        };
        for(int i = 0; i < 7; i++){
            System.out.println("[" + (i + 1) +"]" + courses[i].getCourseCode() + " (" courses[i].getCreditHours() + ")");
        }
    }
}

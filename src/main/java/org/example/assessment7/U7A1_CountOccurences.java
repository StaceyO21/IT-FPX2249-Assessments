package org.example.assessment7;

import java.util.Scanner;

public class U7A1_CountOccurences {

        public static int[] numbers = new int[7];  //array of numbers user inputs

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Teacher's Copy");

        System.out.println("Enter 7 integers: ");
        int userInput = input.nextInt();  //accept user numbers

        for (int i = 0; i < 7; i++){
            numbers[i] = input.nextInt();  //add user's numbers to the array
        }

}

package org.example.assessment7;

import java.util.Scanner;

public class U7A1_CountOccurences {

        public static int[] numbers = new int[7]; //array of numbers user inputs

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Teacher's Copy");

        System.out.println("Enter 7 integers: ");

        for (int i = 0; i < 7; i++) {
            numbers[i] = input.nextInt();  //add user's numbers to the array
        }

        int n = numbers.length;
        countFreq(numbers, n);
    }

    private static void countFreq(int[] numbers, int n) {

        boolean visited[] = new boolean[n];

        for (int i = 0; i < n; i++) {
            if (visited[i] == true)
                continue;

            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (numbers[i] == numbers[j]) {
                    visited[j] = true;
                    count++;
                }
            }
            System.out.println("Number " + numbers[i] + " occurs " + count + " times");
        }
    }

}

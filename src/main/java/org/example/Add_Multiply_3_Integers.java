package org.example;

import java.util.Scanner;

public class Add_Multiply_3_Integers {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.println("Enter the first integer: ");
            int num1 = input.nextInt();

            System.out.println("Enter the second integer: ");
            int num2 = input.nextInt();

            System.out.println("Enter the third integer: ");
            int num3 = input.nextInt();

            int sum = (num1 + num2 + num3);
            int product = (num1 * num2 * num3);

            System.out.println("The sum of three integers = " + sum);
            System.out.println("The product fo three integers = " + product);
        }

    }



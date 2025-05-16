package org.example.assessment5;

import java.util.Scanner;

public class U5A1_HighestAndLowestFiveIntegers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Teacher's Copy");
        System.out.print("Enter 5 seperate integers: ");

        int[] nums = new int[]{scanner.nextInt()};

        int lowestNum = nums[0];
        int highestNum = nums[0];

        for (int num : nums){
            if (lowestNum > num) {
                lowestNum = num;
            }
            System.out.println("Lowest integer is " + lowestNum);

            for (int num2 : nums) {
                if (highestNum < num2) {
                    highestNum = num2;
                }
                System.out.println("Highest integer is " + highestNum);
            }
        }


    }

}

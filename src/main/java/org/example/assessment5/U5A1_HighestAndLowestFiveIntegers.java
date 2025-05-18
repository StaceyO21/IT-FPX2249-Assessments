package org.example.assessment5;

import java.util.Scanner;

public class U5A1_HighestAndLowestFiveIntegers {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Teacher's Copy");
        System.out.print("Enter 5 separate integers: ");

        // initialize array
        int[] nums = new int[5];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = input.nextInt();
        }
        System.out.println("Lowest integer is " + getMinValue(nums));
        System.out.println("Highest integer is " + getMaxValue(nums));
    }
        // method to get max value
        public static int getMaxValue(int[] nums) {
            int maxValue = nums[0];
            for (int i = 1; i < nums.length; i++){
                if (nums[i] > maxValue){
                    maxValue = nums[i];
                }
            }
            return maxValue;
        }

        //get the min value
    public static int getMinValue(int[] nums) {
        int minValue = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < minValue) {
                minValue = nums[i];
            }
        }
        return minValue;
    }


        }






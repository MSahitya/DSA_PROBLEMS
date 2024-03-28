package org.example.Arrays;

public class ContainerWithMostWater {
    public static void main(String[] args) {
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        int maxArea = 0;
        int left = 0;
        int right = height.length - 1;

        while (left < right) {
            // Calculate the current area
            int currentArea = Math.min(height[left], height[right]) * (right - left);
            // Update max area if the current area is greater
            maxArea = Math.max(maxArea, currentArea);

            // Move the pointer of the smaller height towards the center
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        System.out.println("The maximum area of water that can be contained is: " + maxArea);
    }
}

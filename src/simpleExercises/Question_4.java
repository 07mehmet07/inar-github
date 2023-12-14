package simpleExercises;

import java.util.Arrays;

public class Question_4 {
    public static void main(String[] args) {
        int[] nums = {1, 4, 1, 5, 5, 4, 1};
        System.out.println(Arrays.toString(fix45(nums)));

    }

    private static int[] fix45(int[] nums) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 4) {
                for (int j = index; j < nums.length; j++) {
                    if (nums[j] == 5) {
                        int temp = nums[i + 1];
                        nums[i + 1] = nums[j];
                        nums[j] = temp;
                        index = i + 2;
                        break;
                    }

                }
            }
        }
        return nums;
    }
}

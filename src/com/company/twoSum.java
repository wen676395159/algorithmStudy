package com.company;

import java.util.HashMap;

public class twoSum {
    public int[] twoSum(int[] nums, int target) {
        //[2,1,2,1] 2
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {

            int temp = target - nums[i];
            if (hm.containsKey(temp) && hm.get(temp) != i) {
                return new int[]{hm.get(temp), i};
            }
            hm.put(nums[i], i);
        }
        return new int[2];
    }
}

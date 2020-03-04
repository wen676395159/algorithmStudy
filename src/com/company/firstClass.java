package com.company;

class Solution {
    //知识点，双指针算法。算法前提条件，数组是有序的。此算法可以快速的将数组中的重复内容去除
    public int removeDuplicates(int[] nums) {
        int length =0;
        if(nums.length >0){
            int slowPoint = 0;
            for(int fastPoint =1;fastPoint < nums.length;fastPoint++){
                if(nums[slowPoint] == nums[fastPoint]){
                    continue;
                }
                else{
                    nums[slowPoint+1] = nums[fastPoint];
                    slowPoint = slowPoint + 1;
                }
            }
            length = slowPoint + 1;
        }
        return length;
    }
}

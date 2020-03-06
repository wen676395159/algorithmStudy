package com.company;

class Solution {
    //知识点，双指针算法。算法前提条件，数组是有序的。此算法可以快速的将数组中的重复内容去除
//    public int removeDuplicates(int[] nums) {
//        int length =0;
//        if(nums.length >0){
//            int slowPoint = 0;
//            for(int fastPoint =1;fastPoint < nums.length;fastPoint++){
//                if(nums[slowPoint] == nums[fastPoint]){
//                    continue;
//                }
//                else{
//                    nums[slowPoint+1] = nums[fastPoint];
//                    slowPoint = slowPoint + 1;
//                }
//            }
//            length = slowPoint + 1;
//        }
//        return length;
//    }
    public int removeDuplicates(int[] nums) {
        int s = 0;
        for (int f =1;f < nums.length;f++){
            if ( nums[s] != nums[f] ){
                nums[s+1] = nums[f];
                s = s+1;
            }
        }
        return s+1;
    }
}

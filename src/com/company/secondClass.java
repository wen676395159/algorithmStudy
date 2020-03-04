package com.company;

import java.util.Arrays;

class Solution2 {
    public void rotate(int[] nums, int k) {
        if (nums.length > k-1){
            int[] resultReverseAll = reverse(nums,0,nums.length-1);
            int[] resultReverseHead = reverse(resultReverseAll,0,k-1);
            int[] resultReverseFoot = reverse(resultReverseHead,k,resultReverseHead.length-1);
            nums = resultReverseFoot;
        }

    }

    private int[] reverse(int[] nums, int startno, int endno) {
        while (startno < endno){
            int temp = nums[startno];
            nums[startno] = nums[endno];
            nums[endno] = temp;
            startno++;
            endno--;

        }
        return  nums;
    }
}
package com.company;

class Solution2 {
    public void rotate2(int[] nums, int k) {
        int[] temp = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            temp[(i+k) % nums.length] = nums[i];
        }
        for (int j = 0; j < temp.length; j++) {
            nums[j] = temp[j];
        }
    }

    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        int[] resultReverseAll = reverse(nums,0,nums.length-1);
        int[] resultReverseHead = reverse(resultReverseAll,0,k-1);
        int[] resultReverseFoot = reverse(resultReverseHead,k,resultReverseHead.length-1);
        nums = resultReverseFoot;

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
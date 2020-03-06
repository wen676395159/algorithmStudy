package com.company;

import java.util.Arrays;

public class Main {


    public static void main(String[] args) {
//	    // 第一课
//        int[] testArray ={1,1,2};
//        Solution solution = new Solution();
//        System.out.println(solution.removeDuplicates(testArray));
//        System.out.println(Arrays.toString(testArray));
//        //第二课
//        Solution2 solution2 = new Solution2();
//        int[] testArray = {1,2,3,5,7,8};
//        solution2.rotate2(testArray,2);
//        System.out.println(Arrays.toString(testArray));
        //第四课
        mergeSortedArray me = new mergeSortedArray();
        int[] nums1 = {1,2,3,0,0,0};
        int m = 3;
        int n = 3;
        int[] nums2 = {2,5,6};
        me.merge(nums1,m,nums2,n);
        System.out.println(Arrays.toString(nums1));

    }

}

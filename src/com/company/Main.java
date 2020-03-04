package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
//	    // 第一课
//        int[] testArray ={1,2,2,3,5,5,6};
//        Solution solution = new Solution();
//        System.out.println(solution.removeDuplicates(testArray));
//        System.out.println(Arrays.toString(testArray));
        //第二课
        Solution2 solution2 = new Solution2();
        int[] testArray = {1,2};
        solution2.rotate(testArray,3);
        System.out.println(Arrays.toString(testArray));

    }

}

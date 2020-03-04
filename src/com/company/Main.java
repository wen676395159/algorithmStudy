package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] testArray ={1,2,2,3,5,5,6};
        Solution solution = new Solution();
        System.out.println(solution.removeDuplicates(testArray));
        System.out.println(Arrays.toString(testArray));
    }

}

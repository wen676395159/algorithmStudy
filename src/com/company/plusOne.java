package com.company;

import java.util.Deque;
import  java.util.Arrays;

import java.util.ArrayDeque;

public class plusOne {

    //第一次解法
    //    public int[] plusOne(int[] digits) {
//        ArrayDeque<Integer> deque = new ArrayDeque<Integer>();
//        sumResult(deque,digits,digits.length-1);
//        int nums = deque.size();
//        Integer[] result = deque.toArray(new Integer[0]);
//        return  Arrays.stream(result).mapToInt(Integer::valueOf).toArray();
//    }
//
//    private void  sumResult(ArrayDeque<Integer> deque,int[] digits,int pointOfArray){
//
//        if(pointOfArray >=0) {
//            int needNum = digits[pointOfArray];
//            int needNumPlusOne = needNum + 1;
//            if (needNumPlusOne < 10) {
//                digits[pointOfArray] = needNumPlusOne;
//                for (int i = 0; i < digits.length; i++) {
//                    deque.add(digits[i]);
//                }
//            } else {
//                digits[pointOfArray] = 0;
//                sumResult(deque,digits, --pointOfArray);
//            }
//        }
//        else {
//            for (int i = 0; i < digits.length; i++) {
//                deque.add(digits[i]);
//            }
//            deque.addFirst(1);
//        }
//
//
//    }

    //参考别人的做法
    public int[] plusOne(int[] digits){
        for (int i = digits.length-1; i >= 0; i--) {
            digits[i]++;
            digits[i] = digits[i] % 10;
            if(digits[i]  != 0){
                return digits;
            }
        }
        digits = new int[digits.length+1];
        digits[0] = 1;
        return  digits;
    }

}

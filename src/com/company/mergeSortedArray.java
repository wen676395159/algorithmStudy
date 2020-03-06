package com.company;

public class mergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        //对于有序数组，常规采用双指针方式遍历，中间构建第三方容器存放临时数据
        int[] nums1Copy = new int[nums1.length];
        System.arraycopy(nums1,0,nums1Copy,0,m);
        int p1 =0;
        int p2 =0;
        int p = 0;
        while ((p1<m) && (p2<n)){
            if (nums1Copy[p1] < nums2[p2]){
                nums1[p] = nums1Copy[p1];
                p1 = p1 +1;
            }
            else {
                nums1[p] = nums2[p2];
                p2 = p2 + 1;
            }
            p = p+1;
        }

        if(p1<m){
            System.arraycopy(nums1Copy,p1,nums1,p1+p2,m+n-p1-p2);
        }
        if(p2<n){
            System.arraycopy(nums2, p2, nums1, p1 + p2, m + n - p1 - p2);
        }

    }
}

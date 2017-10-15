package com.fran.sorting.merge;

public class TestMergeSort {

    public static void main(String[] args) {

        int[] nums = { 9,8,7,6,5,4,3,2,1 };

        MergeSort mergeSort = new MergeSort(nums);
        mergeSort.mergeSort(0, nums.length - 1);
        mergeSort.showResult();
    }
}

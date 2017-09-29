package com.fgm.exercise;

import com.fgm.exercise.codefights.arrays.Arrays;

/**
 * Created by fogd on 15.06.17.
 */
public class App {

    static int[] arrayInteger = {1, 2, 3, 4, 5, 0, 0, 0, 6, 7, 8, 9, 10};
    static int[][] matrixInteget = { { 0, 1, 1, 2 }, { 0, 5, 0, 0 }, { 2, 0, 3, 3 } };
    static String s1 = "aabcc";
    static String s2 = "adcaa";
    static int[] pairSum = {1, 2, 3, 7, 4};

    static String[] crypt = {"SEND",  "MORE",  "MONEY"};
    static char[][] solution = { {'O', '0'}, {'M', '1'}, {'Y', '2'}, {'E', '5'}, {'N', '6'}, {'D', '7'},  {'R', '8'} , {'S', '9'}  };

    public static void main(String[] args) {

        //System.out.println( almostIncreasingSequence( arrayInteger) );
        //System.out.println( matrixElementsSum( matrixInteget ) );

        //System.out.println( commonCharacterCount( s1, s2 ) );

        //showArray( sortByHeight(arrayInteger) );

        //System.out.println(reverseParentheses("a(bcdefghijkl(mno)p)q"));

        //System.out.println( hasPairSum(pairSum, 8) );

        //isCryptSolution(crypt, solution);

        int[] result = Arrays.findLongestSubarrayBySumMine(15, arrayInteger);


    }



}

package solutions.hackerrank.prepkit1week;

import java.util.Arrays;

/**
 * Problem:
 * https://www.hackerrank.com/challenges/one-week-preparation-kit-zig-zag-sequence
 * 
 * Given an array of distinct integers, transform the array into a zig zag
 * sequence by permuting the array elements. A sequence will be called a zig zag
 * sequence if the first elements in the sequence are in increasing order and
 * the last elements are in decreasing order, where . You need to find the
 * lexicographically smallest zig zag sequence of the given array.
 * 
 * Example.
 * Now if we permute the array as , the result is a zig zag sequence.
 * Debug the given function findZigZagSequence to return the appropriate zig zag
 * sequence for the given input array.
 * 
 * Note: You can modify at most three lines in the given code. You cannot add or
 * remove lines of code.
 * 
 */
public class ZigZagSequence {
    /**
     * PSEUDO CODE video:
     * 
     * @param a
     */
    public int[] solution(int[] a) {
        int n=a.length;
        Arrays.sort(a);
        int mid = (n / 2); // oirginal code: (n + 1) / 2;
        int temp = a[mid];
        a[mid] = a[n - 1];
        a[n - 1] = temp;

        int st = mid + 1;
        int ed = n-2; // oirginal code:  n - 1;
        while (st <= ed) {
            temp = a[st];
            a[st] = a[ed];
            a[ed] = temp;
            st = st + 1;
            ed = ed - 1; // oirginal code:  ed + 1;
        } // while

        return a;
    }
}

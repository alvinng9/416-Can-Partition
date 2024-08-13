package org.example;

import java.util.HashSet;

public class Solution {
    public boolean canPartition(int[] nums) {
        //find the sum all the num in the nums array
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }

        //if the sum is odd then the array cannot be partition the array into two subsets
        //such that the sum of the elements in both subsets is equal
        if (sum % 2 != 0) return false;

        //divide the sum into half so that we can find that half in the array
        sum /= 2;


        //create a hash set to find every sum combination in the array
        //0 will be the base case
        HashSet<Integer> set = new HashSet<>();
        set.add(0);

        for (int num : nums) {
            //return true if a subset equals the half the sum of the given array
            if (set.contains(sum)) return true;
            //add a new combination of sum to the set
            int[] tempArr = new int[set.size()];
            int index = 0;
            for (int temp : set) {
                tempArr[index++] = temp;
            }
            for (int temp : tempArr) {
                set.add(temp + num);
            }
        }
        //return false if there is no subset qualifies the given requirement
        return false;
    }
}

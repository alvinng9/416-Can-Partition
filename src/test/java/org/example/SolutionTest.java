package org.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void canPartitionTest() {
        Solution solution = new Solution();
        assertTrue(solution.canPartition(new int[]{1,5,11,5}));
        assertFalse(solution.canPartition(new int[]{1,2,3,5}));
        assertTrue(solution.canPartition(new int[]{1,2,3,6}));
        assertFalse(solution.canPartition(new int[]{1,5,12,5}));
    }

}
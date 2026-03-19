package easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MoveZeroesTest {

    @Test
    void testMoveZeroes_mixedArray() {
        MoveZeroes solution = new MoveZeroes();
        int[] nums = {0, 1, 0, 3, 12};
        solution.moveZeroes(nums);
        assertArrayEquals(new int[]{1, 3, 12, 0, 0}, nums);
    }

    @Test
    void testMoveZeroes_singleZero() {
        MoveZeroes solution = new MoveZeroes();
        int[] nums = {0};
        solution.moveZeroes(nums);
        assertArrayEquals(new int[]{0}, nums);
    }

    @Test
    void testMoveZeroes_noZeroes() {
        MoveZeroes solution = new MoveZeroes();
        int[] nums = {1, 2, 3};
        solution.moveZeroes(nums);
        assertArrayEquals(new int[]{1, 2, 3}, nums);
    }

    @Test
    void testMoveZeroes_allZeroes() {
        MoveZeroes solution = new MoveZeroes();
        int[] nums = {0, 0, 0};
        solution.moveZeroes(nums);
        assertArrayEquals(new int[]{0, 0, 0}, nums);
    }

    @Test
    void testMoveZeroes_zeroAtEnd() {
        MoveZeroes solution = new MoveZeroes();
        int[] nums = {1, 2, 0};
        solution.moveZeroes(nums);
        assertArrayEquals(new int[]{1, 2, 0}, nums);
    }

    @Test
    void testMoveZeroes_zeroAtStart() {
        MoveZeroes solution = new MoveZeroes();
        int[] nums = {0, 1, 2};
        solution.moveZeroes(nums);
        assertArrayEquals(new int[]{1, 2, 0}, nums);
    }

    @Test
    void testMoveZeroes_maintainsRelativeOrder() {
        MoveZeroes solution = new MoveZeroes();
        int[] nums = {4, 0, 2, 0, 7, 0, 1};
        solution.moveZeroes(nums);
        assertArrayEquals(new int[]{4, 2, 7, 1, 0, 0, 0}, nums);
    }

    @Test
    void testMoveZeroes_singleNonZero() {
        MoveZeroes solution = new MoveZeroes();
        int[] nums = {42};
        solution.moveZeroes(nums);
        assertArrayEquals(new int[]{42}, nums);
    }
}

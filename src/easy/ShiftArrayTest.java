package easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShiftArrayTest {

    @Test
    void testShiftArray_basicExample() {
        ShiftArray shiftArray = new ShiftArray();
        int[] input = {1, 2, 3, 4, 5, 6, 7};
        int[] expected = {6, 7, 1, 2, 3, 4, 5};
        int[] result = shiftArray.shiftArray(input, 4);
        assertArrayEquals(expected, result);
    }

    @Test
    void testShiftArray_zeroSteps() {
        ShiftArray shiftArray = new ShiftArray();
        int[] input = {1, 2, 3};
        int[] expected = {1, 2, 3};
        int[] result = shiftArray.shiftArray(input, 0);
        assertArrayEquals(expected, result);
    }

    @Test
    void testShiftArray_stepsEqualToLength() {
        ShiftArray shiftArray = new ShiftArray();
        int[] input = {1, 2, 3, 4};
        int[] expected = {1, 2, 3, 4};
        int[] result = shiftArray.shiftArray(input, 4);
        assertArrayEquals(expected, result);
    }

    @Test
    void testShiftArray_stepsGreaterThanLength() {
        ShiftArray shiftArray = new ShiftArray();
        int[] input = {1, 2, 3};
        int[] expected = {3, 1, 2};
        int[] result = shiftArray.shiftArray(input, 4);
        assertArrayEquals(expected, result);
    }

    @Test
    void testShiftArray_emptyArray() {
        ShiftArray shiftArray = new ShiftArray();
        int[] input = {};
        int[] expected = {};
        int[] result = shiftArray.shiftArray(input, 2);
        assertArrayEquals(expected, result);
    }

    @Test
    void testShiftArray_singleElement() {
        ShiftArray shiftArray = new ShiftArray();
        int[] input = {42};
        int[] expected = {42};
        int[] result = shiftArray.shiftArray(input, 5);
        assertArrayEquals(expected, result);
    }
}

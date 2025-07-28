package easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContainsDuplicateTest {

    @Test
    void testContainsDuplicate_true() {
        int[] nums = {1, 2, 3, 1};
        assertTrue(ContainsDuplicate.containsDuplicate(nums));
    }

    @Test
    void testContainsDuplicate_false() {
        int[] nums = {1, 2, 3, 4};
        assertFalse(ContainsDuplicate.containsDuplicate(nums));
    }

    @Test
    void testContainsDuplicate_empty() {
        int[] nums = {};
        assertFalse(ContainsDuplicate.containsDuplicate(nums));
    }

    @Test
    void testContainsDuplicate_singleElement() {
        int[] nums = {42};
        assertFalse(ContainsDuplicate.containsDuplicate(nums));
    }
}
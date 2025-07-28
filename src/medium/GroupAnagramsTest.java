package medium;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class GroupAnagramsTest {

    @Test
    public void testGroupAnagrams_typical() {
        String[] input = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> result = GroupAnagrams.groupAnagrams(input);

        // Each group can be in any order, so check contents
        Assert.assertEquals(3, result.size());
        Assert.assertTrue(result.stream().anyMatch(l -> l.containsAll(Arrays.asList("eat", "tea", "ate")) && l.size() == 3));
        Assert.assertTrue(result.stream().anyMatch(l -> l.containsAll(Arrays.asList("tan", "nat")) && l.size() == 2));
        Assert.assertTrue(result.stream().anyMatch(l -> l.contains("bat") && l.size() == 1));
    }

    @Test
    public void testGroupAnagrams_emptyInput() {
        String[] input = {};
        List<List<String>> result = GroupAnagrams.groupAnagrams(input);
        Assert.assertTrue(result.isEmpty());
    }

    @Test
    public void testGroupAnagrams_singleWord() {
        String[] input = {"abc"};
        List<List<String>> result = GroupAnagrams.groupAnagrams(input);
        Assert.assertEquals(1, result.size());
        Assert.assertEquals(Arrays.asList("abc"), result.get(0));
    }

    @Test
    public void testGroupAnagrams_allAnagrams() {
        String[] input = {"abc", "bca", "cab"};
        List<List<String>> result = GroupAnagrams.groupAnagrams(input);
        Assert.assertEquals(1, result.size());
        Assert.assertTrue(result.get(0).containsAll(Arrays.asList("abc", "bca", "cab")));
    }

    @Test
    public void testGroupAnagrams_noAnagrams() {
        String[] input = {"abc", "def", "ghi"};
        List<List<String>> result = GroupAnagrams.groupAnagrams(input);
        Assert.assertEquals(3, result.size());
        Assert.assertTrue(result.stream().anyMatch(l -> l.contains("abc") && l.size() == 1));
        Assert.assertTrue(result.stream().anyMatch(l -> l.contains("def") && l.size() == 1));
        Assert.assertTrue(result.stream().anyMatch(l -> l.contains("ghi") && l.size() == 1));
    }
}
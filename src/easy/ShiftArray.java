package easy;

public class ShiftArray {
    public int[] shiftArray(int[] numbers, int steps) {
        if (steps == 0) {
            return numbers;
        }

        int[] result = new int[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            int position = calculatePosition(steps, numbers.length, i);
            result[i] = numbers[position];
        }

        return result;
    }

    public int calculatePosition(int steps, int arrayLength, int currPos) {
        return (currPos + steps) % arrayLength;
    }
}

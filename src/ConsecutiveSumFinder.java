public class ConsecutiveSumFinder {

    public int find(int[] coll) {
        int largestSum = 0;
        int consecutiveSum = 0;

        for(int i : coll) {
            consecutiveSum += i;

            if (consecutiveSum < 0) {
                consecutiveSum = 0;
            }

            if (consecutiveSum > largestSum) {
                largestSum = consecutiveSum;
            }
        }

        return largestSum;
    }
}


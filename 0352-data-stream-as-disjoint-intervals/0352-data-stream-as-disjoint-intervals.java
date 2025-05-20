class SummaryRanges {
    private boolean[] set;
    public SummaryRanges() {
        set = new boolean[10000 + 5];
    }

    public void addNum(int value) {
        set[value] = true;  // mark the presence
    }

    public int[][] getIntervals() {
        List<int[]> intervals = new ArrayList<>();
        for (int i = 0; i < set.length; i++) {
            if (!set[i]) {  // reach to the starting number
                continue;
            }

            int start = i;  // record the starting number
            // keep iterating till we have conecutive elements
            while (i < set.length && set[i]) i++;
            // the loop will break when i will exceed the last consecutive number
            int end = i - 1;    // so end is 1 less than i
            intervals.add(new int[] {start, end});  // add the interval
        }

        // return the list as a 2D array of intervals
        return intervals.toArray(new int[0][]);
    }
}
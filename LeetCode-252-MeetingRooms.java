import java.util.Arrays;

class Solution {
    public boolean canAttendMeetings(int[][] intervals) {
        // Step 1: Sort the intervals by start time
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        // Step 2: Check for overlapping meetings
        for (int i = 1; i < intervals.length; i++) {
            // If current meeting starts before previous one ends then,overlap
            if (intervals[i][0] < intervals[i - 1][1]) {
                return false;
            }
        }

        return true; // No overlaps found
    }
}

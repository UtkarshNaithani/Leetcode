Time Complexity: O(n * logn) + O(n) => O(n * logn)
Space Complexity: O(n)
​
class Solution {
public int[][] merge(int[][] intervals) {
Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
List<int[]> ans = new ArrayList<>();
int[] currInterval = intervals[0];
​
for (int i = 1; i < intervals.length; i++) {
int currEnd   = currInterval[1];
int nextBegin = intervals[i][0];
int nextEnd   = intervals[i][1];
​
if (currEnd >= nextBegin) {
currInterval[1] = Math.max(currEnd, nextEnd);
} else {
ans.add(currInterval);
currInterval = intervals[i];
}
}
​
ans.add(currInterval);
return ans.toArray(new int[0][]);
}
}
OR
class Solution {
public int[][] merge(int[][] intervals) {
Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
List<int[]> ans = new ArrayList<>();
int s = intervals[0][0];
int e = intervals[0][1];
​
for (int[] curr : intervals) {
if (curr[0] <= e) {
e = Math.max(e, curr[1]);
} else {
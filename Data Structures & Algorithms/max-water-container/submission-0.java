class Solution {
    public int maxArea(int[] heights) {

        int l = 0;
        int r = heights.length - 1;
        int h = 0;
        int w = 0;
        int area = 0;
        int maxArea = 0;

        while (l < r) {

            w = r - l;
            h = Math.min(heights[l], heights[r]);
            area = w * h;

            if (area > maxArea)
                maxArea = area;

            if (heights[l] < heights[r])
                l++;
            else
                r--;
        }

        return maxArea;
    }
}
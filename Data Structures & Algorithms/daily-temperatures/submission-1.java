class Solution {
    public int[] dailyTemperatures(int[] temp) {

        int[] result = new int[temp.length];

        for (int l = 0; l < temp.length; l++) {

            int r = l + 1;

            while (r < temp.length && temp[r] <= temp[l]) {
                r++;
            }

            if (r < temp.length) {
                result[l] = r - l;
            }
        }

        return result;
    }
}
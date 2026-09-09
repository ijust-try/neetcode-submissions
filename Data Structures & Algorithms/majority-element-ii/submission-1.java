class Solution {
    public List<Integer> majorityElement(int[] nums) {

        int candidateOne = 0;
        int candidateTwo = 0;

        int countOne = 0;
        int countTwo = 0;

        for (int number : nums) {

            if (number == candidateOne && countOne > 0) {
                countOne++;
            }
            else if (number == candidateTwo && countTwo > 0) {
                countTwo++;
            }
            else if (countOne == 0) {
                candidateOne = number;
                countOne = 1;
            }
            else if (countTwo == 0) {
                candidateTwo = number;
                countTwo = 1;
            }
            else {
                countOne--;
                countTwo--;
            }
        }

        List<Integer> result = new ArrayList<>();

        countOne = 0;
        countTwo = 0;

        for (int number : nums) {
            if (number == candidateOne) {
                countOne++;
            }
            else if (number == candidateTwo) {
                countTwo++;
            }
        }

        int threshold = nums.length / 3;

        if (countOne > threshold) {
            result.add(candidateOne);
        }

        if (countTwo > threshold) {
            result.add(candidateTwo);
        }

        return result;
    }
}
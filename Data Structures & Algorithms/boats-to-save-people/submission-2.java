class Solution {
    public int numRescueBoats(int[] people, int limit) {

        int l = 0;
        int r = people.length - 1;
        int boats = 0;

        //Arrays.sort(people);
        for (int i = 0; i < people.length - 1; i++) {
        for (int j = 0; j < people.length - i - 1; j++) {
            if (people[j] > people[j + 1]) {
                int temp = people[j];
                people[j] = people[j + 1];
                people[j + 1] = temp;
            }
        }
}

        while(l <= r)
        {
            if(people[l] + people[r] <= limit)
            {
                l++;
                r--;
                boats++;
            }

            else if(people[l] + people[r] > limit)
            {
                r--;
                boats++;
            }
        }

        return boats;
    }
}
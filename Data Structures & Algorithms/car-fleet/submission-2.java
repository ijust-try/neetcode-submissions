
class Solution {
    public int carFleet(int target, int[] pos, int[] speed) {

        double time[] = new double[pos.length];

        // Store position and corresponding time together
        double cars[][] = new double[pos.length][2];

        for (int i = 0; i < pos.length; i++) {
            double t = (double)(target - pos[i]) / speed[i];

            cars[i][0] = pos[i];
            cars[i][1] = t;
        }

        Arrays.sort(cars, (a, b) -> Double.compare(b[0], a[0]));

        for (int i = 0; i < cars.length; i++) {
            time[i] = cars[i][1];
        }

        Stack<Double> s = new Stack<>();

        for (int i = 0; i < time.length; i++) {

            if (s.isEmpty()) {
                s.push(time[i]);
            }

            else if (time[i] > s.peek()) {
                s.push(time[i]);
            }
        }

        return s.size();
    }
}

class FreqStack {

    HashMap<Integer, Stack<Integer>> freqStack;
    HashMap<Integer, Integer> freq;
    int maxFreq;

    public FreqStack() {
        freq = new HashMap<>();
        freqStack = new HashMap<>();
        maxFreq = 0;
    }

    public void push(int val) {

        int curfreq = freq.getOrDefault(val, 0) + 1;
        freq.put(val, curfreq);

        if (!freqStack.containsKey(curfreq)) {
            freqStack.put(curfreq, new Stack<>());
        }

        freqStack.get(curfreq).push(val);

        if (curfreq > maxFreq)
            maxFreq = curfreq;
    }

    public int pop() {

        Stack<Integer> stack = freqStack.get(maxFreq);

        int value = stack.pop();

        freq.put(value, freq.get(value) - 1);

        if (stack.isEmpty())
            maxFreq--;

        return value;
    }
}
/**
 * Your FreqStack object will be instantiated and called as such:
 * FreqStack obj = new FreqStack();
 * obj.push(val);
 * int param_2 = obj.pop();
 */
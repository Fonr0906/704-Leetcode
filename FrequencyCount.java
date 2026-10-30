import java.util.HashMap;

public class FrequencyCount {

    public static HashMap<Integer, Integer> frequencyCount(int[] nums) {
        HashMap<Integer, Integer> freq = new HashMap<>();

        for (int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        return freq;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 3, 1, 1, 4};

        HashMap<Integer, Integer> result = frequencyCount(nums);

        System.out.println("Frequency Count: " + result);
    }
}

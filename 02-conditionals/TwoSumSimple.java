public class TwoSumSimple {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        // Loop through every number in the array
        for (int i = 0; i < nums.length; i++) {
            // Loop through the numbers that come after the first number
            for (int j = i + 1; j < nums.length; j++) {
                // Check if the two numbers add up to the target
                if (nums[i] + nums[j] == target) {
                    System.out.println("Match found at indices: [" + i + ", " + j + "]");
                    return; // Stop the program once we find the answer
                }
            }
        }
        System.out.println("No match found.");
    }
}

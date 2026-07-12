
/*
LeetCode 565
Array Nesting

Time Complexity: O(n)
Space Complexity: O(n)
*/

public class ArrayNesting {

    public int arrayNesting(int[] nums) {

        boolean[] visited = new boolean[nums.length];
        int maxLength = 0;

        for (int i = 0; i < nums.length; i++) {

            if (!visited[i]) {

                int count = 0;
                int current = i;

                while (!visited[current]) {
                    visited[current] = true;
                    current = nums[current];
                    count++;
                }

                maxLength = Math.max(maxLength, count);
            }
        }

        return maxLength;
    }

    public static void main(String[] args) {

        ArrayNesting obj = new ArrayNesting();

        int[] nums1 = {5, 4, 0, 3, 1, 6, 2};
        System.out.println(obj.arrayNesting(nums1));

        int[] nums2 = {0, 1, 2};
        System.out.println(obj.arrayNesting(nums2));
    }
}
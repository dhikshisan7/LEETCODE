package PROBLEMS.LC349;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class IntersectionOfArrays {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        for (int num : nums1) {
            set1.add(num);
        }
        Set<Integer> resultSet = new HashSet<>();
        for (int num : nums2) {
            if (set1.contains(num)) {
                resultSet.add(num);
            }
        }

        int[] result = new int[resultSet.size()];
        int i = 0;
        for (int num : resultSet) {
            result[i++] = num;
        }
        return result;
    }
    public static void main(String[] args) {
        IntersectionOfArrays sol = new IntersectionOfArrays();
        int[] nums3 = {4, 9, 5};
        int[] nums4 = {9, 4, 9, 8, 4};
        System.out.println("Intersection Array:");
        System.out.println(Arrays.toString(sol.intersection(nums3, nums4)));
    }
}

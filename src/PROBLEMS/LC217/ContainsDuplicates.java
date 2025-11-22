package PROBLEMS.LC217;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicates {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> seen = new HashSet<>();

        for (int num : nums) {
            if (seen.contains(num)) {
                return true;
            }
            seen.add(num);
        }
        return false;
    }
    public static void main(String[] args) {
        ContainsDuplicates sol = new ContainsDuplicates();

        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {1, 2, 3, 1, 5};

        System.out.println(sol.containsDuplicate(arr1));
        System.out.println(sol.containsDuplicate(arr2));
    }
}

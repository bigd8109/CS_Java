package Arrays;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FindDuplicates {
    public static void main(String[] args) {
        int[] ar = new int[]{1,2,4,7,8,2,5,9};
        int k = 4;
        FindDuplicates fd = new FindDuplicates();
        System.out.println("hasDuplicates ? " + fd.hasDuplicates(ar));
        System.out.println("Duplicates ? " + fd.findDuplicateGivenRange(ar, k));
        System.out.println("Duplicates ? " + fd.findDuplicateGivenRange2(ar, k));

    }

    private boolean hasDuplicates(int[] ar) {
        Set<Integer> st = new HashSet<>();

        for (int i = 0; i < ar.length; i++) {
            if (st.contains(ar[i])) {
                return true;
            }
            st.add(ar[i]);
        }
        return false;
    }


    //Find duplicates with given range k in array - Using HashMap
    private boolean findDuplicateGivenRange(int[] ar, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < ar.length; i++) {
            if (map.containsKey(ar[i])) {
                if (i - map.get(ar[i]) <= k) {
                    return true;
                }
            }
            map.put(ar[i], i);
        }
        return false;
    }

    //Find duplicates with given range k in array - Using sliding window
    private boolean findDuplicateGivenRange2(int[] ar, int k) {
        Set<Integer> window = new HashSet<>();

        for (int i = 0; i < ar.length; i++) {
            if (window.contains(ar[i])) {
                return true;
            }
            window.add(ar[i]);

            if (i >= k) {
                window.remove(ar[i-k]);
            }
        }
        return false;
    }


}

package String;

import java.util.HashMap;
import java.util.HashSet;

public class IsUnique {
    public static void main(String[] args) {
        String s = "dbcd";
        System.out.println("Is %d unique: " + s + ": "  + isUnique(s) );
        System.out.println("Is %d unique: " + s + ": "  + isUnique2(s) );
        System.out.println("Is %d unique: " + s + ": "  + isUnique3(s) );
    }

    //Using HashSet
    private static boolean isUnique(String s) {
        if (s.length() == 0) return  false;
        HashSet<Character> h = new HashSet<Character>();

        for (int i = 0; i < s.length(); i++) {
            h.add(s.charAt(i));
        }
        System.out.println("h size: " + h.size());
        return h.size() == s.length();
    }

    //Using HashMap
    private static boolean isUnique2(String s) {
        if (s.length() == 0) return  false;
        HashMap<Character, Integer> h = new HashMap<Character, Integer>();

        for (int i = 0; i < s.length(); i++) {
            if (!h.containsKey(s.charAt(i))) {
                h.put(s.charAt(i), i);
            }
            else {
                return false;
            }
        }
        System.out.println("h size: " + h.size());
        return true;
    }

    //Not using additional structure
    private static boolean isUnique3(String s) {
        // Assuming string can have characters a-z
        // this has 32 bits set to 0
        int checker = 0;

        for (int i = 0; i < s.length(); i++) {
            int bitAtIndex = s.charAt(i) - 'a';
            System.out.println("1 << bitAtIndex): " + (1 << bitAtIndex));
            System.out.println("checkValue: " + (checker & (1 << bitAtIndex)));
            // if that bit is already set in checker,
            // return false
            if ((checker & (1 << bitAtIndex)) > 0)

                return false;

            // otherwise update and continue by
            // setting that bit in the checker
            checker = checker | (1 << bitAtIndex);
            System.out.println("checker: " + checker);
        }

        // no duplicates encountered, return true
        return true;
    }

}

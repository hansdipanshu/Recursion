import java.util.HashSet;

// Hash SEt is used to remove all duplicate sunstring and all unique string are present
public class All_Unique_SubSequence {
    public static void subsequence(String str, int idx, String newString, HashSet<String> set) {

        if (idx == str.length()) {
            if (set.contains(newString)) {
                return;
            } else {
                System.out.println(newString);
                set.add(newString);
                return;
            }

        }
        char currChar = str.charAt(idx);
        //to be
        subsequence(str, idx + 1, newString + currChar, set);

        // not to be
        subsequence(str, idx + 1, newString, set);
    }

    public static void main(String[] args) {

        String str = "aaaa";
        HashSet<String> set = new HashSet<>();
        subsequence(str, 0, " ", set);
    }
}

public class SubString_of_String {
    public  static  void subsequence(String str, int idx , String newString) {

        if (idx == str.length()) {
            System.err.println(newString);
            return;
        }
        char currChar = str.charAt(idx);
        //to be
        subsequence(str, idx+ 1, newString+currChar);
        subsequence(str, idx+1, newString);
        // not to be

    }
    public static void main(String[] args) {
String str = "abc";
subsequence(str, 0 , " ");
    }
}


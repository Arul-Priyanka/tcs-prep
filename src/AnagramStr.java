import java.util.Scanner;
public class AnagramStr {
    //Check if both strings have equal lengths; if not, return false.
    //Create a frequency array of size 26 for lowercase English letters.
    //Increment counts for characters in s1 and decrement for characters in s2.
    //If all frequencies in the array are 0, the strings are anagrams.

    public static boolean isAnagram(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        int[] count = new int[26];
        for (int i = 0; i < s1.length(); i++) {
            //we are positioning the letters in zero inexed count array
            count[s1.charAt(i) - 'a']++;
            count[s2.charAt(i) - 'a']--;
        }
        for (int c : count) {
            if (c != 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s1 = sc.next();
        String s2 = sc.next();

        if (isAnagram(s1, s2)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        sc.close();
    }
}

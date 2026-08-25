import java.util.Scanner;
//Approach: Frequency Array / Direct Indexing
//Time Complexity: $O(N)$ — Two linear passes over the string of length $N$.
// Space Complexity: $O(1)$ — Uses a fixed-size frequency array of 26 integers.
public class FirstNonRepeatingChar {
    public static char nonRepeatingCharacter(String s){
        int[] count = new int[26];
        for(int i = 0;i<s.length();i++){
            count[s.charAt(i)-'a']++;
        }
        for (int i = 0; i < s.length(); i++) {
            if(count[s.charAt(i)-'a'] == 1){
                return s.charAt(i);
            }
        }
        return '$';
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s1 = sc.next();
        char res = nonRepeatingCharacter(s1);
        System.out.println(res);
    }
}

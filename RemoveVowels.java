import java.util.*;

public class RemoveVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        String result = "";

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch != 'a' && ch != 'e' && ch != 'i' &&
                ch != 'o' && ch != 'u') {
                result += ch;
            }
        }

        System.out.println(result);

        sc.close();
    }
}

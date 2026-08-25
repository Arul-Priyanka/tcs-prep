//Approach: String Splitting / Single Pass
//Time Complexity: $O(N)$ — Linear scan where $N$ is the total length of the sentence string.
//Space Complexity: $O(N)$ — Space for storing the array of split words.
public class LongestWordInSentence {
    public static String longestWord(String sentence){
        String[] words = sentence.trim().split("\\s+");
        String longest = "";
        for(String word : words){
            if(word.length() > longest.length()){
                longest = word;
            }
        }
        return longest;
    }

    public static void main(String[] args) {
        String s1 ="Priyanka Gania Arul Rajamani Rathinam";
        String rs = longestWord(s1);
        System.out.println(rs);
    }
}

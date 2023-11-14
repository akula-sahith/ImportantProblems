package ImportantProblems;
import java.util.*;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String answer = sortVowels(s);
        System.out.println(answer);
    }

    static String sortVowels(String s) {
        StringBuilder ans = new StringBuilder();
        List<Character> list = new ArrayList<>();
        List<Integer> indexes = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == 'a' || ch == 'A' ||
                ch == 'e' || ch == 'E' ||
                ch == 'i' || ch == 'I' ||
                ch == 'o' || ch == 'O' ||
                ch == 'u' || ch == 'U') {
                list.add(ch);
                indexes.add(i);
            } else {
                ans.append(ch);
            }
        }

        int[] index = new int[indexes.size()];
        char[] vowels = new char[indexes.size()];

        for (int i = 0; i < index.length; i++) {
            index[i] = indexes.get(i);
            vowels[i] = list.get(i);
        }

        for (int i = 0; i < vowels.length; i++) {
            for (int j = i + 1; j < vowels.length; j++) {
                if (vowels[j] < vowels[i]) {
                    char tempChar = vowels[i];
                    vowels[i] = vowels[j];
                    vowels[j] = tempChar;

                    int tempIndex = index[i];
                    index[i] = index[j];
                    index[j] = tempIndex;
                }
            }
        }

        for (int i = 0; i < index.length; i++) {
            ans.setCharAt(index[i], vowels[i]);
        }

        return ans.toString();
    }
}

package week_14.assigment;

import java.util.*;

public class Question_14_14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input from the user until -1 is entered
        ArrayList<String> words = new ArrayList<>();
        System.out.println("Enter words (enter -1 to finish):");
        String word;
        while (true) {
            word = scanner.next();
            if (word.equals("-1")) {
                break;
            }
            words.add(word);
        }

        // Group anagrams and display the result
        groupAndDisplayAnagrams(words);
    }

    // Function to group anagrams and display the result
    private static void groupAndDisplayAnagrams(ArrayList<String> words) {
        Map<String, List<String>> anagramMap = new HashMap<>();

        for (String word : words) {
            // Sort the word to use as a key for grouping anagrams
            char[] charArray = word.toCharArray();
            Arrays.sort(charArray);
            String sortedWord = new String(charArray);

            // Group anagrams under the same key
            if (!anagramMap.containsKey(sortedWord)) {
                anagramMap.put(sortedWord, new ArrayList<>());
            }
            anagramMap.get(sortedWord).add(word);
        }

        // Display the grouped anagrams
        System.out.println("Anagram Groups:");
        for (List<String> group : anagramMap.values()) {
            System.out.println(group);
        }
    }
}


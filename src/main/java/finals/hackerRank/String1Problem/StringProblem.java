package finals.hackerRank.String1Problem;

import java.util.Scanner;

public class StringProblem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word1 = scanner.nextLine();
        String word2 = scanner.nextLine();

        // first task
        calculateSumOfLengthes(word1, word2);

        // second task
        compareStrings(word1, word2);

        // third task
        capitalizeWordsAndPrint(word1, word2);
    }

    private static void compareStrings(String word1, String word2) {
        System.out.println(word1.charAt(0) > word2.charAt(0)? "Yes": "No");
    }

    private static void calculateSumOfLengthes(String word1, String word2) {
        System.out.println(word1.length() + word2.length());
    }

    private static void capitalizeWordsAndPrint(String word1, String word2) {
        word1 = Character.toUpperCase(word1.charAt(0)) + word1.substring(1);
        word2 = Character.toUpperCase(word2.charAt(0)) + word2.substring(1);
        System.out.println(word1 + " " + word2);
    }
}

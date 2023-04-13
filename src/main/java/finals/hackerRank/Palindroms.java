package finals.hackerRank;

import java.util.Scanner;

public class Palindroms {
    public static void main(String[] args) {
        boolean answer = true;
        Scanner scanner = new Scanner(System.in);

        StringBuilder word = new StringBuilder(scanner.nextLine());
        String originalWord = word.toString();
        String reversedWord = word.reverse().toString();

        for (int i = 0; i < word.length(); i++) {

            if (originalWord.charAt(i) != reversedWord.charAt(i)) {
                System.out.println("No");
                answer = false;
                break;
            }
        }

        if (answer) {
            System.out.println("Yes");
        }

    }
}

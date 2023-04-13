package finals.hackerRank;

import com.sun.source.tree.WhileLoopTree;

import java.util.Scanner;

public class StdInOut2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstInput = Integer.parseInt(scanner.nextLine());
        double secondInput = Double.parseDouble(scanner.nextLine());
        String thirdInput = scanner.nextLine();

        System.out.println("String: " + thirdInput);
        System.out.println("Double: " + secondInput);
        System.out.println("Int: " + firstInput);
    }
}

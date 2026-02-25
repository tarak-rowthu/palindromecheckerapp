import java.util.*;
import java.util.Stack;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
public class PalindromeCheckerApp {
    public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                System.out.print("Input : ");
                String s = sc.nextLine();

                boolean result = check(s, 0, s.length() - 1);
                System.out.println("Is Palindrome? : " + result);
            }
            private static boolean check(String s, int start, int end) {
                if (start >= end)
                    return true;

                if (s.charAt(start) != s.charAt(end))
                    return false;

                return check(s, start + 1, end - 1);
            }
        }

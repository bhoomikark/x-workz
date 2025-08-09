import java.util.Scanner;
public class StringReverse {



        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter a sentence: ");
            String input = sc.nextLine();

            String result = reverseWords(input);
            System.out.println("Reversed order of words: " + result);

            sc.close();
        }

        public static String reverseWords(String str) {
            String[] words = str.trim().split("\\s+");


            StringBuilder reversed = new StringBuilder();
            for (int i = words.length - 1; i >= 0; i--) {
                reversed.append(words[i]);
                if (i != 0) {
                    reversed.append(" ");
                }
            }
            return reversed.toString();
        }
    }



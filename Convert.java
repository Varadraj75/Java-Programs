import java.util.Scanner;

class Convert {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("ENTER THE SENTENCE: ");
        String s = in.nextLine().toUpperCase();

        // Check if the input is valid
        char last = s.charAt(s.length() - 1);
        if (".?!".indexOf(last) == -1 || s.indexOf("  ") >= 0) {
            System.out.println("INVALID INPUT");
            return;
        }

        String p = "";
        String w = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isLetterOrDigit(ch)) {
                w += ch;
            } else {
                // Convert the word to palindrome
                int start = 0;
                int end = w.length() - 1;
                while (start < end && w.charAt(start) == w.charAt(end)) {
                    start++;
                    end--;
                }

                if (start >= end) {
                    p += w + " ";
                } else {
                    String temp = w;
                    int index = w.length() - 2;
                    while (index - 1 >= 0 && w.charAt(index) == w.charAt(index + 1)) {
                        index--;
                    }
                    for (int j = index; j >= 0; j--) {
                        temp += w.charAt(j);
                    }
                    p += temp + " ";
                }

                w = "";  // Reset the word variable
            }
        }

        System.out.println(s);
        System.out.println(p);
    }
}

import java.util.*;

class StringAdd2 {
    static void withbuiltin() {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        StringBuilder out = new StringBuilder();
        StringBuilder temp = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (Character.isLetter(ch)) {
                temp.append(ch);
            } else if (Character.isDigit(ch)) {
                int count = Character.getNumericValue(ch);
                for (int j = 0; j < count; j++) {
                    out.append(temp);
                }
                temp.setLength(0);
            }
        }

        System.out.println("Output: " + out.toString());
    }

    public static void main(String args[]) {
        System.out.println("Enter a string with number:");
        withbuiltin();
    }
}

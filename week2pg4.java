import java.util.Scanner;

public class ISBNNormalizer {

    static String normalizeCode(String raw) {

        raw = raw.trim();

        String first3 = raw.substring(0, 3).toUpperCase();
        String remaining = raw.substring(3);

        return first3 + remaining;
    }

    static String validateAndFormat(String code) {

        // Check length
        if (code.length() != 13) {
            return "Invalid: Wrong length";
        }

        // Check first 3 characters are letters
        for (int i = 0; i < 3; i++) {
            if (!Character.isLetter(code.charAt(i))) {
                return "Invalid: Non-letter publisher code";
            }
        }

        // Check remaining 10 characters are digits
        for (int i = 3; i < 13; i++) {
            if (!Character.isDigit(code.charAt(i))) {
                return "Invalid: Non-digit body";
            }
        }

        // Format the valid code
        String publisher = code.substring(0, 3);
        String year = code.substring(3, 7);
        String catalog = code.substring(7, 13);

        StringBuilder result = new StringBuilder();

        result.append("[")
              .append(publisher)
              .append("] YEAR: ")
              .append(year)
              .append(" | CATALOG: ")
              .append(catalog);

        return result.toString();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter ISBN code: ");
        String raw = sc.nextLine();

        String code = normalizeCode(raw);

        String result = validateAndFormat(code);

        System.out.println(result);

        sc.close();
    }
}
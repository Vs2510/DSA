public class ibm {

    public static void main(String[] args) {
        String encodedDigits = "101112202123"; // Replace this with the encoded string of digits
        String password = decodePassword(encodedDigits);
        System.out.println("Decoded Password: " + password);
    }

    public static String decodePassword(String encodedDigits) {
        StringBuilder decodedPassword = new StringBuilder();
        int index = 0;

        while (index < encodedDigits.length()) {
            int value;
            if (index + 2 <= encodedDigits.length()) {
                value = Integer.parseInt(encodedDigits.substring(index, index + 2));
                if (value >= 65 && value <= 90) {
                    decodedPassword.append((char) value);
                    index += 2;
                    continue;
                }
            }
            if (index + 3 <= encodedDigits.length()) {
                value = Integer.parseInt(encodedDigits.substring(index, index + 3));
                if ((value >= 97 && value <= 122) || (value >= 32 && value <= 64)) {
                    decodedPassword.append((char) value);
                    index += 3;
                    continue;
                }
            }
            // If none of the valid values are found, break the loop
            break;
        }

        return decodedPassword.toString();
    }
}

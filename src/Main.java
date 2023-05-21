// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

    }

    public static String createPhoneNumber(int[] numbers) {
        StringBuilder phoneNumber = new StringBuilder();
        phoneNumber.append("(");
        for (int i = 0; i < numbers.length; i++) {
            if (i == 2) {
                phoneNumber.append(numbers[i] + ")");
            } else if (i == 3) {
                phoneNumber.append(" " + numbers[i]);
            } else if (i == 6) {
                phoneNumber.append("-" + numbers[i]);

            } else
                phoneNumber.append(numbers[i]);
        }


        return phoneNumber.toString();
    }
}
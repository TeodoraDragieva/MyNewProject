public class MiddleCharacter {

    public static void main(String[] args) {
        String str = "example";
        System.out.println("The middle character(s): " + getMiddleCharacter(str));
    }

    // Метод за извеждане на средния(ите) символ(и) на низ
    public static String getMiddleCharacter(String str) {
        int length = str.length();
        int middle = length / 2;

        if (length % 2 == 0) {  // Проверка за четен брой символи
            return str.substring(middle - 1, middle + 1); // Връща два символа
        } else {  // Проверка за нечетен брой символи
            return String.valueOf(str.charAt(middle)); // Връща един символ
        }
    }
}


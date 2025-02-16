public class MiddleCharacter {

    public static void main(String[] args) {
        String str = "example";
        System.out.println("The middle character(s): " + getMiddleCharacter(str));
    }
    public static String getMiddleCharacter(String str) {
        int length = str.length();
        int middle = length / 2;

        if (length % 2 == 0) {  
            return str.substring(middle - 1, middle + 1); 
        } else { 
            return String.valueOf(str.charAt(middle)); 
        }
    }
}



public class StringLenght {

    public static void main(String[] args){

        String str = "Assurance";
        System.out.println("The lenght of the word is: " + FindWordLenght(str));
    }
    public static String FindWordLenght(String str) {
        int lenght = str.length();

        return String.valueOf(str.charAt(lenght));
    }
}

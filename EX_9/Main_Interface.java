import java.util.Scanner;

interface StringOperations {
    String reversal(String input);
}

class StringProcessor implements StringOperations {
    @Override
    public String reversal(String input) {
        if (input == null) {
            return null;
        }
        
        StringBuilder sb = new StringBuilder(input);
        return sb.reverse().toString();
    }
}

public class Main_Interface {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringProcessor processor = new StringProcessor();

        System.out.print("Enter a string to reverse: ");
        String userInput = sc.nextLine();

        String result = processor.reversal(userInput);

        System.out.println("Original String: " + userInput);
        System.out.println("Reversed String: " + result);
        
        sc.close();
    }
}
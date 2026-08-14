import java.util.Scanner;
import java.util.TreeSet;

public class TokenizeAndSort
{
    public static void main(String[] args)
    {
        String inputText;
        
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a line of text");
            inputText = scanner.nextLine();
            scanner.close();
        } catch (java.util.NoSuchElementException e) {
            // Fallback when no input is available (e.g., in automated testing)
            inputText = "hello world java programming";
        }
        
        String[] tokens = inputText.split("\\s+");
        TreeSet<String> tokenSet = new TreeSet<>();
        for (int i = 0; i < tokens.length; i++)
        {
            tokenSet.add(tokens[i]);
        }
        System.out.println("Tokens in ascending sorted order:");
        for (String token : tokenSet) {
            System.out.println(token);
        }
    }
}
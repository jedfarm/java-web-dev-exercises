package excercises;
import java.util.Scanner;
public class Alice {
    public static void main(String[] args) {
        String text = "Alice was beginning to get very tired of sitting by her sister on the bank, " +
                "and of having nothing to do: once or twice she had peeped into the book her sister was reading, " +
                "but it had no pictures or conversations in it, 'and what is the use of a book,' " +
                "thought Alice 'without pictures or conversation?'";
        String lcText = text.toLowerCase();
        Scanner input = new Scanner(System.in);
        System.out.println("Search for a specific word in the first sentence of  Alice’s Adventures in Wonderland" +
                "and we will let you know if it belongs in the sentence -true- or not -false-");
        String searchTerm = input.nextLine();
        //System.out.println(text.toLowerCase().contains(searchTerm.toLowerCase()));
        if (text.toLowerCase().contains(searchTerm.toLowerCase())){
            System.out.println("Index: " + lcText.indexOf(searchTerm.toLowerCase()));
            System.out.println("Length:" + searchTerm.length());
            String newText = text.replace(searchTerm, "");
            System.out.println(newText);
        } else {
            System.out.println(false);
        }
    }
}

package stringSearch;
import java.util.Locale;
import java.util.Scanner;

public class stringSearch {
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);

        String alice= " Alice was beginning to get very tired of sitting by her " +
                "sister on the bank, and of having nothing to do: once or twice she had " +
                "peeped into the book her sister was reading, but it had no pictures or conversations " +
                "in it, 'and what is the use of a book,' thought Alice 'without pictures or conversation?'\n";

        System.out.println("Search for a word or phrase: ");
        String userSearch=input.next();

//        stringing methods together to solve problem
//        System.out.println(alice.toUpperCase().contains(userSearch.toUpperCase()));

//        breaking problem into smaller pieces
        userSearch=userSearch.toLowerCase();
        alice= alice.toLowerCase();

        boolean result=alice.contains(userSearch);
//        add step 5 code, removes user search from string
        if(alice.contains(userSearch)){
            alice= alice.replace(userSearch, "");

        }

        System.out.println(result);
        System.out.println(alice);

    }
}

public class TakesLonger {
    public static void main(String[] args) {

        String quote = "Hofstadter's Law: It you expect, even when you take into account Hofstadter's Law.";

        // When saving this quote a disk error has occured. Please fix it.
        // Add "always takes longer than" to the StringBuilder (quote) between the words "It" and "you"
        // Using pieces of the quote variable (instead of just redefining the string)

        System.out.println(quote);
        String regex = "you";
        String[] splittedString = quote.split(regex,2);
        String toChangeWith = "always takes longer than";
                quote = splittedString[0] + "always takes longer than" + " " + regex + splittedString[1];
        System.out.println(quote);


    }
}
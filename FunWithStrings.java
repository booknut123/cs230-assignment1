
/**
 * Decides whether a given String is a palindrome - read the same left-to-right and right-to-left.
 * Currently only supports alphanumeric characters... could be expanded. (ex: "Was it a cat I saw?" returns false, both because the spacing is not palindromic and because there is a question mark.)
 * Currently returns empty Strings as true, because they read as empty both forwards and backwards.
 *
 * @author Kailyn Lau
 * @version v1.0
 */
public class FunWithStrings
{
    /**
     * Instance method reverseString takes returns param originalString in reverse character order (ex: red becomes der)
     * Non-static because instance methods are not static.
     * Public because there is no sensitive information and this method could be used elsewhere in other projects.
     * 
     * @param originalString String with the text to be reversed
     * @return               the reverse of the String
     */
    public String reverseString(String originalString) {
        String answer = "";

        // starting from the end of the String and working backwards
        for (int i = originalString.length(); i > 0; i--) {
            answer += originalString.charAt(i - 1);
        }

        return answer;
    }

    /**
     * Predicate instance method theSame checks if params string1 and string2 are the same or not (char by char comparison, ignoring case).
     * In this exercise string2 should be the same length as string1 but a check was added just in case (or for a future task)
     * Non-static because instance methods are not static.
     * Public because there is no sensitive information and this method could be used elsewhere in other projects.
     * 
     * @param string1
     * @param string2
     * @return        true if the two are the same and false otherwise
     */
    public boolean theSame(String string1, String string2) {
        if (string1.length() != string2.length()) { // not needed since string2 should be the reverse of string1 and therefore the same length, but added just in case
            return false;
        }
        
        for (int i = 0; i < string1.length(); i++) {
            if (string1.toLowerCase().charAt(i) != string2.toLowerCase().charAt(i)) {
                return false;
            }
        }

        return true;
    }

    /**
     * Predicate instance method backAndForth calls reverseString and theSame in order to check whether param String toCheck is a palindrome or not.
     * Non-static because it is related to reverseString() and theSame() and constistency is good (plus the design is just better - if the project were to be expanded with instance variables or explicit objects needed to be created, non-static would suit design needs better)
     * Public because there is no sensitive information and this method could be used elsewhere in other projects.
     * 
     * @param toCheck the String to check
     * @returns       true if palindrome, false otherwise
     */
    public boolean sameBackAndForth(String toCheck) {
        String reversedString = reverseString(toCheck);
        return theSame(toCheck, reversedString);
    }

    /**
     * Main method for testing cases. Calls a FunWithStrings object to test. Includes expected output.
     */
    public static void main (String[] args) {
        FunWithStrings palindrome = new FunWithStrings();
        
        /* The introduction to the exercise says to output "yes"/"no", but the example outputs "true"/"false".
         * The code below will output "true"/"false".
         * In order to output "yes"/"no", change to an if statement - if (palindrome.backAndForth()) then print "yes", else print "no"
         */
        
        System.out.println("Input: ' '" + "| Expected: true | Computed: " + palindrome.sameBackAndForth(""));
        System.out.println("Input: a " + "| Expected: true | Computed: " + palindrome.sameBackAndForth("a"));
        System.out.println("Input: in " + "| Expected: false | Computed: " + palindrome.sameBackAndForth("in"));
        System.out.println("Input: dad " + "| Expected: true | Computed: " + palindrome.sameBackAndForth("dad"));
        System.out.println("Input: computer " + "| Expected: false | Computed: " + palindrome.sameBackAndForth("computer"));
        System.out.println("Input: Was it a cat I saw? " + "| Expected: false | Computed: " + palindrome.sameBackAndForth("Was it a cat I saw"));
    }
}

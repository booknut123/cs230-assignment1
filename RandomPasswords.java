import java.util.Random;
/**
 * Outputs a pseudorandom password of given length (hard-coded for the moment but can be adjusted to scan for user preferences).
 * Password starts with consonant and alternates between vowels and consonants. Password consists of only capital letters.
 * 
 * @author Kailyn Lau
 * @version v1.1
 */
public class RandomPasswords
{
    /**
     * Returns String of n letters, alternating between vowels and consonants (starting with consonant). All uppercase.
     *
     * @param  n  integer specifying length of output
     * @return    a word consisting of n pseudorandom letters
     */
    public static String generateRandomPassword(int n) {
        Random generator = new Random();
        String password = "";

        for (int i = 1; i < n + 1; i++) {
            char ch = (char)(generator.nextInt(26) + 65);
            // TIP 1 suggests defining String alphabet instead of using ASCII characters. If alphabet is used, generate int from 0 (inc.) to 26 (exclusive) and call String.charAt(i).

            if (isEven(i)) { // vowel in every even
                while (!isVowel(ch)) {
                    ch = (char)(generator.nextInt(25) + 66);
                }
            } else { // consonant in every odd
                while(isVowel(ch)) {
                    ch = (char)(generator.nextInt(25) + 66);
                }
            }

            password += ch;
        }

        return password;
    }

    /**
     * Predicate method determining whether a given char is a vowel or not.
     * Assumption - ch is uppercase because of generateRandomPassword(). Can/will edit later if need be.
     * 
     * @param  ch  given char to be checked
     * @return     true if vowel, false if not
     */
    public static boolean isVowel(char ch) {
        return ((ch == 'A') || (ch == 'E') || (ch == 'I') || (ch == 'O') || (ch == 'U'));
    }

    /**
     * Predicate method determining whether a given int is even or not.
     * 
     * @param  n  given int to be checked
     * @return    true if even, false if not
     */
    public static boolean isEven(int n) {
        return (n % 2 == 0);
    }
    
    /**
     * Main method. Hard-coded to output 5 random passwords by calling generateRandomPassword.
     */
    public static void main (String[] args) {
        for(int i = 4; i < 9; i++) {
            System.out.println(generateRandomPassword(i));
        }
    }
}

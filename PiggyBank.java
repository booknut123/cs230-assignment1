import java.util.Scanner;
/**
 * Makes correct change for a given amount of money.
 * Prompts the user for an amount of money (dollars and cents) and then prints out the correct change using the fewest possible number of $20 bills, $10 bills, $5 bills, $1 bills, quarters, dimes, nickels, and pennies.
 *
 * @author Kailyn Lau
 * @version v1.0
 */
public class PiggyBank
{
    int cents = 0; // instance variable for non-static methods referring to the total amount of cents not accounted for

    /**
     * Instance method makeChangeWithOneDenomination takes three params and returns the needed amount of denominationName in total.
     * Non-static because it references and changes instance variable cents.
     * Public because there is no sensitive information and this method could be used elsewhere in other projects.
     * 
     * @param total            the total amount of money
     * @param denominationName the name of the bill/coin to be counted
     * @param denomination     the integer representation of the amount of cents in that bill/coin
     * @return                 the max amount of denominationName that fit in total
     */
    public String makeChangeWithOneDenomination(int total, String denominationName, int denomination) {
        int number = total/denomination;
        if (number == 0) { // if there are no bills do not return anything
            return "";
        }
        cents -= number * denomination; //adjust the total amount of cents not accounted for
        return number + " " + denominationName + "\n";
    }

    /**
     * Static method convertToCents takes a double representing the number of dollars and converts it to an int representing the number of cents.
     * Assumes that dollars is a valid double consisting only of numbers, has 2 decimal points etc.
     * Static because this method can be used with any Bank object.
     * Public because there is no sensitive information and this method could be used elsewhere in other projects.
     * 
     * @param dollars
     * @return        dollars converted to cents
     */
    public static int convertToCents (double dollars) {
        return (int)Math.round(dollars * 100);
    }

    /**
     * Instance method makeChange that, when given a certain double representing dollars, calls convertToCents and makeChangeWithOneDenomination and returns the correct change using the fewest possible number of various bills/coins.
     * Non-static because this method calls non-static makeChangeWithOneDenomination and is a very specific method (only breaks down into certain bills)
     *      Ex: would not work for foreign currency.
     * Public because there is no sensitive information and this method could be used elsewhere in other projects.
     * 
     * @param dollars the amount of dollars to be broken down
     * @return String with neat output of divided bills/coins
     */
    public String makeChange (double dollars) {        
        String answer = "";
        cents = convertToCents(dollars);

        // if you don't like the () plural additions, the plural vs singular could be hard coded in makeChangeWithOneDenomination - if number = 1 && denominationName.equals()...
        answer += makeChangeWithOneDenomination(cents, "$20 bill(s)", 2000);
        answer += makeChangeWithOneDenomination(cents, "$10 bill(s)", 1000);
        answer += makeChangeWithOneDenomination(cents, "$5 bill(s)", 500);
        answer += makeChangeWithOneDenomination(cents, "$1 bill(s)", 100);
        answer += makeChangeWithOneDenomination(cents, "quarter(s)", 25);
        answer += makeChangeWithOneDenomination(cents, "dime(s)", 10);
        answer += makeChangeWithOneDenomination(cents, "nickel(s)", 5);
        answer += makeChangeWithOneDenomination(cents, "penny/ies", 1);

        return answer;
    }

    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        PiggyBank bank = new PiggyBank();

        while (true) {
            System.out.print("How much money do you want to make change for? (Enter 0.0 to quit) ");
            double amount = scan.nextDouble();

            if (amount ==  0.0) {
                break;
            }

            System.out.println("We can make change for " + String.format("%.2f", amount) + " using: ");
            System.out.println(bank.makeChange(amount));
        }
    }
}

[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/-JkDDUvb)
# CS230X-assignment1-F24
# Java Review Assignment

In this assignment, you will work on 3 exercises related to concepts we have covered in the first week of CS230X. 

Goals:
- [ ] Practice with Java's primitive data types, expressions and operators
- [ ] Work with some core classes from the Java API (String, Scanner, Random)
- [ ] Defining and invoking methods
- [ ] Writing some simple java programs
- [ ] Selecting appropriate inputs for testing cases
- [ ] Applying meticulous style and documentation to your code

Getting started:
1. Follow the problem solving strategies you learned in Lab1 for each exercise: planning testing cases then writing pseudocode.
2. When you are ready for coding, create a new BlueJ Project for this assignment.
3. In this project, create 3 new classes:  PiggyBank (exercise 1), FunWithStrings (exercise 2), RandomPasswords (exercise 3).
4. Complete your solutions for each exercise in these classes.

---
 
**EXERCISE 1: Making Change**

Write an application, PiggyBank, that makes correct change for a given amount of money. Your program should prompt the user for an amount of money (dollars and cents) and then print out the correct change using the fewest possible number of $20 bills, $10 bills, $5 bills, $1 bills, quarters, dimes, nickels, and pennies.

Requirements for this task:
1. You must define a method `makeChangeWithOneDenomination(int total, String denominationName, int denomination)` that returns a String containing the number of bills/coins needed from that particular `denominationName`.
2. You must define a method `convertToCents(double dollars)` that returns an int representing the number of cents equivalent to the input dollars.
3. You must define a method `makeChange(double dollars)` which calls `convertToCents(double dollars)` to obtain an amount of cents corresponding to the input dollars, and also calls `makeChangeWithOneDenomination()` for each denomination. This method returns a String summarizing the decomposition of the input dollars into the number of bills and coins necessary to make change for this amount.
4. In addition to explaining the purpose of each method, in the header javadoc for each method you must specify why you chose to make them static or not and private or public.
5. In your `main()`, you must use the Scanner class to read in the user's dollar input (from the keyboard), as a double.
6. The user can input values several times to make change for each one.
7. The program must exit when the user enters 0.0.
8. Your program should behave as shown below:
```
How much money do you want to make change for? 48.94
We can make change for 48.94 using:
2 $20 bills 
1 $5 bills 
3 $1 bills 
3 quarters 
1 dimes 
1 nickels 
4 pennies
```

Constraints for this task:
1. You cannot use classes that we have not discussed in class in CS230X.
2. You cannot use loops and arrays for this exercise.
   
> **Note:** You can assume that the amount entered by the user is a valid decimal number, (like 35.51 for example), indicating dollars and cents. You do not need to handle invalid inputs, for example negative numbers, non-numbers (like 2a34 ), numbers with fractional amount of cents (like 32.15485).

Once you have spent some time thinking about this problem, you can check the extra tips below:

<details>
<summary>Click to view TIP 1</summary>
 
>For this particular program, one good testing case would be to run it with input $36.41.

</details>

<details>
<summary>Click to view TIP 2</summary>

 >It can be helpful to look at the [round method in the Math class](https://docs.oracle.com/javase/8/docs/api/java/lang/Math.html#round-double-) to help your conversion.

</details>

---

**EXERCISE 2: Reading text R2L and L2R**

Text can be read either left-to-right (L2R), like in Anglophone languages, or right-to-left (R2L), like in Hebrew or Arabic. However, there are pieces of text that read exactly the same R2L and L2R, in the same language! Such texts are 'dad' and 'madamiamadam' in English. In this problem you are asked to write a program to decide whether a given String holds the property of reading the same from L2R and R2L, and report the result: `Yes` if the string holds the property, and `No` in the opposite case.

Requirements for this task:

1. Write a instance method `reverseString()` takes as input a string and returns another string with its characters in reverse order.
2. Write a predicate instance method `theSame()` that compares two input strings (the original and the reversed copy) character-by-character. If all characters match, then it returns true. If not, it returns false.
3. Write a predicate method `sameBackAndForth()` that takes as input a string and determines whether it reads the same L2R and R2L.
4. Do not use the `equals()` neither the `compareTo()` methods from the `String` class here.
5. In addition to explaining the purpose of each method, in the header javadoc for each method you must specify why you chose to make them static or not and private or public.
6. Add a `main()` method to hold  testing. Testing results should include both expected and computed outcome, such as:
```
Input: dad | Expect: true | Computed: true
```

Once you have spent some time thinking about this problem, you can check the extra tips below:

<details>
<summary>Click to view TIP 1</summary>
 
>Input can contain upper or lower case characters. The case of a character should be disregarded when it comes to the L2R and R2L comparison.

</details>

<details>
<summary>Click to view TIP 2</summary>
 
>Use testing strings of various lengths (like 0, 1, 2, 3 and a longer one). Some of the testing strings should read the same in both directions, others not.

</details>

---

**EXERCISE 3: Random Passwords**

People have trouble coming up with random passwords, so some companies are trying to help by generating random passwords for them. A good random password should appear "pronounceable", that is, one could attempt to read it as if it was a real word.
In this assignment we will create pronounceable random passwords by coming up with words that do not have two vowels or two consonants in a row. 

Some example passwords that meet these criteria:<br>
WUZE<br>
REGOL<br>
DIDUGO<br>
QUGEBUT<br>
PIBEMAMA<br>

You are asked to write a program, RandomPasswords, that generates such random passwords of various lengths. 

Requirements for this task:

1. Write a method, `generateRandomPassword()`, that takes as input an integer n, and produces a word consisting of n random letters.
2. The output of `generateRandomPassword()` has length n, and has a vowel in every even location, but never in an odd location. See the example above.
3. In defining the method `generateRandomPassword()` you MUST use the predicate helper methods that we saw in class: isVowel() and isEven().
4. Your generated passwords should only contain capital letters.
5. The main() method should call the `generateRandomPassword()` to produce 5 random passwords with lengths 4, 5, 6, 7, and 8, as in the example above.

Once you have spent some time thinking about this problem, you can check the extra tips below:

<details>
<summary>Click to view TIP 1</summary>
 
>Define a String named alphabet that contains all the capital letters of the English alphabet, such as: `String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";` 
Pick a random character from this alphabet.

</details>

<details>
<summary>Click to view TIP 2</summary>

 >How can you make sure the random character you chose is a vowel? (Or a consonant?) Use a loop keep to keep choosing a random character until you find one that is a vowel. (Similarly for choosing a consonant.)

</details>

---
## GRADING RUBRIC
Your assignment will be graded on accuracy (60%), [rigorous testing](https://docs.google.com/document/d/19cKOyolT8UtSfMNrVw8MGgVWS-lYgHpBs8g2Cf_8Vvc/edit#heading=h.rt39ohf1jp6s) that covers basic functionality and edge cases (20%), and meticulous [style](https://docs.google.com/document/d/14uwj9HAjNKfFBm0ZjUpWR7jdqKSj13rudIEJaG74mPk/edit), and [documentation](https://docs.google.com/document/d/15uqs_NH8y2sAuLLpiZuSxlI0UsL6a8CHuWY_qcvF4B4/edit) (20%).

## SAVING YOUR WORK ON GITHUB
As we have discussed in class, it is important to work on labs and assignments regularly and save frequently. You should test your work incrementally, which will require you to save your file before compiling/running it. In addition to saving your work on your local machine, you should also frequently push your work to this Github repository. You can refer to Lab0 and the [Git and Github tutorial](https://github.com/CS230X-F24/github-starter-course) for a refresher on using these tools. 

## SUBMITTING TO GRADESCOPE
Turn in your work submitting **only** files PiggyBank.java, RandomPasswords.java, FunWithStrings.java to your Gradescope account for Assignment 1. [Click here for Gradescope instructions.](https://docs.google.com/document/d/1zGAJrbdAhfPZVlyDP9N3MmdKXWvNo7rQqehKNM5Q0_M/edit) 

## ASSIGNMENT SOLUTIONS
Assignment solutions will not be shared. If you did not get full credit on the assignment, you should review the feedback and ask me or the TAs if you have further questions.   

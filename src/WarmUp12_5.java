/** Scenario
    You are part of a development team that's working on a dice-based Android game. It
 involves rolling multiple dice, counting up the sum, with payoffs for different outcomes—sort of
 a generalized craps game, but with the flexibility of having more than 2 dice, and dice with
 a number of sides different than 6.
    Problem

 One of the features will be to gather roll statistics and plot them against the histogram of
 theoretical roll frequencies. To do that, you need to implement a method that will take 2
 parameters: the number of dice, and the number of sides on each die. The return value will
 be an int[], where each element is the number of ways that the corresponding sum can be rolled,
 with the stated dice configuration. The wrinkle is that element 0 will always correspond to the
 lowest roll possible, not to the number of ways that you can roll a 0 (which is, of course, 0).

 For example, for 1 die with 6 sides, the array you would return has the
 values {1, 1, 1, 1, 1, 1}, since there are 6 possible outcomes, each of which can be rolled in
 exactly 1 way; the 0 element is the number of ways to roll the lowest outcome (1), the
 1 element is the number of ways to roll the next lowest outcome (2), etc.

 With 2 dice and 6 sides, the method would return {1, 2, 3, 4, 5, 6, 5, 4, 3, 2, 1}, where e
 lement 0 is the number of ways (1) to roll the lowest possible value with 2 dice (2), element 1
 is the number of ways (2) to roll the next lowest value (3), all the way up to element 10, which
 is the number of ways (1) to roll the highest possible value (12).

 Method signature & return type
    int[] diceHistogram(int numDice, int numSides)
*/

public class WarmUp12_5 {

}

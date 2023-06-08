package Medium;

import java.util.HashMap;
import java.util.Scanner;

public class BlackjackProbability {


    /* Write a function that takes in a target value as a dealer's startingHand value and returns the
    * probability that the dealer will bust (go over target value before standing). The target value will
    * always be positive integer, and the startingHand value will always be a positive integer that's smaller
    * or equal to the target value.
    *
    * For simplicity, you can assume that the dealer has an infinite deck of cards and that each card has a
    * value between 1 and 10 inclusive. The likelihood of drawing a card of any value is always the same,
    * regardless of previous draws.
    *
    * Your solution should be rounded to 3 decimal places and to the nearest value. For example, a probability
    * of 0.314159 would be rounded to 0.314, while a probability of 0.1337 would be rounded to 0.134 */

    // O(t - s) time | O(t - s) space where t is a target value, s is a startingHand,
    // as t - s  represents the maximum number of calculations to be made
    public static void main(String[] args) {

        System.out.println("Enter starting hand:");
        Scanner scan = new Scanner(System.in);

        int startingHand = scan.nextInt();

        System.out.println("You entered: " + startingHand);

        int target = 21;

        float result = blackjackProbability(target, startingHand);
        System.out.println(result);

    }

    public static float blackjackProbability(int target, int startingHand) {
        HashMap<Integer, Float> memo = new HashMap<Integer, Float>();

        return Math.round(calculateProbability(target, startingHand, memo) * 1000f) / 1000f;
    }

    private static float calculateProbability(int target, int currentHand, HashMap<Integer, Float> memo) {
        if(memo.containsKey(currentHand)){
            return memo.get(currentHand);
        }
        if(currentHand > target){
            return 1;
        }
        if(currentHand +4 >= target){
            return 0;
        }

        float totalProbability = 0;
        for(int i = 1; i<=10; i++){
            totalProbability += 0.1 * calculateProbability(target,currentHand + i, memo);
        }
        memo.put(currentHand, totalProbability);
        return totalProbability;
    }
}

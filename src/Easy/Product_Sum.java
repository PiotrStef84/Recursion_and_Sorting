package Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Product_Sum {

    /* Write a function that takes in a "special" array and returns its product sum.
    * A "special" array is a non-empty array that contains either integers or other "special" arrays. The product sum of a
    * "special" array is the sum of its elements, where "special" arrays inside it are summed themselves and then
    * multiplied by their level depth.
    *
    * The depth of a "special" array is how far nested it is. For instance, the depth of [] is 1; the depth of the
    * inner array in [[]] is 2; the depth of the innermost array in [[[]]] is 3.
    *
    * Therefore, the product sum of [x,y] is x+y; the product sum of [x, [y, z] is x + 2 *(y + z);
    * the product sum of [x, [y, [z]]] is x + 2 * (y + 3z). */

    public static void main(String[] args) {

        // Creating test array -> containing both numbers and nested arrays
        List<Object> test = new ArrayList<Object>(Arrays.asList(
                5,
                2,
                new ArrayList<Object>(Arrays.asList(7, -1)),
                3,
                new ArrayList<Object>(
                        Arrays.asList(6, new ArrayList<Object>(Arrays.asList(-13,8)), 4)
                )
        ));

        int finalSum = productSum(test);

        System.out.println(finalSum);
    }
    // O(n) time -> n is all elements in array including elements in each sub-array
    // O(d) space -> d is the greatest depth of sub-arrays
    private static int productSum(List<Object> array) {
        int finalSum = 0;

        // created a function that takes in a multiplier
        finalSum = productSumHelper(array, 1);

        return finalSum;
    }

    private static int productSumHelper(List<Object> array, int multiplier) {
        int sum = 0;

        // Checking if object in an array is an instance of an array or an integer.
        for(Object obj : array){
            if( obj instanceof ArrayList){
                ArrayList<Object> ls = (ArrayList<Object>) obj;
                sum += productSumHelper(ls, multiplier + 1);
            } else {
                sum += (int) obj;
            }
        }
        return sum * multiplier;
    }
}



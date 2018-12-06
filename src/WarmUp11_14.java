
/** 1. Create 2 arrays of int values, each with 50 elements. For the purposes of the
    directions below, I'll call these array1 and array2, but you don't have to call them that.
 2. Using a for loop, assign a random int value (from the full range of the int type) to each
    element of each of the arrays. (Hint: Look at the methods of
    java.util.Random to find the best one for this purpose.)
 3. Print out the contents of both arrays. (Hint: You don't need a loop to do this part.)
 4. Iterate over the 2 arrays using a single for loop—that is, when you're looking at
    element i of the first array, you should also be looking at element i of the
    second array. For each i, do the following (read carefully
        a. Assign the value (array1[i] ^ array2[i]) to array1[i].
        b. Assign the value (array1[i] ^ array2[i]) to array2[i].
        (Hint: Don't assume that the value computed in step 4a for (array1[i] ^ array2[i])
        is still valid; it's not. You'll have to recompute it.)
        c. Assign the value (array1[i] ^ array2[i]) to array1[i].
    (Hint: same as above. Another hint: You can—and probably should—do all three of the
    above assignments without creating any local variables inside the body of the loop.)
  5. Print out the contents of both arrays.
    What do you observe when comparing the output from steps 3 & 5?
    Is there something unexpected? If so, can you think of an explanation for it?
    Post what you observe, and any conclusions you can draw from it, here in Slack.

 */

//import java.util.Arrays;
//import java.util.Random;
//
//public class WarmUp11_14 {
//
//    private static final int ARRAY_SIZE = 50;
//
//    private static int[] array1;
//    private static int[] array2;
//
//    public static void main(String[] args) {
//        initialize();
//        print();
//        process();
//        print();
//    }
//
//    private static void initialize() {
//        Random rng = new Random();
//        array1 = new int[ARRAY_SIZE];
//        array2 = new int[ARRAY_SIZE];
//        for (int i = 0; i < ARRAY_SIZE; i++) {
//            array1[i] = rng.nextInt();
//            array2[i] = rng.nextInt();
//        }
//    }
//
//    public static void process(){
//        for (int i = 0; i < ARRAY_SIZE; i++){
//            array1[i] = array1[i] ^ array2[i];
//            array2[i] = array1[i] ^ array2[i];
//            array1[i] = array1[i] ^ array2[i];
//
//        }
//    }
//
//    public static void print(){
//        System.out.printf("array1 = %s%n", Arrays.toString(array1));
//        System.out.printf("array2 = %s%n", Arrays.toString(array2));
//
//    }
//}

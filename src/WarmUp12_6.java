/**
 *
 * Challenge
 Implement (in code or very unambiguous pseudocode) a method to search for a specified int value
 in an already-sorted int[], returning the index position in the array where the value is found.

 Write your implementation without any calls to the standard library (e.g. no use of Arrays.search).

 If the searched-for value is not present in the array, return some value indicating
 (in some fashion) the position in the array where the value could be inserted, without affecting
 the sorted state of the array. (Note: There's one commonly used approach to this, but it's not
 necessarily the only one possible. Also, keep in mind that returning a value and throwing an
 exception are mutually exclusive at runtime.)

 Signature & return type
 int search(int[] haystack, int needle)

 Questions for reflection
 Would the same approach work with a sorted list? What about a sorted ArrayList (in particular)?
 Is there some way you could tell whether some list is amenable to your search method?

 Assume we're searching for an object, rather than a primitive value. In this case, the index
 position we want to return is one where the object in that position (let's call it obj) is equal
 to our needle, according to the equals method; that is, obj.equals(haystack) is true. How would
 your code need to change? What should we assume/require about the objects in the array?
 */

//public class WarmUp12_6 {
//
//  int search(int[] haystack, int needle){
//   return search(haystack, needle, 0, haystack.length);
//  }
//  int search(int[] haystack, int needle, int from, int to){
//    if (from == to){
//      return ~from;
//    }
//    int midpoint = (from + to)/2;
//    int test = haystack[midpoint];
//    if (test == needle){
//      return midpoint;
//    }if (test > needle){
//      return search(haystack,needle,from,midpoint);
//    }else{
//      return search(haystack,needle,midpoint+1, to);
//    }
//  }
//}

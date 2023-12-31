/*Use two nested loops to compare each element of one array with all elements of the other array.
If there's a match, add it to the intersection list.
Time Complexity: O(n^2) */
public class Array_intersection {
    public static void main(String args[]) {
        int myArray1[] = {23, 36, 96, 78, 55};
        int myArray2[] = {78, 45, 19, 73, 55};
        System.out.println("Intersection of the two arrays ::");
       
        for(int i = 0; i<myArray1.length; i++ ) {
           for(int j = 0; j<myArray2.length; j++) {
              if(myArray1[i]==myArray2[j]) {
                 System.out.println(myArray2[j]);
              }
           }
        }
     }
}

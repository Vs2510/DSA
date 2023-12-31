public class LeadersInArray {

    public static int[] findLeaders(int[] arr) {
        int n = arr.length;
        int[] leaders = new int[n]; // Initialize an array to store leaders
        int count = 0; // Count of leaders found
        int maxRight = arr[n - 1]; // Rightmost element is always a leader
        leaders[count++] = maxRight;

        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] > maxRight) {
                maxRight = arr[i];
                leaders[count++] = maxRight;
            }
        }

        // Create a new array with only the leaders (as the 'leaders' array might have extra 0s)
        int[] result = new int[count];
        for (int i = 0; i < count; i++) {
            result[i] = leaders[count - 1 - i]; // Reversing to get in ascending order
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {16, 17, 4, 3, 5, 2};
        int[] leaders = findLeaders(arr);
        System.out.print("Leaders in the array: ");
        for (int leader : leaders) {
            System.out.print(leader + " ");
        }
    }
}

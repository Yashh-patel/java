public class ReverseArray {
    public static void main(String[] args) {
        // Example array
        int[] array = {1, 2, 3, 4, 5};

        System.out.println("Original array:");
        for (int i : array) {
            System.out.print(i + " ");
        }

        reverseArray(array);

        System.out.println("\nReversed array:");
        for (int i : array) {
            System.out.print(i + " ");
        }
    }

    // Method to reverse the array
    public static void reverseArray(int[] array) {
        int start = 0;
        int end = array.length - 1;

        while (start < end) {
            // Swap the elements at start and end
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;

            // Move the pointers
            start++;
            end--;
        }
    }
}

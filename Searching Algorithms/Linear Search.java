class LinearSearch {
    // Method to perform linear search
    public static int linearSearch(int[] array, int target) {
        for (int index = 0; index < array.length; index++) {
            if (array[index] == target) {
                return index;
            }
        }
        return -1;
    }

    // Main method
    public static void main(String[] args) {
        int[] array = {2, 3, 4, 10, 40};
        int target = 10;

        // Calling the linearSearch method
        int result = linearSearch(array, target);

        // Printing the result
        if (result == -1) {
            System.out.println("Element is not present in array");
        } else {
            System.out.println("Element is present at index " + result);
        }
    }
}

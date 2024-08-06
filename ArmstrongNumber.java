import java.util.Scanner;

class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        int[] array = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        // Print original array
        System.out.print("Original array: ");
        for (int i : array) {
            System.out.print(i + " ");
        }

        reverseArray(array);

        // Print reversed array
        System.out.print("\nReversed array: ");
        for (int i : array) {
            System.out.print(i + " ");
        }

        scanner.close();
    }

    public static void reverseArray(int[] array) {
        int left = 0;
        int right = array.length - 1;

        while (left < right) {
            // Swap the elements at the left and right indices
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;

            // Move the pointers towards the center
            left++;
            right--;
        }
    }
}

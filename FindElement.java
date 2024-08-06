import java.util.Scanner;

class FindElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        int[] array = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.print("Enter the element to find: ");
        int target = scanner.nextInt();

        boolean found = false;
        for (int i = 0; i < n; i++) {
            if (array[i] == target) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Element " + target + " is found in the array.");
        } else {
            System.out.println("Element " + target + " is not found in the array.");
        }

        scanner.close();
    }
}

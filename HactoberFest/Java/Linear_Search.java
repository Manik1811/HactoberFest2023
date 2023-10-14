import java.util.*;

class LinearSearch {
    public static int ls(int n[], int key) {
        for (int i = 0; i < n.length; i++) {
            if (n[i] == key) {
                return i; // Return the index where the key is found, not the key itself
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int n[] = new int[size];

        System.out.println("Enter the array elements: ");
        for (int i = 0; i < size; i++) {
            if (sc.hasNextInt()) {
                n[i] = sc.nextInt();
            }
        }

        System.out.print("Enter the key element: ");
        int key = sc.nextInt();
        int index = ls(n, key);

        if (index == -1) {
            System.out.println("Key not found");
        } else {
            System.out.println("Key is found at index: " + index);
        }
    }
}

// wap to perform linear search in a preinitalized array

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = { 1, 3, 5, 6, 8, 9, 4 };
        System.out.println("Enter a number you want to search");
        int key = sc.nextInt();
        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                System.out.println(key + " is at index" + " " + i);
                found = true;
            }
        }
        if (!found) {
            System.out.println(key + " not found in the array");
        }
    }
}
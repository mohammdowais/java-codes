// wap a program to implement call by value and call by reference
public class Calls {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println("Before swapping: a = " + a + " b = " + b);
        swap(a, b);
        System.out.println("After swapping: a = " + a + " b = " + b);
        int[] arr = { 10, 20 };
        System.out.println("Before swapping: arr[0] = " + arr[0] + " arr[1] = " + arr[1]);
        swap(arr);
        System.out.println("After swapping: arr[0] = " + arr[0] + " arr[1] = " + arr[1]);
    }

    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }

    public static void swap(int[] arr) {
        int temp = arr[0];
        arr[0] = arr[1];
        arr[1] = temp;
    }

}
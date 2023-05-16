package to.com;

public class ArrayRotation {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println("Original Array:");
        printArray(array);

        int rotationSteps = 5;
        rotateArray(array, rotationSteps);

        System.out.println("\nArray after right rotate by 5 steps:");
        printArray(array);
    }

    public static void rotateArray(int[] arr, int steps) {
        int length = arr.length;
        steps = steps % length;  
        
        reverseArray(arr, 0, length - 1);

        
        reverseArray(arr, 0, steps - 1);

        
        reverseArray(arr, steps, length - 1);
    }

    public static void reverseArray(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

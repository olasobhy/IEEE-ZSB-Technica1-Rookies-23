/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package heap;

public class Heap {

    static void swap(int x, int y) {
        int temp = x;
        x = y;
        y = temp;
    }

    static void heapyfy(int arr[], int size, int i) {
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        int max = i;
        if (arr[left] > arr[max]) {
            max = left;
        }
        if (arr[right] > max) {
            max = right;
        }
        if (max != i) {
            heapyfy(arr, size, max);

            swap(arr[i], arr[max]);

        }
    }

    public static void buildHeap(int arr[], int n) {
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapyfy(arr, n, i);
        }

    }

  /*  static void heapSort(int arr[], int n) {
        buildHeap(arr, n);
        for (int i = n - 1; i >= 0; i--) {
            swap(arr[0], arr[i]);
            heapyfy(arr, i, 0);
        }
    }
*/
    public static void main(String[] args) {
        int arr[] = {81, 13, 77, 24, 35, 61, 48, 3, 23, 87, 92, 95, 74, 57, 99, 86, 28, 15, 55};
        buildHeap(arr, arr.length - 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }

    }

}

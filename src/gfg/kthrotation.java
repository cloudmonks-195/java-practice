package gfg;

import java.util.Scanner;

public class kthrotation {

    public int kthr(int[] arr) {
        int n = arr.length;
        int low = 0, high = n - 1;

        while (low <= high) {

            // Array is already sorted
            if (arr[low] <= arr[high]) {
                return low;
            }

            int mid = low + (high - low) / 2;

            int prev = (mid - 1 + n) % n;
            int next = (mid + 1) % n;

            // Check if mid is the smallest element
            if (arr[mid] <= arr[prev] && arr[mid] <= arr[next]) {
                return mid;
            }

            // Left half is sorted
            if (arr[low] <= arr[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return 0;
    }

    public static void main(String[] args) {
        int arr[] = {5,1,2,3,4};

        kthrotation obj = new kthrotation();
        int result = obj.kthr(arr);

        System.out.println(result);
    }
}
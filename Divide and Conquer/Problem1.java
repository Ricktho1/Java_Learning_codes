import java.util.*;

public class Problem1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String arr[] = { "sun", "earth", "mars", "mercury" };
        mergesort(arr, 0, arr.length - 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }

    public static void mergesort(String arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }
        int mid = si + (ei - si) / 2;
        mergesort(arr, si, mid);
        mergesort(arr, mid + 1, ei);
        merge(arr, si, mid, ei);
    }

    public static void merge(String arr[], int si, int mid, int ei) {
        String temp[] = new String[ei + si - 1];
        int i = si;
        int j = mid;
        int k = 0;
        while (i <= mid && j <= ei) {
            if (arr[i].compareTo(arr[j]) < 0) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
            // left part
            while (i <= mid) {
                temp[k++] = arr[i++];
            }
            // right part
            while (j <= ei) {
                temp[k++] = arr[j++];
            }
            // copy temp to original
            for (k = 0; i <= si && k < temp.length; k++, i++) {
                arr[i] = temp[k];
            }
        }
    }
}
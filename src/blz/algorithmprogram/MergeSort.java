package blz.algorithmprogram;
import java.util.Scanner;

public class MergeSort{

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter size of the array: ");
        int n = in.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the array elements: ");
        for (int i = 0; i < n; ++i) {
            arr[i] = in.nextInt();
        }

        mergeSort(arr, 0, n - 1);

        System.out.println("Sorted the array elements: ");
        for (int i = 0; i < n; ++i) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void mergeSort(int[] arr, int lb, int ub) {
        if (lb < ub) {
            int mid = (lb + ub) / 2;

            mergeSort(arr, lb, mid);
            mergeSort(arr, mid + 1, ub);

            // Merge the two sorted arrays
            merge(arr, lb, mid, ub);
        }
    }

    public static void merge(int[] arr, int lb, int mid, int ub) {
        
        int n1 = mid - lb + 1;
        int n2 = ub - mid;

        int[] left = new int[n1];
        int[] right = new int[n2];

        for (int i = 0; i < n1; ++i) {
            left[i] = arr[lb + i];
        }

        for (int i = 0; i < n2; ++i) {
            right[i] = arr[mid + i + 1];
        }

        int i = 0, j = 0, k = lb;

        while (i < n1 && j < n2) {
            if (left[i] < right[j]) {
                arr[k] = left[i];
                i++;
            } else {
                arr[k] = right[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = left[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = right[j];
            j++;
            k++;
        }
    }
}







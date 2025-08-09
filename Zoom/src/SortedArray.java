import java.util.Scanner;
public class SortedArray {
    public static void main(String[] args) {




                Scanner sc = new Scanner(System.in);


                System.out.print("Enter size of array: ");
                int n = sc.nextInt();
                int[] arr = new int[n];

                System.out.println("Enter elements of rotated sorted array:");
                for (int i = 0; i < n; i++) {
                    arr[i] = sc.nextInt();
                }


                System.out.print("Enter target element: ");
                int target = sc.nextInt();

                int index = searchInRotatedArray(arr, target);
                if (index != -1) {
                    System.out.println("Element found at index: " + index);
                } else {
                    System.out.println("Element not found");
                }

                sc.close();
            }

            public static int searchInRotatedArray(int[] arr, int target) {
                int left = 0, right = arr.length - 1;

                while (left <= right) {
                    int mid = left + (right - left) / 2;

                    if (arr[mid] == target) {
                        return mid;
                    }


                    if (arr[left] <= arr[mid]) {
                        if (target >= arr[left] && target < arr[mid]) {
                            right = mid - 1;
                        } else {
                            left = mid + 1;
                        }
                    }
                    else {
                        if (target > arr[mid] && target <= arr[right]) {
                            left = mid + 1;
                        } else {
                            right = mid - 1;
                        }
                    }
                }

                return -1;
            }
        }





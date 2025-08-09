import java.util.Scanner;
public class MergeSortedArrays {
    //write a program to merge two sorted arrays in such a way that the final array remains sorted and no extra array is used
    //Implement basic String compression using counts of repeated characters(ex-"aaabb" becomes "a3b2") if the compressed string is longer,return original string
    //given a rotated sorted array,implement a modified binary search to find an element



        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);



            System.out.println("Enter size of first sorted array: ");
            int m = sc.nextInt();
            int[] arr1 = new int[m];

            System.out.println("Enter elements of first sorted array:");
            for (int i = 0; i < m; i++) {
                arr1[i] = sc.nextInt();
            }


            System.out.print("Enter size of second sorted array: ");
            int n = sc.nextInt();
            int[] arr2 = new int[n];

            System.out.println("Enter elements of second sorted array:");
            for (int i = 0; i < n; i++) {
                arr2[i] = sc.nextInt();
            }


            mergeInPlace(arr1, arr2);


            System.out.println("After merging in place:");
            System.out.print("Array 1: ");
            for (int num : arr1) {
                System.out.print(num + " ");
            }
            System.out.println();
            System.out.print("Array 2: ");
            for (int num : arr2) {
                System.out.print(num + " ");
            }

            sc.close();
        }

        public static void mergeInPlace(int[] arr1, int[] arr2) {
            int m = arr1.length;
            int n = arr2.length;

            for (int i = 0; i < m; i++) {
                if (arr1[i] > arr2[0]) {

                    int temp = arr1[i];
                    arr1[i] = arr2[0];
                    arr2[0] = temp;


                    int first = arr2[0];
                    int k;
                    for (k = 1; k < n && arr2[k] < first; k++) {
                        arr2[k - 1] = arr2[k];
                    }
                    arr2[k - 1] = first;
                }
            }
        }
    }



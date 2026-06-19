import java.util.Scanner;

public class Array_Merge {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Size of First Array: ");
        int size1 = sc.nextInt();

        int arr1[] = new int[size1];

        System.out.println("Enter First Array Elements:");

        for(int i=0;i<size1;i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.print("Enter Size of Second Array: ");
        int size2 = sc.nextInt();

        int arr2[] = new int[size2];

        System.out.println("Enter Second Array Elements:");

        for(int i=0;i<size2;i++) {
            arr2[i] = sc.nextInt();
        }

        int arr3[] = new int[size1 + size2];

        for(int i=0;i<size1;i++) {
            arr3[i] = arr1[i];
        }

        for(int i=0;i<size2;i++) {
            arr3[size1 + i] = arr2[i];
        }

        System.out.println("Merged Array:");

        for(int i=0;i<arr3.length;i++) {
            System.out.print(arr3[i] + " ");
        }

        sc.close();
    }
}
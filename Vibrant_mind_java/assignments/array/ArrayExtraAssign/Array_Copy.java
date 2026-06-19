import java.util.Scanner;

public class Array_Copy {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Size: ");
        int size = sc.nextInt();

        int arr1[] = new int[size];
        int arr2[] = new int[size];

        System.out.println("Enter Elements:");

        for(int i=0;i<size;i++) {
            arr1[i] = sc.nextInt();
        }

        for(int i=0;i<size;i++) {
            arr2[i] = arr1[i];
        }

        System.out.println("Copied Array:");

        for(int i=0;i<size;i++) {
            System.out.print(arr2[i] + " ");
        }

        sc.close();
    }
}
import java.util.Scanner;

public class Array_Insert {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Size: ");
        int size = sc.nextInt();

        int arr[] = new int[size + 1];

        System.out.println("Enter Elements:");

        for(int i=0;i<size;i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter Position: ");
        int pos = sc.nextInt();

        System.out.print("Enter Element: ");
        int element = sc.nextInt();

        for(int i=size;i>pos-1;i--) {
            arr[i] = arr[i-1];
        }

        arr[pos-1] = element;

        System.out.println("Array After Insertion:");

        for(int i=0;i<=size;i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}
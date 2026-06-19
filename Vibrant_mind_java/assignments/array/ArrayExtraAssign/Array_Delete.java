import java.util.Scanner;

public class Array_Delete {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Size: ");
        int size = sc.nextInt();

        int arr[] = new int[size];

        System.out.println("Enter Elements:");

        for(int i=0;i<size;i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter Position: ");
        int pos = sc.nextInt();

        for(int i=pos-1;i<size-1;i++) {
            arr[i] = arr[i+1];
        }

        size--;

        System.out.println("Array After Deletion:");

        for(int i=0;i<size;i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}
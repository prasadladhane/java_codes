import java.util.Scanner;

public class Array_Left_Rotate {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Size: ");
        int size = sc.nextInt();

        int arr[] = new int[size];

        System.out.println("Enter Elements:");

        for(int i=0;i<size;i++) {
            arr[i] = sc.nextInt();
        }

        int first = arr[0];

        for(int i=0;i<size-1;i++) {
            arr[i] = arr[i+1];
        }

        arr[size-1] = first;

        System.out.println("After Left Rotation:");

        for(int i=0;i<size;i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}
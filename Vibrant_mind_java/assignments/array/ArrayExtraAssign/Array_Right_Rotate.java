import java.util.Scanner;

public class Array_Right_Rotate {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Size: ");
        int size = sc.nextInt();

        int arr[] = new int[size];

        System.out.println("Enter Elements:");

        for(int i=0;i<size;i++) {
            arr[i] = sc.nextInt();
        }

        int last = arr[size-1];

        for(int i=size-1;i>0;i--) {
            arr[i] = arr[i-1];
        }

        arr[0] = last;

        System.out.println("After Right Rotation:");

        for(int i=0;i<size;i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}
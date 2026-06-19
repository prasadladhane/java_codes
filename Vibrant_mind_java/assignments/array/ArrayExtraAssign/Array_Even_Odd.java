import java.util.Scanner;

public class Array_Even_Odd {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Size: ");
        int size = sc.nextInt();

        int arr[] = new int[size];
        int even[] = new int[size];
        int odd[] = new int[size];

        int e = 0, o = 0;

        System.out.println("Enter Elements:");

        for(int i=0;i<size;i++) {
            arr[i] = sc.nextInt();
        }

        for(int i=0;i<size;i++) {

            if(arr[i] % 2 == 0)
                even[e++] = arr[i];
            else
                odd[o++] = arr[i];
        }

        System.out.println("Even Array:");

        for(int i=0;i<e;i++) {
            System.out.print(even[i] + " ");
        }

        System.out.println();

        System.out.println("Odd Array:");

        for(int i=0;i<o;i++) {
            System.out.print(odd[i] + " ");
        }

        sc.close();
    }
}
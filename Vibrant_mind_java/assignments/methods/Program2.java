import java.util.Scanner;

class Demo2 {

    static void reverseNumbers(int n) {

        while(n >= 1) {
            System.out.println(n);
            n--;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        reverseNumbers(n);
    }
}

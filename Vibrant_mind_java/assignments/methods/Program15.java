import java.util.Scanner;

class Demo15 {

    static void reverse(int n) {

        int rev = 0;

        while(n > 0) {

            int digit = n % 10;
            rev = rev * 10 + digit;
            n = n / 10;
        }

        System.out.println("Reverse = " + rev);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = sc.nextInt();

        reverse(n);
    }
}

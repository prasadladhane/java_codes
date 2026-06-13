import java.util.Scanner;

class Demo13 {

    static void sumDigits(int n) {

        int sum = 0;

        while(n > 0) {

            int digit = n % 10;
            sum = sum + digit;
            n = n / 10;
        }

        System.out.println("Sum = " + sum);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = sc.nextInt();

        sumDigits(n);
    }
}

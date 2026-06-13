import java.util.Scanner;

class Demo14 {

    static void productDigits(int n) {

        int product = 1;

        while(n > 0) {

            int digit = n % 10;
            product = product * digit;
            n = n / 10;
        }

        System.out.println("Product = " + product);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = sc.nextInt();

        productDigits(n);
    }
}

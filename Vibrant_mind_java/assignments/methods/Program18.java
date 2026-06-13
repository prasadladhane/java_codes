import java.util.Scanner;

class Demo18 {

    static void maximum(int a, int b, int c) {

        if(a > b && a > c) {
            System.out.println("Maximum = " + a);
        }
        else if(b > c) {
            System.out.println("Maximum = " + b);
        }
        else {
            System.out.println("Maximum = " + c);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.print("Enter third number: ");
        int c = sc.nextInt();

        maximum(a, b, c);
    }
}

import java.util.Scanner;

class Demo17 {

    static void maximum(int a, int b) {

        if(a > b) {
            System.out.println("Maximum = " + a);
        }
        else {
            System.out.println("Maximum = " + b);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        maximum(a, b);
    }
}

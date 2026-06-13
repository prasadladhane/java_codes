import java.util.Scanner;

class Demo19 {

    static void checkNumber(int n) {

        if(n > 0) {
            System.out.println("Positive");
        }
        else if(n < 0) {
            System.out.println("Negative");
        }
        else {
            System.out.println("Zero");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = sc.nextInt();

        checkNumber(n);
    }
}

import java.util.Scanner;

class Demo20 {

    static void divisible(int n) {

        if(n % 5 == 0 && n % 11 == 0) {
            System.out.println("Divisible by 5 and 11");
        }
        else {
            System.out.println("Not Divisible");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = sc.nextInt();

        divisible(n);
    }
}

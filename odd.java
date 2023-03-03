import java.util.Scanner;

public class odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("the number is" + oddEven(num));
        System.out.println(leapYear(num));
        // for (int i = 0; i < 5; i++) {
        // int num = sc.nextInt();
        // System.out.println(oddEven(num));
        // System.out.println(leapYear(num));
        // }
    }

    public static String oddEven(int num) {
        if (num % 2 == 0) {
            return "even";
        } else {
            return "odd";
        }
    }

    public static boolean leapYear(int num) {
        if (num % 4 == 0) {
            return true;
        }
        return false;
    }
}

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 6; i++) {
            int year = sc.nextInt();
            boolean leap=leapYear(year);
            System.out.println(leap);
        }
    }
    public static boolean leapYear(int year) {
        if (year % 4 == 0) {
            return true;      
        }
        return false;
    }
}
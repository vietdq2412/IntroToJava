import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input year");
        int year = sc.nextInt();

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println(year + " is leap year");
                } else {
                    System.out.println("not");
                }
            } else {
                System.out.println(year + " is leap year");
            }
        } else {
            System.out.println(" not");
        }

    }
}


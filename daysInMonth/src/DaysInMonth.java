import java.util.Scanner;

public class DaysInMonth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("input month: ");
        int month = sc.nextInt();

        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("tháng này có 31 ngày");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("tháng này có 30 ngày");
                break;
            case 2:
                System.out.println("tháng này có 28 hoặc 29 ngày");
                break;
            default:
                System.out.println("1 năm chỉ có 12 tháng !!");
        }

    }
}

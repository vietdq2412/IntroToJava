import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter amonut of usd: ");
        int usd = sc.nextInt();

        int vnd = usd * 23176;
        System.out.println(usd+"USD equal "+ vnd + "vnd");

    }
}

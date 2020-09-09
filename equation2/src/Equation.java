import java.util.Scanner;

public class Equation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input a: ");
        double a = sc.nextFloat();

        System.out.println("input b: ");
        double b = sc.nextFloat();

        System.out.println("input c: ");
        double c = sc.nextFloat();

        double rs1 = 0,rs2= 0,rs = 0;
        double delta = b*b - 4*a*c;

        if(a == 0){
                rs= -c/b;
                System.out.println("1 Nghieemj: "+rs);
            }else {
                if (c == 0){
                    System.out.println("vô số nghiệm");
                }else {
                    System.out.println("vo nghiệm");
                }
            }
        } else {
            if (delta < 0){
                System.out.println("vô nghiệm");
            }else if (delta >= 0) {
                System.out.println("nghiem 1: "+ (-b + Math.sqrt(delta))/(2*a));
                System.out.println("nghiem 2: "+(-b - Math.sqrt(delta))/(2*a));
            }
        }

    }
}

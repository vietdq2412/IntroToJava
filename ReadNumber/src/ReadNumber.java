import java.util.Scanner;

public class ReadNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter youe number: ");
        int num = sc.nextInt();
        int third = num % 10;
        int second = (num % 100) / 10;
        int first = num / 100;

        String rs = "";

        String threeNum;
        String twoNum;
        String oneNum;


        switch (first) {
            case 1:
                rs += "one hundred ";
                break;
            case 2:
                rs += "two hundred ";
                break;
            case 3:
                rs += "three hundred ";
                break;
            case 4:
                rs += "four hundred ";
                break;
            case 5:
                rs += "five hundred ";
                break;
            case 6:
                rs += "six hundred ";
                break;
            case 7:
                rs += "seven hundred ";
                break;
            case 8:
                rs += "eight hundred ";
                break;
            case 9:
                rs += "nine hundred ";
                break;
        }

        if (second != 0 && third != 0){
            rs += "and ";
        }


        if (second != 1) {
            switch (second) {
                case 0:
                    rs += "";
                    break;
                case 2:
                    rs += "twenty ";
                    break;
                case 3:
                    rs += "thirty ";
                    break;
                case 4:
                    rs += "forty ";
                    break;
                case 5:
                    rs += "fifty ";
                    break;
                case 6:
                    rs += "sixty ";
                    break;
                case 7:
                    rs += "seventy ";
                    break;
                case 8:
                    rs += "eighty ";
                    break;
                case 9:
                    rs += "ninety ";
                    break;
            }
        } else {
            switch (third) {
                case 0:
                    rs += "ten ";
                    break;
                case 1:
                    rs += "eleven ";
                    break;
                case 2:
                    rs += "twelve ";
                    break;
                case 3:
                    rs += "thirteen ";
                    break;
                case 4:
                    rs += "fourteen ";
                    break;
                case 5:
                    rs += "fifteen ";
                    break;
                case 6:
                    rs += "sixteen ";
                    break;
                case 7:
                    rs += "seventeen ";
                    break;
                case 8:
                    rs += "eighteen ";
                    break;
                case 9:
                    rs += "nineteen ";
                    break;
            }
        }

        if (second != 1){
            switch (third) {
                case 1:
                    rs += "one";
                    break;
                case 2:
                    rs += "two";
                    break;
                case 3:
                    rs += "three";
                    break;
                case 4:
                    rs += "four";
                    break;
                case 5:
                    rs += "five";
                    break;
                case 6:
                    rs += "six";
                    break;
                case 7:
                    rs += "seven";
                    break;
                case 8:
                    rs += "eight";
                    break;
                case 9:
                    rs += "nine";
                    break;
            }
        }


        System.out.println(rs);
    }
}

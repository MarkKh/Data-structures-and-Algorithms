import java.util.*;
import java.util.HashSet;

public class hashsetCoffeeShop {
    public static void main(String[] args) {
        HashSet<String> coupon = new HashSet<String>();
        coupon.add("A001");
        coupon.add("A002");
        coupon.add("A003");
        coupon.add("A004");
        coupon.add("A005");
        coupon.add("A006");
        coupon.add("A007");
        coupon.add("A008");
        coupon.add("A009");
        coupon.add("A010");
        int price[] = { 0, 50, 60, 70, 80, 85 };
        CoffeeMenu();
        int number = inputNumber();

        while (number != 6) {
            String check = "";
            if (number >= 1 && number <= 5) {
                check = inputCoupon();
                if (check.equalsIgnoreCase("0")) {
                    System.out.println("Totals : " + price[number] + " bath");
                } else if (coupon.contains(check)) {
                    int xx = price[number];
                    double result = xx - xx*0.10;
                    System.out.println("Totals : " + result + " bath");
                    coupon.remove(check);
                } else {
                    System.out.println("Totals : " + price[number] + " bath");
                }
            } else {
                System.out.println("==== Incorrect data Please enter new data. ====");
                System.out.println();
            }
            System.out.println();
            CoffeeMenu();
            number = inputNumber();
        }
        System.out.println("---- Good Bye ----");
    }

    private static void CoffeeMenu() {
        System.out.println("===== Coffee List =====");
        System.out.println("[1] Thai Coffee ----- 50 Bath");
        System.out.println("[2] Latte       ----- 60 Bath");
        System.out.println("[3] Espresso    ----- 70 Bath");
        System.out.println("[4] Mocha       ----- 80 Bath");
        System.out.println("[5] Cappuccino  ----- 85 Bath");
        System.out.println("[6] Exit");
    }

    private static int inputNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Press number : ");
        int rtNum = sc.nextInt();
        return rtNum;
    }

    private static String inputCoupon() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Discount Code (Don't have please enter 0) : ");
        String s = sc.nextLine();
        return s;
    }
}

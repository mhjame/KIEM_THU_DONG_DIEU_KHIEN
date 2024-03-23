import java.util.Scanner;

public class Main {
    public static long calculateElectricityBill(int kWh) {
        long bill = 0;

        if (kWh <= 50) {
            bill = kWh * 1678;
        } else if (kWh <= 200) {
            bill = 50 * 1678 + (kWh - 50) * 2014;
        } else if (kWh <= 400) {
            bill = 50 * 1678 + 150 * 2014 + (kWh - 200) * 2834;
        } else {
            bill = 50 * 1678 + 150 * 2014 + 200 * 2834 + (kWh - 400) * 2927;
        }

        return bill;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so dien (kWh) trong thang: ");
        int kWh = scanner.nextInt();

        if (kWh < 0 || kWh > 5000) {
            System.out.println("Số điện không hợp lệ.");
            System.exit(1);
        }

        long bill = calculateElectricityBill(kWh);
        System.out.println(bill);
    }
}

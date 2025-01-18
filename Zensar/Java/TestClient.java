package com.abc;

import java.util.Scanner;

public class TestClient {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Select a bank:");
        System.out.println("1. Maharashtra Bank");
        System.out.println("2. Central Bank");
        System.out.println("3. ICICI Bank");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                MaharashtraBank maharashtraBank = new MaharashtraBank();
                maharashtraBank.Deposite();
                maharashtraBank.Withdrow();
                maharashtraBank.Money();
                Bank maharashtraBank1 = new MaharashtraBank();
                maharashtraBank1.OneAbstractMethod();
                break;
            case 2:
                CentralBank centralBank = new CentralBank();
                centralBank.Deposite();
                centralBank.Withdrow();
                centralBank.Money();
                break;
            case 3:
                ICICIBank iciciBank = new ICICIBank();
                iciciBank.Deposite();
                iciciBank.Withdrow();
                iciciBank.Money();
                break;
            default:
                System.out.println("Invalid choice! Please select a valid bank.");
        }
    }
}

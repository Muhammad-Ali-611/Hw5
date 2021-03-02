package NastedClass;

import java.util.Scanner;

public class BuyPlayStation {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("How would you like to buy this game");
        String system = sc.nextLine();
        PlayStation game = new PlayStation();
        sc.close();
    }
}

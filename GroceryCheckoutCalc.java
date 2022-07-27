import java.util.Scanner;

public class GroceryCheckoutCalc{
    public static void main(String[] args) {
        double pearPrice, applePrice, tomatoesPrice, bananaPrice, auberginePrice, totalPrice;
        int pear, apple, tomatoes, banana, aubergine;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter amount of the pears: ");
        pear = sc.nextInt();
        System.out.println("Enter amount of the apple: ");
        apple = sc.nextInt();
        System.out.println("Enter amount of the tomatoes: ");
        tomatoes = sc.nextInt();
        System.out.println("Enter amount of the banana: ");
        banana = sc.nextInt();
        System.out.println("Enter amount of the aubergine: ");
        aubergine = sc.nextInt();

        pearPrice = 2.14 * pear;
        applePrice = 3.67 * apple;
        tomatoesPrice = 1.11 * tomatoes;
        bananaPrice = 0.95 * banana;
        auberginePrice = 5.00 * aubergine;
        totalPrice = pearPrice + applePrice + tomatoesPrice + bananaPrice + auberginePrice;

        System.out.println("\nPrice of pears: " + pearPrice + " TL");
        System.out.println("Price of apple: " + applePrice + " TL");
        System.out.println("Price of tomatoes: " + tomatoesPrice + " TL");
        System.out.println("Price of banana: " + bananaPrice + " TL");
        System.out.println("Price of aubergine: " + auberginePrice + " TL");
        System.out.println("---------------------------");
        System.out.println("Total price: " + totalPrice + " TL");
        System.out.println("---------------------------");
    }
}
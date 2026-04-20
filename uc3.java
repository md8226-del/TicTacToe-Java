import java.util.Scanner;

public class uc3 {

    public static int getPlayerInput() {
        Scanner sc = new Scanner(System.in);
        int slot = sc.nextInt();
        return slot;
    }

    public static void main(String[] args) {
        System.out.println("Enter a slot number (1-9):");
        int slot = getPlayerInput();
        System.out.println("You selected slot: " + slot);
    }
}
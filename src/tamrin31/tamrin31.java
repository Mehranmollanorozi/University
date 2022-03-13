package tamrin31;

import java.util.Scanner;

public class tamrin31 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name");
        String name = scanner.nextLine();
        System.out.println("Enter user name ");
        String username = scanner.nextLine();
        System.out.println("Enter password");
        int password = scanner.nextInt();
        String str = "" + password;
        if (name != null && name.equals("mehran")) {
            System.out.println("equal");
        } else {
            System.out.println("Error name");
        }
        if (username != null && username.equals("mollanorozi")) {
            System.out.println("equal");
        } else {
            System.out.println("Error username");
        }
        if (str != null && str.equals("123")) {
            System.out.println("equal");
        } else {
            System.out.println("Error password");
        }
    }
}

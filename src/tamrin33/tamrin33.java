package tamrin33;

import java.util.Scanner;


public class tamrin33 {
    public static void main(String[] args) {
        int index = -1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a String");
        String str = scanner.nextLine();
        char[] strCharArray = str.toCharArray();
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (strCharArray[i] >= '0' && strCharArray[i] <= '9') {
                count += 1;
            }
        }
        if (count == 0) {
            System.out.println(str.length());
        } else {
            System.out.println("Error.addad vogod darad");
        }
    }
}
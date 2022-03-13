package tamrin32;

import java.util.Scanner;

public class tamrin32 {
        public static void main(String[] args) {
            double x1,x2;
            Scanner scanner=new Scanner(System.in);
            System.out.println("enter a");
            int a=scanner.nextInt();
            System.out.println("enter b");
            int b=scanner.nextInt();
            System.out.println("enter c");
            int c=scanner.nextInt();
            int delta=(b*b)-(4*a*c);
            try {
                if(delta<0){
                    throw new Exception();
                }
                if(delta==0) {
                    x1=(-b+Math.sqrt(delta))/(2*a);
                    System.out.println(x1);
                }
                else {
                    x1=(-b+Math.sqrt(delta))/(2*a);
                    System.out.println(x1);
                    x2=(-b-Math.sqrt(delta))/(2*a);
                    System.out.println(x2);
                }
            } catch (Exception e) {
                System.out.println("moadele javab nadarad");
            }

        }
    }

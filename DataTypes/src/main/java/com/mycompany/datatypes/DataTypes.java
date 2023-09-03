package com.mycompany.datatypes;
import java.util.Scanner;

public class DataTypes {

    public static void main(String[] args) {
        char temp = 'y';
        Scanner myObj = new Scanner(System.in);
        while (temp != 'n' && temp != 'N') {
            System.out.print("Masukkan Angka :");
            String user = myObj.nextLine();
            try {
                long inp = Long.parseLong(user);
                if (inp >= Byte.MIN_VALUE && inp <= Byte.MAX_VALUE) {
                    System.out.println(inp + " Can be fitted in:");
                    System.out.println("* byte\n* short\n* int\n* long");
                } else if (inp >= Short.MIN_VALUE && inp <= Short.MAX_VALUE) {
                    System.out.println(inp + " Can be fitted in:");
                    System.out.println("* short\n* int\n* long");
                } else if (inp >= Integer.MIN_VALUE && inp <= Integer.MAX_VALUE) {
                    System.out.println(inp + " Can be fitted in:");
                    System.out.println("* int\n* long");
                } else {
                    System.out.println(inp + " Can be fitted in:");
                    System.out.println("* long");
                }
            } catch (NumberFormatException e) {
                System.out.println("Can't be fitted anywhere");
            }
            System.out.println("Exit ? (y/n)");
            temp = myObj.nextLine().charAt(0);
        }
    }
}

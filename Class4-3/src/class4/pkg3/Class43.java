
package class4.pkg3;

import java.util.Scanner;

public class Class43 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String num;
        System.out.print("Enter a number: ");
        num = keyboard.nextLine();
        long numTest = Long.parseLong(num);
        int i;
        short s;
        byte b;
        if ((numTest <= Integer.MAX_VALUE) && numTest >= Integer.MIN_VALUE) {
            i = (int)numTest;
            if ((i <= Short.MAX_VALUE) && i >= Short.MIN_VALUE) {
                s = (short)i;
                if ((i <= Byte.MAX_VALUE) && i >= Byte.MIN_VALUE) {
                    b = (byte)s;
                    System.out.println("This number can fit into a byte");
                }
                else {
                    System.out.println("This number can fit into a short");
                }
            }
            else {
                System.out.println("This number can fit into an integer");
            }
        }
        else {
            System.out.println("This number can fit into a long");
        }
    }
    
}

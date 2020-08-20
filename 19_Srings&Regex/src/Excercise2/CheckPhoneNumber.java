package Excercise2;

import java.util.Scanner;

public class CheckPhoneNumber {
    private static PhoneNumberExample phoneNumberExample = new PhoneNumberExample();
    public static String inputPhoneNumber = "";
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        do {
            inputPhoneNumber = scanner.nextLine();
            boolean checkPhoneNumber = phoneNumberExample.validate(inputPhoneNumber);
            System.out.println("phone number: "+ inputPhoneNumber + "Check: " + checkPhoneNumber);
        }while (true);
    }
}

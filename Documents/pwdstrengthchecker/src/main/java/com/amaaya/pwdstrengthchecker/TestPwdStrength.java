package com.amaaya.pwdstrengthchecker;

import com.amaaya.pwdstrengthchecker.model.Result;

import java.util.Scanner;

public class TestPwdStrength {
//A program to test the api...
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;
        while (true)
        {
            System.out.println("Press [c] to Check Password Strength or press [q] to Quit");
            input = scanner.nextLine();
            if ("q".equalsIgnoreCase(input))
            {
                break;
            }
            if ("c".equalsIgnoreCase(input))
            {
                System.out.println("Enter the password: ");
                input = scanner.nextLine();
                //Checking the password strength by making instance of PSC and passing the password as input in checkPass.. function.
                Result result = new PasswordStrengthChecker().checkPasswordStrength(input);
                System.out.println("Password Strength: " + result.getPasswordStrength() + " , Message: "+result.getMessage());
                break;
            }
        }
    }
}

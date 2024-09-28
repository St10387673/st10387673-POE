/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.st10387673;

/**
 *
 * @author RC_Student_lab
 */
public class St10387673 {

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your first name: ");
        String firstName = scanner.nextLine();

        System.out.println("Enter your last name: ");
        String lastName = scanner.nextLine();

        System.out.println("Create your username (max 5 characters, must contain '_'): ");
        String username = scanner.nextLine();

        // Validate username
        while (!isValidUsername(username)) {
            System.out.print("Invalid username. Username must be up to 5 characters and contain an underscore ('_').");
            System.out.println("Create your username again: ");
            username = scanner.nextLine();
        }

        System.out.println("Create your password (max 8 characters, must contain '_'): ");
        String password = scanner.nextLine();

        // Validate password
        while (!isValidPassword(password)) {
            System.out.print("Invalid password. Password must be up to 8 characters and contain an underscore ('_').");
            System.out.println("Create your password again: ");
            password = scanner.nextLine();
        }

        // User successfully created
        System.out.print("User created successfully with Username: " + username + " and Password: " + password);

        System.out.println("Please enter your username to login: ");
        String loginUsername = scanner.nextLine();

        System.out.println("Please enter your password to login: ");
        String loginPassword = scanner.nextLine();

        if (loginUsername.equals(username) && loginPassword.equals(password)) {
            System.out.print("Login successful!");
        } else {
            System.out.print("Login failed! Invalid username or password.");
        }
    }

    // Method to validate username
    private static boolean isValidUsername(String username) {
        return username.contains("_") && username.length() <= 5;
    }

    // Method to validate password
    private static boolean isValidPassword(String password) {
        return password.contains("_") && password.length() <= 8;
    }
}

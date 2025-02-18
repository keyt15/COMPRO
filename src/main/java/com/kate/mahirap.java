package com.kate;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class mahirap {
    static final String FOLDER = "target/message";

    public static void main (String[] args){
        // Create a Scanner object for user input
        Scanner keyt = new Scanner(System.in);

        // Get user's first and last name
        System.out.print("Enter first name: ");
        String name = keyt.nextLine();
        System.out.print("Enter last name: ");
        String lastName = keyt.nextLine();

        System.out.println("Hello " + name + " " + lastName );
        System.out.println();

        // Get two numbers and an operator from the user
        System.out.print("Enter first number: ");
        int num1 = keyt.nextInt();
        System.out.print("Enter operator (+, -, *, /): ");
        char myOperator = keyt.next().charAt(0);
        System.out.print("Enter second number: ");
        int num2 = keyt.nextInt();

        // Perform arithmetic operation based on user input using switch case
        switch (myOperator) {
            case '+':
                int result = num1 + num2;
                System.out.println("The result is: " + result );
                break;
            case '-':
                int result1 = num1 - num2;
                System.out.println("The result is: " + result1 );
                break;
            case '*':
                int result3 = num1 * num2;
                System.out.println("The result is: " +  result3 );
                break;
            case '/':
                // Check for division by zero
                if (num2 == 0) {
                    System.out.println("Error: Division by zero is not allowed.");
                } else {
                    int result4 = num1 / num2;
                    System.out.println( "The result is: " + result4 );
                }
                break;
            default:
                System.out.println("Invalid operator.");
        }

        // Convert kilometers to miles
        System.out.print("\nEnter a distance in km: ");
        double kilometers = keyt.nextDouble();
        double miles = kilometers  * 0.621371;
        System.out.print( kilometers + " km is " + miles + " mi ");
        System.out.println("\n");

        // Print numbers from 1 to 10
        System.out.print("Enter a number: ");
        int number = keyt.nextInt();
        for (int i = 1; i < 11; i++) {
            System.out.println(i + " ");
        }

        // Reverse a word input by the user
        keyt.nextLine(); // Consume the newline character
        System.out.print("\nEnter a word: ");
        String word = keyt.nextLine();
        String reversedWord = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            reversedWord += word.charAt(i);
        }
        System.out.println("The word in reverse order: " + reversedWord);
        System.out.println();

        // Save a message to a file
        System.out.print("Enter a message: ");
        String message = keyt.nextLine();
        System.out.println("The message is saved in target/message.txt");

        saveToFile(name + "message.txt", message);

        // Close the scanner to prevent resource leaks
        keyt.close();
    }

    public static void saveToFile (String fileName, String message) {
        // Create folder if it does not exist
        File folder = new File(FOLDER);
        if (!folder.exists()) {
            folder.mkdirs();
        }

        // Create file and write message
        File messageFile = new File(folder, fileName );
        try (FileWriter fr = new FileWriter(messageFile)){
            fr.write(message);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
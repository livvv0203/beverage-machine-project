package com.jieqing;

public class Main {

    public static void main(String[] args) {

        Console console = new Console();

        do {
            // Show Menu on the Console
            console.displayMenu();
            // Collect the user input
            console.handleInput();
        } while (true);
    }
}

import java.util.Scanner;

public class ForestAdventureGame {

    // Function to print messages with a delay (optional)
    public static void printPause(String message) {
        System.out.println(message);
        try {
            Thread.sleep(1500); // 1.5 second delay for dramatic effect
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    // Game introduction
    public static void intro() {
        printPause("You find yourself standing in a dense, dark forest.");
        printPause("There is a faint path that leads deeper into the forest.");
        printPause("In the distance, you can hear the howls of wolves.");
        printPause("You have a small dagger and a lantern.");
    }

    // First decision
    public static void firstChoice() {
        printPause("What would you like to do?");
        printPause("1. Follow the path deeper into the forest.");
        printPause("2. Try to climb a tree and hide.");

        Scanner scanner = new Scanner(System.in);
        String choice = scanner.nextLine();

        if (choice.equals("1")) {
            pathChoice();
        } else if (choice.equals("2")) {
            treeChoice();
        } else {
            printPause("Please enter a valid choice.");
            firstChoice();
        }
    }

    // Follow the path choice
    public static void pathChoice() {
        printPause("You follow the path deeper into the forest.");
        printPause("Suddenly, a wild wolf jumps out in front of you!");
        printPause("You have a few options:");
        printPause("1. Fight the wolf with your dagger.");
        printPause("2. Run away.");

        Scanner scanner = new Scanner(System.in);
        String choice = scanner.nextLine();

        if (choice.equals("1")) {
            fightWolf();
        } else if (choice.equals("2")) {
            runAway();
        } else {
            printPause("Please enter a valid choice.");
            pathChoice();
        }
    }

    // Fight the wolf scenario
    public static void fightWolf() {
        printPause("You bravely take out your dagger and fight the wolf.");
        printPause("After a fierce battle, you manage to defeat the wolf!");
        printPause("You continue down the path and find a small village where you're safe.");
        printPause("Congratulations, you survived the forest!");
    }

    // Run away from the wolf scenario
    public static void runAway() {
        printPause("You try to run away, but the wolf is too fast!");
        printPause("The wolf catches up to you, and you have no choice but to fight.");
        printPause("Unfortunately, the wolf is too strong, and you don't survive the encounter.");
        printPause("Game over.");
    }

    // Climb the tree scenario
    public static void treeChoice() {
        printPause("You quickly climb a nearby tree to hide.");
        printPause("After a few minutes, the wolves pass by without noticing you.");
        printPause("You climb down safely and decide to leave the forest.");
        printPause("You survived! Congratulations!");
    }

    // Main function to start the game
    public static void main(String[] args) {
        intro();
        firstChoice();
    }
}
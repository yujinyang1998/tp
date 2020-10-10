package seedu.duke;

import profile.ProfileManager;

import static profile.components.Constants.SCANNER;

/**
 * The Schwarzenegger program implements an application that keeps track of the user's gym and diet record.
 */
public class Duke {

    /**
     * Main entry-point for the java.duke.Duke application.
     *
     * @param args Unused in Duke.
     */
    public static void main(String[] args) {
        new Duke().run();
    }

    /**
     * Runs Schwarzenegger.
     */
    private void run() {
        System.out.println("Which session do you want to enter?");
        String session = SCANNER.nextLine().toLowerCase();

        if (session.equals("profile")) {
            System.out.println("Entering Profile Session...");

            ProfileManager profileManager = new ProfileManager();

            while (!profileManager.hasExit) {
                profileManager.run();
            }
        }

        System.out.println("back");
    }
}


import java.io.*;
import java.util.Scanner;

public class NotesApp {
    private static final String FILE_NAME = "notes.txt";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n=======================");
            System.out.println("        Notes App");
            System.out.println("=======================");
            System.out.println("1. Add a Note");
            System.out.println("2. View All Notes");
            System.out.println("3. Exit");
            System.out.print("Enter your choice (1-3): ");

            int choice;
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number between 1 and 3.");
                continue;
            }

            switch (choice) {
                case 1 -> addNote(scanner);
                case 2 -> viewNotes();
                case 3 -> {
                    System.out.println("Exiting the application. Thank you!");
                    scanner.close();
                    return;
                }
                default -> System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void addNote(Scanner scanner) {
        System.out.print("\nEnter your note: ");
        String note = scanner.nextLine();

        try (FileWriter fw = new FileWriter(FILE_NAME, true)) {
            fw.write(note + System.lineSeparator());
            System.out.println("Note saved successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while saving the note.");
            e.printStackTrace();
        }
    }

    private static void viewNotes() {
        System.out.println("\n--- Your Notes ---");

        try (BufferedReader br = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            boolean isEmpty = true;
            while ((line = br.readLine()) != null) {
                System.out.println("- " + line);
                isEmpty = false;
            }
            if (isEmpty) {
                System.out.println("No notes found.");
            }
        } catch (FileNotFoundException e) {
            System.out.println("No notes file found. Please add a note first.");
        } catch (IOException e) {
            System.out.println("An error occurred while reading the notes.");
            e.printStackTrace();
        }
    }
}

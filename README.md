# NotesApp

A simple command-line Java application to create and view personal notes using a text file.

## Features

* Add new notes
* View all saved notes
* Data persistence using `notes.txt` file
* Input validation and basic error handling

## How It Works

The application provides a simple text-based menu:

1. **Add a Note**: Allows the user to input a new note, which gets saved to `notes.txt`.
2. **View All Notes**: Displays all the notes saved in `notes.txt`.
3. **Exit**: Closes the application.

All notes are stored line by line in a text file called `notes.txt`.


## How to Run

1. Compile the code:

```bash
javac NotesApp.java
```

2. Run the application:

```bash
java NotesApp
```

## Code Structure

* `NotesApp.java`: Main class containing the logic to add and view notes.

## File Storage

* Notes are stored in a local file named `notes.txt` in the same directory as the application.
* Each note is saved as a new line.

## Error Handling

* Handles invalid menu choices
* Catches and displays errors during file read/write operations
* Ensures graceful exit when the user chooses to quit

## Example Usage

```
=======================
        Notes App
=======================
1. Add a Note
2. View All Notes
3. Exit
Enter your choice (1-3): 1

Enter your note: Buy groceries
Note saved successfully.
```


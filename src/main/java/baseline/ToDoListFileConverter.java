/*
 *  UCF COP3330 Fall 2021 Application Assignment 1 Solution
 *  Copyright 2021 Miguel Rosario
 */
package baseline;

import java.io.File;
import java.util.List;

public class ToDoListFileConverter {

    public List<ToDoList> loadListsFromFile(File savedLists) {
        // Create a temporary List of ToDoLists.
        // Open the file at the location savedLists.
        // Loop through the file until you reach EOF.
            // Every line should contain the information of a list in this order:
                // Title.
                // Number of items.
                // Item 1 description, item 1 due date, item 1 completion status.
                // Repeat for all items.
            // For each set of information create a new ToDoList with the information given and add to the temp list.
        // Return the temp list.
        return null;
    }

    public String saveListsToFileString(List<ToDoList> listsToSave) {
        // Create a new StringBuilder object.
        // Loop through the ToDoList.
            // Add the toString of each ToDoList to the StringBuilder.
        // Return the completed String.
        return null;
    }
}

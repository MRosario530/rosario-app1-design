/*
 *  UCF COP3330 Fall 2021 Application Assignment 1 Solution
 *  Copyright 2021 Miguel Rosario
 */
package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ToDoListFileConverterTest {

    @Test
    void testLoadListsFromFile() {
        // Create a text file for testing and have the text be as follows:
            // "ActualResult
            // 1
            // Test Description,2022-05-30,true"
        // Create an item with the parameters:
            // Description: "Test Description"
            // Due Date: "2022-05-30"
            // isComplete: true
        // Create a ToDoListFileConverter object.
        // Create a File object and path it to the text file above.
        // Create a List of ToDoList and call loadListsFromFile using the File object
        // Use assertequals to compare the item at index 0 of the list with the created item.
    }

    @Test
    void testSaveListsToFileString() {
        // Create a List of ToDoList with a single ToDoList within it.
        // Give the ToDoList two items with the parameters:
            // Description: "Test Description"
            // Due Date: "2022-05-30"
            // isComplete: true
        //
            // Description: "Second Test"
            // Due Date: "2021-12-30"
            // isComplete: false
        // Create a ToDoListFileConverter object.
        // Call the saveListsToFileString method on the List of ToDoList.
        // Use assertEquals to compare the string created by the method with:
            // "ActualResult
            // 2
            // Test Description,2022-05-30,true
            // Second Test, 2021-12-30,false"
    }
}
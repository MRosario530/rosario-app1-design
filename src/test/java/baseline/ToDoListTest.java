/*
 *  UCF COP3330 Fall 2021 Application Assignment 1 Solution
 *  Copyright 2021 Miguel Rosario
 */
package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ToDoListTest {

    @Test
    void testAddToList() {
        // Create a ToDoList object with the title ActualResult.
        // Call addToList("Test", "2022-05-30", true)
        // Create an item with the same parameters and compare the item to the first index of the ToDoList object's
        // List of items.
    }

    @Test
    void testGetCompleteThingsToDo() {
        // Create a ToDoList object with the title ActualResult.
        // Add three items to the ToDoList with 2 complete items and 1 incomplete item.
        // Call getCompleteThingsToDo and set the result equal to a new List of items.
        // Loop through the new list with a boolean and if any of them have isComplete as false change the boolean to
        // false.
        // Use the assert method to verify if the boolean is true.
    }

    @Test
    void testGetIncompleteThingsToDo() {
        // Create a ToDoList object with the title ActualResult.
        // Add three items to the ToDoList with 2 complete items and 1 incomplete item.
        // Call getCompleteThingsToDo and set the result equal to a new List of items.
        // Loop through the new list with a boolean and if any of them have isComplete as true change the boolean to
        // false.
        // Use the assert method to verify if the boolean is true.
    }

    @Test
    void testDeleteItem() {
        // Create a ToDoList object with the title ActualResult.
        // Call addToList("Test", "2022-05-30", true)
        // Call addToList("Test", "2022-05-30", false)
        // Create an item with the parameters "Test", "2022-05-30", true .
        // Call deleteItem on the above item.
        // Use the assert method to verify the first item of the list does not equal the deleted item.
    }

    @Test
    void testToString() {
        // Create a ToDoList object with the title ActualResult.
        // Call addToList("Test", "2022-05-30", true)
        // Create a testResult string and give it the value:
            // "ActualResult
            // 1
            // Test Description,2022-05-30,true"
        // Use the assert method to compare the string above with the toString of the ToDoList object.
    }
}
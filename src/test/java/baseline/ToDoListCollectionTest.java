/*
 *  UCF COP3330 Fall 2021 Application Assignment 1 Solution
 *  Copyright 2021 Miguel Rosario
 */
package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ToDoListCollectionTest {

    @Test
    void testAddList() {
        // Create a ToDoListCollection object.
        // Create one ToDoList and add it using the addList method.
        // Use the assert method to test if the ToDoList in the object is equal to the one
        // created outside of the object.
    }

    @Test
    void testAddItem() {
        // Create a ToDoListCollection object.
        // Create one ToDoList and add it to the object.
        // Create an item object.
        // Call the addItem method using the ToDoList and the Item created above as parameters.
        // Use the assert method to test if the item in the ToDoList within the ToDoListCollection is equal to the one
        // created outside of the object.
    }

    @Test
    void testDeleteList() {
        // Create a ToDoListCollection object.
        // Create two ToDoLists and add them to the object.
        // Create a ToDoList object of the second ToDoList for comparison.
        // Call the deleteMethod on the list at index 0.
        // Use the assert method to test if the ToDoList in the object is equal to the one
        // created outside of the object.
    }

    @Test
    void testDeleteItem() {
        // Create a ToDoListCollection object.
        // Create one ToDoList and add it to the object.
        // Create an item object.
        // Call the addItem method using the ToDoList and the Item created above as parameters.
        // Call the deleteItem method using the ToDoList and the Item created above as parameters.
        // Use the assert method to test if the size of the ToDoList within the ToDoListCollection is equal to 0.
    }
}
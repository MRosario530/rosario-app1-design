/*
 *  UCF COP3330 Fall 2021 Application Assignment 1 Solution
 *  Copyright 2021 Miguel Rosario
 */
package baseline;

import java.util.List;

public class ToDoList {
    private String title;
    private List<Item> thingsToDo;
    private int numOfItems;

    public ToDoList(String title) {
        // Create a new ToDoList and assign the parameter title to the instance variable.
        // set the numOfItems to 0.
    }

    public void setTitle(String title) {
        // Set the title of the ToDoList.
    }

    public String getTitle() {
        // Return the title of the list.
        return "";
    }

    public int getNumOfItems() {
        // Return the numOfItems.
        return 0;
    }

    public List<Item> getThingsToDo() {
        // Get the entire list of items in this current toDoList.
        return null;
    }

    public void addToList(String description, String dueDate, boolean complete) {
        // Create an item object using the 3 parameters.
        // Add the item to the List thingsToDo.
        // Increase item count by 1.
    }

    public List<Item> getCompleteThingsToDo() {
        // Create a new list.
        // Loop through the thingsToDo list and add all completed things to the list.
        // Return the new list.
        return null;
    }

    public List<Item> getIncompleteThingsToDo() {
        // Create a new list.
        // Loop through the thingsToDo list and add all incomplete things to the list.
        // Return the new list.
        return null;
    }

    public void deleteItem(Item selectedItem) {
        // Delete the item in the parameter from the ToDoList.
    }

    public String toString() {
        // Create a stringbuilder.
        // First put the title.
        // Then the number of items.
        // Loop through the arraylist, adding each item's toString followed by a newline.
        // Return the stringbuilder as a string.
        return "";
    }
}

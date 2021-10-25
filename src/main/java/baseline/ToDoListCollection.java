/*
 *  UCF COP3330 Fall 2021 Application Assignment 1 Solution
 *  Copyright 2021 Miguel Rosario
 */
package baseline;

import java.util.List;

public class ToDoListCollection {
    private List<ToDoList> masterList;

    public ToDoListCollection() {
        // Default Constructor.
    }

    public List<ToDoList> getMasterList() {
        // Getter for the entire collection of ToDoLists.
        return null;
    }

    public void addList(ToDoList newList) {
        // Add a new ToDoList to the List masterList.
    }

    public void addItem(ToDoList list, Item itemToAdd) {
        // Add a new item to the selected ToDoList using the addToList method.
    }

    public void deleteList(ToDoList listToDelete) {
        // Remove the selected list from the masterList.
    }

    public void deleteItem(ToDoList list, Item itemToDelete) {
        // Call the ToDoList's deleteItem method.
    }
}

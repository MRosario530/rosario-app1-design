/*
 *  UCF COP3330 Fall 2021 Application Assignment 1 Solution
 *  Copyright 2021 Miguel Rosario
 */
package baseline;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.util.List;

public class ApplicationController {

    @FXML
    private ToDoListCollection masterList;

    @FXML
    private Button addItemButton;

    @FXML
    private TableView<ToDoList> allListTable;

    @FXML
    private TableColumn<ToDoList, String> titleCol;

    @FXML
    private TableColumn<ToDoList, Integer> itemNumCol;

    @FXML
    private TableColumn<ToDoList, Integer> incompleteItemCol;

    @FXML
    private Button changeTitleButton;

    @FXML
    private CheckBox completeCheckbox;

    @FXML
    private Button createListButton;

    @FXML
    private TableView<ToDoList> currentListTable;

    @FXML
    private TableColumn<Item, String> descriptionCol;

    @FXML
    private TableColumn<Item, String> dueDateCol;

    @FXML
    private TableColumn<Item, Boolean> completionCol;

    @FXML
    private DatePicker dateEntryBox;

    @FXML
    private Button deleteItemButton;

    @FXML
    private Button deleteListButton;

    @FXML
    private TextArea descriptionEntryBox;

    @FXML
    private Button displayAllItemsButton;

    @FXML
    private Button displayCompleteButton;

    @FXML
    private Button displayIncompleteButton;

    @FXML
    private Button editItemButton;

    @FXML
    private Button loadListFromFileButton;

    @FXML
    private Button saveListToFileButton;

    @FXML
    private TextField titleEntryBox;

    @FXML
    private void onAddItemPressed(ActionEvent event) {
        // Get the data from the descriptionEntry text area.
        // Get the data from the dueDate date picker.
        // Get the data from the completion check box.
        // Get the currently selected list from the allLists tableview.
        // If only one list is selected:
            // Create a new item and add it to the selected ToDoList.
            // Refresh both tableviews.
    }

    @FXML
    private void onChangeCurrentListPressed(ActionEvent event) {
        // Get the data from the listEntry box.
        // If only one list is selected and the given data is at least 3 letters.
            // Update the list title of the selected ToDoList using setTitle.
            // Refresh the allLists tableview.
    }

    @FXML
    private void onCreateListPressed(ActionEvent event) {
        // Get the data from the listEntry box.
        // If the given data is at least 3 letters:
            // Create a new empty ToDoList with the title the user inputted.
    }

    @FXML
    private void onDeleteItemPressed(ActionEvent event) {
        // Get the currently selected item(s) from the currentLists tableview.
            // Remove all selected items from the ToDoLists they belong to and refresh the tableviews.
    }

    @FXML
    private void onDeleteListPressed(ActionEvent event) {
        // Get the currently selected lists(s) from the allLists tableview.
            // Remove all selected lists from the masterList and refresh the tableviews.
    }

    @FXML
    private void onDisplayAllPressed(ActionEvent event) {
        // Create a new List of ToDoLists.
        // Get all currently selected ToDoLists from the allLists table.
            // Refresh the currentListTable to display all items from the new List.
    }

    @FXML
    private void onDisplayCompletedPressed(ActionEvent event) {
        // Create a new List of ToDoLists.
        // Get all currently selected ToDoLists from the allLists table.
        // Create a List of items.
            // For each ToDoList, call the ToDoLists getCompleteThingsToDo method and add it to the list of items.
        // Refresh the currentListTable to display all items from the new list.
    }

    @FXML
    private void onDisplayIncompletedPressed(ActionEvent event) {
        // Create a new List of ToDoLists.
        // Get all currently selected ToDoLists from the allLists table.
        // Create a List of items.
            // For each ToDoList, call the ToDoLists getIncompleteThingsToDo method and add it to the list of items.
        // Refresh the currentListTable to display all items from the new list.
    }

    @FXML
    private void onEditItemPressed(ActionEvent event) {
        // Get the data from the descriptionEntry text area.
        // Get the data from the dueDate date picker.
        // Get the data from the completion check box.
        // Get the currently selected item from the currentLists tableview.
        // If only one item is selected:
            // Edit the selected item with the new parameters using the proper setters.
            // Refresh both tableviews.
    }

    @FXML
    private void onLoadListPressed(ActionEvent event) {
        // Create a filechooser and open the dialog window for it to get the file location.
            // Set an extension filter for only .txt files.
        // Get the file location and call the ToDoListCollection loadListsFromFile method.
        // Get the List of ToDoLists from the previous line and add them to the masterList.
    }

    @FXML
    private void onSaveListPressed(ActionEvent event) {
        // Get the currently selected ToDoLists from the allLists tableview.
        // Create a List of all currently selected ToDoLists.
        // Create a string and call the ToDoListCollection saveListsToFileString method.
        // Create a filechooser and open the dialog window for it to get the file location.
        // Create a printwriter to that file location with the string above provided there is no errors.
    }

    @FXML
    public void initialize() {
        // To be honest I don't really know what this does I just assumed I needed an initialize method.
        // Initialize the masterList.
    }
}
package baseline;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TableView;
import javafx.scene.layout.VBox;

public class FXMLController implements Initializable {
    @FXML
    private VBox navigationBox = new VBox();

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        navigationBox.getStyleClass().add("navBox");

    }
}